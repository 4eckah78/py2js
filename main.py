import sys
from antlr4 import *
from antlr4.tree.Tree import TerminalNodeImpl
from py2jsLexer import py2jsLexer
from py2jsParser import py2jsParser
from py2jsVisitor import *
from py2jsVisitor import py2jsVisitor


def getIdentation(ctxLevel):
    return " "*(ctxLevel * 4)

class Visitor(py2jsVisitor):
    def __init__(self) -> None:
        self.contextLevel = 0
        super().__init__()

    def visitStart(self, ctx:py2jsParser.StartContext):
        jsLines = []
        if ctx.commentText():
            for i in range(len(ctx.commentText())):
                jsLines.append(self.visit(ctx.commentText(i)))
        if ctx.variableDeclarations():
            jsLines.append(self.visit(ctx.variableDeclarations()))
        if ctx.methodDeclarations():
            jsLines.append(self.visit(ctx.methodDeclarations()))
        return '\n'.join(jsLines)


    def visitVariableDeclarations(self, ctx:py2jsParser.VariableDeclarationsContext):
        js_lines = []
        for i in range(len(ctx.globalVariableDeclaration())):
            js_lines.append(self.visit(ctx.globalVariableDeclaration(i)))
        if len(ctx.commentText()) > 0:
            for i in range(len(ctx.commentText())):
                js_lines.append(self.visit(ctx.commentText(i)))
        return '\n'.join(js_lines )


    def visitMethodDeclarations(self, ctx:py2jsParser.MethodDeclarationsContext):
        js_methods = []
        for i in range(len(ctx.methodDeclaration())):
            js_methods.append(self.visit(ctx.methodDeclaration(i)))
        return '\n'.join(js_methods)
    

    def visitMethodDeclaration(self, ctx:py2jsParser.MethodDeclarationContext):
        jsMethodHeader = getIdentation(self.contextLevel) + self.visit(ctx.methodHeader())
        self.contextLevel += 1
        jsMethodBody = self.visit(ctx.methodBody())
        if 'yield' in jsMethodBody:
            jsMethodHeader = jsMethodHeader[:8] + "*" + jsMethodHeader[8:]
        cmnts = []
        if ctx.commentText():
            for i in range(len(ctx.commentText())):
                cmnts.append(self.visit(ctx.commentText(i)))
        cmnts = '\n'.join(cmnts)
        return f"\n{jsMethodHeader}\n{jsMethodBody}\n{getIdentation(self.contextLevel)}}}\n{cmnts}\n"  


    def visitGlobalVariableDeclaration(self, ctx:py2jsParser.GlobalVariableDeclarationContext):
        varName = ctx.variableName().getText()
        varValue = self.visit(ctx.expr())
        js_cmnt = ""
        if ctx.commentText():
            js_cmnt += self.visit(ctx.commentText())
        return f"var {varName} = {varValue}; {js_cmnt}"
    

    def visitMethodHeader(self, ctx: py2jsParser.MethodHeaderContext):
        name = ctx.methodName().getText()
        parameters = self.visit(ctx.parameters())
        js_cmnt = ""
        if ctx.commentText():
            js_cmnt += self.visit(ctx.commentText())
        return f"function {name}({parameters}) {{ {js_cmnt}" 


    def visitParameters(self, ctx:py2jsParser.ParametersContext):
        if ctx.typedargslist():
            return f"{self.visit(ctx.typedargslist())}"
        else:
            return ""
    

    def visitTypedargslist(self, ctx:py2jsParser.TypedargslistContext):
        args = ""
        for child in ctx.children:
            if type(child) is not TerminalNodeImpl:
                args += self.visit(child)
            else:
                symbol = child.getText()
                ws = ''
                if symbol == '=':
                    ws = ' '
                args += ws + child.getText() + ' '
        return args
    

    def visitArg(self, ctx:py2jsParser.ArgContext):
        return self.visitChildren(ctx)
    

    def visitVariableName(self, ctx:py2jsParser.VariableNameContext):
        return ctx.getText()
    

    def visitMethodBody(self, ctx: py2jsParser.MethodBodyContext):
        jsLines = []
        for i in range(len(ctx.statement())):
            jsLines.append(getIdentation(self.contextLevel) + self.visit(ctx.statement(i)))
        self.contextLevel -= 1
        return '\n'.join(jsLines)
    

    def visitStatement(self, ctx: py2jsParser.StatementContext):
        js_str = ""
        if ctx.commentText():
            js_str += '\n' + getIdentation(self.contextLevel) + self.visit(ctx.commentText())
        return self.visit(ctx.emdeddedStatement()) + js_str


    def visitEmdeddedStatement(self, ctx:py2jsParser.EmdeddedStatementContext):
        return self.visitChildren(ctx)
    

    def visitMethodCall(self, ctx:py2jsParser.MethodCallContext):
        name = ctx.methodName().getText()
        parameters = self.visit(ctx.parameters())
        if name == "len":
            return f"{parameters}.length;" 
        elif name == "list":
            return f"Array.from{parameters}" 
        elif name == "print":
            name = "console.log"
        return f"{name}({parameters});" 


    def visitIfStatement(self, ctx:py2jsParser.IfStatementContext):
        jsExpr = self.visit(ctx.expr())
        self.contextLevel += 1
        ifbody = self.visit(ctx.methodBody()) + '\n' + getIdentation(self.contextLevel) + '}'
        js_str =  f"if ({jsExpr}) {{\n{ifbody}\n"
        elifSts = ""
        elseSt = ""
        if len(ctx.elifStatement()) > 0:
            elifSts = []
            for i in range(len(ctx.elifStatement())):
                elifSts.append(self.visit(ctx.elifStatement(i)))
            elifSts = "\n".join(elifSts) + "\n"
        if ctx.elseStatement():
            elseSt = self.visit(ctx.elseStatement())
        return js_str + elifSts + elseSt
    

    def visitElseStatement(self, ctx:py2jsParser.ElseStatementContext):
        self.contextLevel += 1
        body = self.visit(ctx.methodBody())
        return getIdentation(self.contextLevel) + "else {\n" + body + '\n' + getIdentation(self.contextLevel) + '}'
    

    def visitElifStatement(self, ctx:py2jsParser.ElifStatementContext):
        self.contextLevel += 1
        expr = "(" + self.visit(ctx.expr()) + ")"
        body = self.visit(ctx.methodBody())
        return getIdentation(self.contextLevel) +"else if " + expr + "{\n" + body + '\n' + getIdentation(self.contextLevel) + '}'
    

    def visitContinueStatement(self, ctx:py2jsParser.ContinueStatementContext):
        return ctx.getText() + ";"


    def visitReturnStatement(self, ctx:py2jsParser.ReturnStatementContext):
        res = self.visit(ctx.expr())   
        return f"return {res};"
    

    def visitYieldStatement(self, ctx:py2jsParser.YieldStatementContext):
        res = self.visit(ctx.unaryExpr())   
        return f"yield {res};"


    def visitBreakStatement(self, ctx:py2jsParser.BreakStatementContext):
        return ctx.getText() + ";"


    def visitWhileStatement(self, ctx:py2jsParser.WhileStatementContext):
        self.contextLevel += 1
        jsMethodBody = self.visit(ctx.methodBody()) + '\n' + getIdentation(self.contextLevel) + '}'
        jsExpr = self.visit(ctx.expr())
        return f"while ({jsExpr}) {{\n" + jsMethodBody
    

    def visitArrayStatement(self, ctx:py2jsParser.ArrayStatementContext):
        expr = ""
        for child in ctx.children:
            if type(child) is not TerminalNodeImpl:
                expr += self.visit(child)
            else:
                symbol = child.getText()
                ws = ''
                if symbol == '=':
                    ws = ' '
                expr += ws + child.getText() + ws
        return expr + ";"


    def visitForStatement(self, ctx:py2jsParser.ForStatementContext):
        counter = ctx.variableName().getText()
        begin = 0
        end = 0
        step = 1
        a = len(ctx.variableValueList().children)
        if len(ctx.variableValueList().children) == 3:
            begin = self.visit(ctx.variableValueList().children[0])
            end = self.visit(ctx.variableValueList().children[2])
        elif len(ctx.variableValueList().children) == 5:
            begin = self.visit(ctx.variableValueList().children[0])
            end = self.visit(ctx.variableValueList().children[2])
            step = self.visit(ctx.variableValueList().children[4])
        else:
            end = self.visit(ctx.variableValueList().children[0])
        js_lines = []
        if step != 1:
            js_lines = [f"for (let {counter} = {begin}; {counter} < {end}; {counter}+={step}) {{"] 
        else:
            js_lines = [f"for (let {counter} = {begin}; {counter} < {end}; {counter}++) {{"] 
        self.contextLevel += 1
        js_lines.append(self.visit(ctx.methodBody()) + '\n' + getIdentation(self.contextLevel) + '}')
        return '\n'.join(js_lines)
    

    def visitVariableValueList(self, ctx:py2jsParser.VariableValueListContext):
        elements= ""
        for child in ctx.children:
            if type(child) is not TerminalNodeImpl:
                elements += self.visit(child)
            else:
                elements += child.getText()
                elements += ' '
        return elements


    def visitExpr_list(self, ctx:py2jsParser.Expr_listContext):
        return self.visitChildren(ctx)


    def visitUnoExpr(self, ctx:py2jsParser.UnoExprContext):
        return self.visitChildren(ctx)
    

    def visitListval(self, ctx:py2jsParser.ListvalContext):
        elements = ""
        for child in ctx.children:
            if type(child) is not TerminalNodeImpl:
                elements += self.visit(child)
            else:
                elements += child.getText()
                if child.getText() != '[': elements +=' '
        return elements.rstrip( )


    def visitOrop(self, ctx:py2jsParser.OropContext):
        left = self.visit(ctx.children[0])
        right = self.visit(ctx.children[2])
        return f"({left}) {'||'} ({right})"


    def visitComparisop(self, ctx:py2jsParser.ComparisopContext):
        left = self.visit(ctx.children[0])
        op = ctx.children[1].getText()
        right = self.visit(ctx.children[2])
        return f"{left} {op} {right}"


    def visitBracketsop(self, ctx:py2jsParser.BracketsopContext):
        expr = self.visit(ctx.expr())
        return f"({expr})"
    

    def visitBracketsval(self, ctx:py2jsParser.BracketsvalContext):
        expr = self.visit(ctx.expr())
        return f"({expr})"


    def visitBitmulop(self, ctx:py2jsParser.BitmulopContext):
        left = self.visit(ctx.children[0])
        op = ctx.children[1].getText()
        right = self.visit(ctx.children[2])
        return f"{left} {op} {right}"


    def visitAndop(self, ctx:py2jsParser.AndopContext):
        left = self.visit(ctx.children[0])
        right = self.visit(ctx.children[2])
        return f"({left}) {'&&'} ({right})"


    def visitMulop(self, ctx:py2jsParser.MulopContext):
        left = self.visit(ctx.children[0])
        op = ctx.children[1].getText()
        right = self.visit(ctx.children[2])
        return f"{left} {op} {right}"


    def visitUnoop(self, ctx:py2jsParser.UnoopContext):
        op = ctx.children[0].getText()
        if op == 'not':
            op = '!'
        right = self.visit(ctx.children[1])
        return f"{op}{right}"
    

    def visitXorop(self, ctx:py2jsParser.XoropContext):
        left = self.visit(ctx.children[0])
        op = ctx.children[1].getText()
        right = self.visit(ctx.children[2])
        return f"{left} {op} {right}"


    def visitAssignop(self, ctx:py2jsParser.AssignopContext):
        return self.visitChildren(ctx)


    def visitDeg(self, ctx:py2jsParser.DegContext):
        left = self.visit(ctx.children[0])
        op = ctx.children[1].getText()
        right = self.visit(ctx.children[2])
        return f"{left} {op} {right}"


    def visitSumop(self, ctx:py2jsParser.SumopContext):
        left = self.visit(ctx.children[0])
        op = ctx.children[1].getText()
        right = self.visit(ctx.children[2])
        return f"{left} {op} {right}"


    def visitArrowsop(self, ctx:py2jsParser.ArrowsopContext):
        left = self.visit(ctx.children[0])
        op = ctx.children[1].getText()
        right = self.visit(ctx.children[2])
        return f"{left} {op} {right}"


    def visitVarname(self, ctx:py2jsParser.VarnameContext):
        return self.visitChildren(ctx)


    def visitArrcall(self, ctx:py2jsParser.ArrcallContext):
        name = self.visit(ctx.variableName())
        expr = self.visit(ctx.expr())
        return f"{name}[{expr}]"


    def visitFuncall(self, ctx:py2jsParser.FuncallContext):
        methodName = ctx.variableName().getText()
        parameters = self.visit(ctx.parameters())
        if methodName == "len":
            return f"{parameters}.length" 
        elif methodName == "list":
            return f"Array.from{parameters}" 
        elif methodName == "print":
            methodName = "console.log"
        return f"{methodName}({parameters})"


    def visitBoolval(self, ctx:py2jsParser.BoolvalContext):
        return ctx.getText().lower()


    def visitNumval(self, ctx:py2jsParser.NumvalContext):
        return ctx.getText()


    def visitStrval(self, ctx:py2jsParser.StrvalContext):
        return ctx.getText()


    def visitAssign(self, ctx:py2jsParser.AssignContext):
        elements = ''
        for child in ctx.children:
            if type(child) is not TerminalNodeImpl:
                elements += self.visit(child)
            else:
                elements += child.getText()
            elements += ' '
        if not ctx.augassign():
            elements = 'let ' + elements
        return elements.rstrip( ) + ';'


    def visitAugassign(self, ctx:py2jsParser.AugassignContext):
        return ctx.getText()


    def visitUnaryExpr(self, ctx:py2jsParser.UnaryExprContext):
        a = self.visitChildren(ctx)
        return self.visitChildren(ctx)


    def visitCommentText(self, ctx:py2jsParser.CommentTextContext):
        return f"// {ctx.getText().lstrip(' #').rstrip()}"
    

