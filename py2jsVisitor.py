# Generated from py2js.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .py2jsParser import py2jsParser
else:
    from py2jsParser import py2jsParser

# This class defines a complete generic visitor for a parse tree produced by py2jsParser.

class py2jsVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by py2jsParser#start.
    def visitStart(self, ctx:py2jsParser.StartContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#variableDeclarations.
    def visitVariableDeclarations(self, ctx:py2jsParser.VariableDeclarationsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#methodDeclarations.
    def visitMethodDeclarations(self, ctx:py2jsParser.MethodDeclarationsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#globalVariableDeclaration.
    def visitGlobalVariableDeclaration(self, ctx:py2jsParser.GlobalVariableDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#methodDeclaration.
    def visitMethodDeclaration(self, ctx:py2jsParser.MethodDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#methodHeader.
    def visitMethodHeader(self, ctx:py2jsParser.MethodHeaderContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#parameters.
    def visitParameters(self, ctx:py2jsParser.ParametersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#typedargslist.
    def visitTypedargslist(self, ctx:py2jsParser.TypedargslistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#arg.
    def visitArg(self, ctx:py2jsParser.ArgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#methodBody.
    def visitMethodBody(self, ctx:py2jsParser.MethodBodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#unoExpr.
    def visitUnoExpr(self, ctx:py2jsParser.UnoExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#orop.
    def visitOrop(self, ctx:py2jsParser.OropContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#bracketsop.
    def visitBracketsop(self, ctx:py2jsParser.BracketsopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#comparisop.
    def visitComparisop(self, ctx:py2jsParser.ComparisopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#bitmulop.
    def visitBitmulop(self, ctx:py2jsParser.BitmulopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#andop.
    def visitAndop(self, ctx:py2jsParser.AndopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#mulop.
    def visitMulop(self, ctx:py2jsParser.MulopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#xorop.
    def visitXorop(self, ctx:py2jsParser.XoropContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#assignop.
    def visitAssignop(self, ctx:py2jsParser.AssignopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#deg.
    def visitDeg(self, ctx:py2jsParser.DegContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#sumop.
    def visitSumop(self, ctx:py2jsParser.SumopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#arrowsop.
    def visitArrowsop(self, ctx:py2jsParser.ArrowsopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#assign.
    def visitAssign(self, ctx:py2jsParser.AssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#augassign.
    def visitAugassign(self, ctx:py2jsParser.AugassignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#varvalue.
    def visitVarvalue(self, ctx:py2jsParser.VarvalueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#unoop.
    def visitUnoop(self, ctx:py2jsParser.UnoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#varname.
    def visitVarname(self, ctx:py2jsParser.VarnameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#arrcall.
    def visitArrcall(self, ctx:py2jsParser.ArrcallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#bracketsval.
    def visitBracketsval(self, ctx:py2jsParser.BracketsvalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#funcall.
    def visitFuncall(self, ctx:py2jsParser.FuncallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#boolval.
    def visitBoolval(self, ctx:py2jsParser.BoolvalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#numval.
    def visitNumval(self, ctx:py2jsParser.NumvalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#strval.
    def visitStrval(self, ctx:py2jsParser.StrvalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#listval.
    def visitListval(self, ctx:py2jsParser.ListvalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#methodName.
    def visitMethodName(self, ctx:py2jsParser.MethodNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#variableName.
    def visitVariableName(self, ctx:py2jsParser.VariableNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#statement.
    def visitStatement(self, ctx:py2jsParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#emdeddedStatement.
    def visitEmdeddedStatement(self, ctx:py2jsParser.EmdeddedStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#arrayStatement.
    def visitArrayStatement(self, ctx:py2jsParser.ArrayStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#methodCall.
    def visitMethodCall(self, ctx:py2jsParser.MethodCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#ifStatement.
    def visitIfStatement(self, ctx:py2jsParser.IfStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#passStatement.
    def visitPassStatement(self, ctx:py2jsParser.PassStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#continueStatement.
    def visitContinueStatement(self, ctx:py2jsParser.ContinueStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#returnStatement.
    def visitReturnStatement(self, ctx:py2jsParser.ReturnStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#yieldStatement.
    def visitYieldStatement(self, ctx:py2jsParser.YieldStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#breakStatement.
    def visitBreakStatement(self, ctx:py2jsParser.BreakStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#whileStatement.
    def visitWhileStatement(self, ctx:py2jsParser.WhileStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#forStatement.
    def visitForStatement(self, ctx:py2jsParser.ForStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#variableValueList.
    def visitVariableValueList(self, ctx:py2jsParser.VariableValueListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#expr_list.
    def visitExpr_list(self, ctx:py2jsParser.Expr_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#elifStatement.
    def visitElifStatement(self, ctx:py2jsParser.ElifStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#elseStatement.
    def visitElseStatement(self, ctx:py2jsParser.ElseStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#commentText.
    def visitCommentText(self, ctx:py2jsParser.CommentTextContext):
        return self.visitChildren(ctx)



del py2jsParser