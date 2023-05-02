import sys
from antlr4 import *
from py2jsLexer import py2jsLexer
from py2jsParser import py2jsParser
from py2jsVisitor import *


def getIdentation(ctxLevel):
    return " "*(ctxLevel * 4)

class Visitor(py2jsVisitor):
    def __init__(self) -> None:
        self.contextLevel = 0
        super().__init__()

    def visitStart(self, ctx: py2jsParser.StartContext):
        return self.visit(ctx.methodDeclarations())
        
    def visitMethodDeclarations(self, ctx: py2jsParser.MethodDeclarationsContext):
        js_methods = []
        for i in range(len(ctx.methodDeclaration())):
            js_methods.append(getIdentation(self.contextLevel) + self.visit(ctx.methodDeclaration(i)))
        return '\n'.join(js_methods)

    def visitMethodDeclaration(self, ctx:py2jsParser.MethodDeclarationContext):
        jsMethodHeader = getIdentation(self.contextLevel) + self.visit(ctx.methodHeader())
        self.contextLevel += 1
        jsMethodBody = self.visit(ctx.methodBody())
        return f"{jsMethodHeader}\n{jsMethodBody} \n}}\n"  
    
    def visitMethodBody(self, ctx: py2jsParser.MethodBodyContext):
        jsLines = []
        for i in range(len(ctx.statement())):
            jsLines.append(getIdentation(self.contextLevel) + self.visit(ctx.statement(i)))
        self.contextLevel -= 1
        return '\n'.join(jsLines)
    
    def visitCommentText(self, ctx: py2jsParser.CommentTextContext):
        return f"// {ctx.getText().lstrip(' #')}"
    
    def visitStatement(self, ctx: py2jsParser.StatementContext):
        js_str = ""
        if ctx.commentText():
            js_str = f" // {ctx.commentText().getText().lstrip(' #')}"
        return self.visit(ctx.emdeddedStatement()) + js_str
    
    def visitMethodHeader(self, ctx: py2jsParser.MethodHeaderContext):
        return f"function {ctx.methodName().getText()}() {{"
    
    def visitLocalVariableDeclaration(self, ctx: py2jsParser.LocalVariableDeclarationContext):
        varName = ctx.variableName().getText()
        varValue = ctx.variableValue().getText()
        if varValue == "True" or varValue == 'False':
            varValue = varValue.lower()
        return f"let {varName} = {varValue};"

    def visitMethodCall(self, ctx: py2jsParser.MethodCallContext):
        methodName = ctx.methodName().getText()
        return f"{methodName}();"
    


def main(argv):
    # input_stream = FileStream(argv[1])
    py_code = FileStream("./pyprogram.txt")
    # py_code = InputStream('Bob says "hello" \n Alice says "hi"')
    lexer = py2jsLexer(py_code)
    stream = CommonTokenStream(lexer)
    parser = py2jsParser(stream)
    tree = parser.start()
    visitor = Visitor()
    js_code = visitor.visit(tree)
    print(tree.toStringTree(parser.ruleNames))
    with open("jsprogram.js", "w") as f:
        f.write(js_code)
    
    # htmlChat = py2jsListener(output)
    # walker = ParseTreeWalker()
    # walker.walk(htmlChat, tree)
        
    # output.close()     
 
if __name__ == '__main__':
    main(sys.argv)


    