def add_brackets(inputfile, outputfile):
    with open(inputfile, 'r') as input:
        t = 0
        lines = [line for line in input.readlines() if line != '\n']
        for i in range(len(lines)):
            tab = lines[i].count('    ')

            if tab > t:
                t += 1
                lines[i-1] = lines[i-1] +'    '*(t - 1) + '{\n'

            elif tab < t:
                diff = t - tab
                for _ in range(diff):
                    t -= 1
                    lines[i-1] = lines[i-1] + '    '*t + '}' + '\n'

    
    with open(outputfile, "w") as output:
        output.write(''.join(lines))



def main(argv):
    # input_stream = FileStream(argv[1])
    input_file = "./pyprogram.py"
    new_file = "new_pyprogram.py"
    add_brackets(input_file, new_file)
    py_code = FileStream(new_file)
    # py_code = InputStream('Bob says "hello" \n Alice says "hi"')
    lexer = py2jsLexer(py_code)
    stream = CommonTokenStream(lexer)
    parser = py2jsParser(stream)
    tree = parser.start()
    visitor = Visitor()
    print("TREE: ------------------------------")
    print(tree.toStringTree(parser.ruleNames))
    js_code = visitor.visit(tree)
    with open("jsprogram.js", "w") as f:
        f.write(js_code)

if __name__ == '__main__':
    main(sys.argv)
