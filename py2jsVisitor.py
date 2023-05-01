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


    # Visit a parse tree produced by py2jsParser#methodDeclarations.
    def visitMethodDeclarations(self, ctx:py2jsParser.MethodDeclarationsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#methodDeclaration.
    def visitMethodDeclaration(self, ctx:py2jsParser.MethodDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#methodHeader.
    def visitMethodHeader(self, ctx:py2jsParser.MethodHeaderContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#methodBody.
    def visitMethodBody(self, ctx:py2jsParser.MethodBodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#statement.
    def visitStatement(self, ctx:py2jsParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#emdeddedStatement.
    def visitEmdeddedStatement(self, ctx:py2jsParser.EmdeddedStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#localVariableDeclaration.
    def visitLocalVariableDeclaration(self, ctx:py2jsParser.LocalVariableDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#methodCall.
    def visitMethodCall(self, ctx:py2jsParser.MethodCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#methodName.
    def visitMethodName(self, ctx:py2jsParser.MethodNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#variableName.
    def visitVariableName(self, ctx:py2jsParser.VariableNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by py2jsParser#variableValue.
    def visitVariableValue(self, ctx:py2jsParser.VariableValueContext):
        return self.visitChildren(ctx)



del py2jsParser