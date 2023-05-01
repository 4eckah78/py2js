# Generated from py2js.g4 by ANTLR 4.12.0
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,13,81,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,1,0,3,0,26,8,0,1,0,
        3,0,29,8,0,1,1,4,1,32,8,1,11,1,12,1,33,1,2,1,2,1,2,1,3,1,3,1,3,1,
        3,1,3,1,3,5,3,45,8,3,10,3,12,3,48,9,3,1,4,5,4,51,8,4,10,4,12,4,54,
        9,4,1,5,1,5,5,5,58,8,5,10,5,12,5,61,9,5,1,6,1,6,3,6,65,8,6,1,7,1,
        7,1,7,1,7,1,8,1,8,1,8,1,8,1,9,1,9,1,10,1,10,1,11,1,11,1,11,0,0,12,
        0,2,4,6,8,10,12,14,16,18,20,22,0,1,1,0,6,8,75,0,28,1,0,0,0,2,31,
        1,0,0,0,4,35,1,0,0,0,6,38,1,0,0,0,8,52,1,0,0,0,10,55,1,0,0,0,12,
        64,1,0,0,0,14,66,1,0,0,0,16,70,1,0,0,0,18,74,1,0,0,0,20,76,1,0,0,
        0,22,78,1,0,0,0,24,26,3,2,1,0,25,24,1,0,0,0,25,26,1,0,0,0,26,29,
        1,0,0,0,27,29,5,0,0,1,28,25,1,0,0,0,28,27,1,0,0,0,29,1,1,0,0,0,30,
        32,3,4,2,0,31,30,1,0,0,0,32,33,1,0,0,0,33,31,1,0,0,0,33,34,1,0,0,
        0,34,3,1,0,0,0,35,36,3,6,3,0,36,37,3,8,4,0,37,5,1,0,0,0,38,39,5,
        1,0,0,39,40,3,18,9,0,40,41,5,2,0,0,41,42,5,3,0,0,42,46,5,4,0,0,43,
        45,5,11,0,0,44,43,1,0,0,0,45,48,1,0,0,0,46,44,1,0,0,0,46,47,1,0,
        0,0,47,7,1,0,0,0,48,46,1,0,0,0,49,51,3,10,5,0,50,49,1,0,0,0,51,54,
        1,0,0,0,52,50,1,0,0,0,52,53,1,0,0,0,53,9,1,0,0,0,54,52,1,0,0,0,55,
        59,3,12,6,0,56,58,5,11,0,0,57,56,1,0,0,0,58,61,1,0,0,0,59,57,1,0,
        0,0,59,60,1,0,0,0,60,11,1,0,0,0,61,59,1,0,0,0,62,65,3,14,7,0,63,
        65,3,16,8,0,64,62,1,0,0,0,64,63,1,0,0,0,65,13,1,0,0,0,66,67,3,20,
        10,0,67,68,5,5,0,0,68,69,3,22,11,0,69,15,1,0,0,0,70,71,3,18,9,0,
        71,72,5,2,0,0,72,73,5,3,0,0,73,17,1,0,0,0,74,75,5,9,0,0,75,19,1,
        0,0,0,76,77,5,9,0,0,77,21,1,0,0,0,78,79,7,0,0,0,79,23,1,0,0,0,7,
        25,28,33,46,52,59,64
    ]

class py2jsParser ( Parser ):

    grammarFileName = "py2js.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'def'", "'('", "')'", "':'", "'='", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'\\t'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "INT", "BOOL", "STRING", 
                      "WORD", "WHITESPACE", "NEWLINE", "ANY", "IDENT" ]

    RULE_start = 0
    RULE_methodDeclarations = 1
    RULE_methodDeclaration = 2
    RULE_methodHeader = 3
    RULE_methodBody = 4
    RULE_statement = 5
    RULE_emdeddedStatement = 6
    RULE_localVariableDeclaration = 7
    RULE_methodCall = 8
    RULE_methodName = 9
    RULE_variableName = 10
    RULE_variableValue = 11

    ruleNames =  [ "start", "methodDeclarations", "methodDeclaration", "methodHeader", 
                   "methodBody", "statement", "emdeddedStatement", "localVariableDeclaration", 
                   "methodCall", "methodName", "variableName", "variableValue" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    INT=6
    BOOL=7
    STRING=8
    WORD=9
    WHITESPACE=10
    NEWLINE=11
    ANY=12
    IDENT=13

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.12.0")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StartContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def methodDeclarations(self):
            return self.getTypedRuleContext(py2jsParser.MethodDeclarationsContext,0)


        def EOF(self):
            return self.getToken(py2jsParser.EOF, 0)

        def getRuleIndex(self):
            return py2jsParser.RULE_start

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart" ):
                listener.enterStart(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart" ):
                listener.exitStart(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStart" ):
                return visitor.visitStart(self)
            else:
                return visitor.visitChildren(self)




    def start(self):

        localctx = py2jsParser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_start)
        self._la = 0 # Token type
        try:
            self.state = 28
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 25
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==1:
                    self.state = 24
                    self.methodDeclarations()


                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 27
                self.match(py2jsParser.EOF)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodDeclarationsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def methodDeclaration(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(py2jsParser.MethodDeclarationContext)
            else:
                return self.getTypedRuleContext(py2jsParser.MethodDeclarationContext,i)


        def getRuleIndex(self):
            return py2jsParser.RULE_methodDeclarations

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodDeclarations" ):
                listener.enterMethodDeclarations(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodDeclarations" ):
                listener.exitMethodDeclarations(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodDeclarations" ):
                return visitor.visitMethodDeclarations(self)
            else:
                return visitor.visitChildren(self)




    def methodDeclarations(self):

        localctx = py2jsParser.MethodDeclarationsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_methodDeclarations)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 31 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 30
                self.methodDeclaration()
                self.state = 33 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==1):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodDeclarationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def methodHeader(self):
            return self.getTypedRuleContext(py2jsParser.MethodHeaderContext,0)


        def methodBody(self):
            return self.getTypedRuleContext(py2jsParser.MethodBodyContext,0)


        def getRuleIndex(self):
            return py2jsParser.RULE_methodDeclaration

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodDeclaration" ):
                listener.enterMethodDeclaration(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodDeclaration" ):
                listener.exitMethodDeclaration(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodDeclaration" ):
                return visitor.visitMethodDeclaration(self)
            else:
                return visitor.visitChildren(self)




    def methodDeclaration(self):

        localctx = py2jsParser.MethodDeclarationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_methodDeclaration)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 35
            self.methodHeader()
            self.state = 36
            self.methodBody()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodHeaderContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def methodName(self):
            return self.getTypedRuleContext(py2jsParser.MethodNameContext,0)


        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(py2jsParser.NEWLINE)
            else:
                return self.getToken(py2jsParser.NEWLINE, i)

        def getRuleIndex(self):
            return py2jsParser.RULE_methodHeader

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodHeader" ):
                listener.enterMethodHeader(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodHeader" ):
                listener.exitMethodHeader(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodHeader" ):
                return visitor.visitMethodHeader(self)
            else:
                return visitor.visitChildren(self)




    def methodHeader(self):

        localctx = py2jsParser.MethodHeaderContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_methodHeader)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 38
            self.match(py2jsParser.T__0)
            self.state = 39
            self.methodName()
            self.state = 40
            self.match(py2jsParser.T__1)
            self.state = 41
            self.match(py2jsParser.T__2)
            self.state = 42
            self.match(py2jsParser.T__3)
            self.state = 46
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==11:
                self.state = 43
                self.match(py2jsParser.NEWLINE)
                self.state = 48
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodBodyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(py2jsParser.StatementContext)
            else:
                return self.getTypedRuleContext(py2jsParser.StatementContext,i)


        def getRuleIndex(self):
            return py2jsParser.RULE_methodBody

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodBody" ):
                listener.enterMethodBody(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodBody" ):
                listener.exitMethodBody(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodBody" ):
                return visitor.visitMethodBody(self)
            else:
                return visitor.visitChildren(self)




    def methodBody(self):

        localctx = py2jsParser.MethodBodyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_methodBody)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 52
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==9:
                self.state = 49
                self.statement()
                self.state = 54
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def emdeddedStatement(self):
            return self.getTypedRuleContext(py2jsParser.EmdeddedStatementContext,0)


        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(py2jsParser.NEWLINE)
            else:
                return self.getToken(py2jsParser.NEWLINE, i)

        def getRuleIndex(self):
            return py2jsParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatement" ):
                return visitor.visitStatement(self)
            else:
                return visitor.visitChildren(self)




    def statement(self):

        localctx = py2jsParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_statement)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 55
            self.emdeddedStatement()
            self.state = 59
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==11:
                self.state = 56
                self.match(py2jsParser.NEWLINE)
                self.state = 61
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EmdeddedStatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def localVariableDeclaration(self):
            return self.getTypedRuleContext(py2jsParser.LocalVariableDeclarationContext,0)


        def methodCall(self):
            return self.getTypedRuleContext(py2jsParser.MethodCallContext,0)


        def getRuleIndex(self):
            return py2jsParser.RULE_emdeddedStatement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEmdeddedStatement" ):
                listener.enterEmdeddedStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEmdeddedStatement" ):
                listener.exitEmdeddedStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEmdeddedStatement" ):
                return visitor.visitEmdeddedStatement(self)
            else:
                return visitor.visitChildren(self)




    def emdeddedStatement(self):

        localctx = py2jsParser.EmdeddedStatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_emdeddedStatement)
        try:
            self.state = 64
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,6,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 62
                self.localVariableDeclaration()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 63
                self.methodCall()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LocalVariableDeclarationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def variableName(self):
            return self.getTypedRuleContext(py2jsParser.VariableNameContext,0)


        def variableValue(self):
            return self.getTypedRuleContext(py2jsParser.VariableValueContext,0)


        def getRuleIndex(self):
            return py2jsParser.RULE_localVariableDeclaration

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLocalVariableDeclaration" ):
                listener.enterLocalVariableDeclaration(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLocalVariableDeclaration" ):
                listener.exitLocalVariableDeclaration(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLocalVariableDeclaration" ):
                return visitor.visitLocalVariableDeclaration(self)
            else:
                return visitor.visitChildren(self)




    def localVariableDeclaration(self):

        localctx = py2jsParser.LocalVariableDeclarationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_localVariableDeclaration)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 66
            self.variableName()
            self.state = 67
            self.match(py2jsParser.T__4)
            self.state = 68
            self.variableValue()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodCallContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def methodName(self):
            return self.getTypedRuleContext(py2jsParser.MethodNameContext,0)


        def getRuleIndex(self):
            return py2jsParser.RULE_methodCall

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodCall" ):
                listener.enterMethodCall(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodCall" ):
                listener.exitMethodCall(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodCall" ):
                return visitor.visitMethodCall(self)
            else:
                return visitor.visitChildren(self)




    def methodCall(self):

        localctx = py2jsParser.MethodCallContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_methodCall)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 70
            self.methodName()
            self.state = 71
            self.match(py2jsParser.T__1)
            self.state = 72
            self.match(py2jsParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WORD(self):
            return self.getToken(py2jsParser.WORD, 0)

        def getRuleIndex(self):
            return py2jsParser.RULE_methodName

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodName" ):
                listener.enterMethodName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodName" ):
                listener.exitMethodName(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodName" ):
                return visitor.visitMethodName(self)
            else:
                return visitor.visitChildren(self)




    def methodName(self):

        localctx = py2jsParser.MethodNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_methodName)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 74
            self.match(py2jsParser.WORD)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VariableNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WORD(self):
            return self.getToken(py2jsParser.WORD, 0)

        def getRuleIndex(self):
            return py2jsParser.RULE_variableName

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariableName" ):
                listener.enterVariableName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariableName" ):
                listener.exitVariableName(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVariableName" ):
                return visitor.visitVariableName(self)
            else:
                return visitor.visitChildren(self)




    def variableName(self):

        localctx = py2jsParser.VariableNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_variableName)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 76
            self.match(py2jsParser.WORD)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VariableValueContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BOOL(self):
            return self.getToken(py2jsParser.BOOL, 0)

        def INT(self):
            return self.getToken(py2jsParser.INT, 0)

        def STRING(self):
            return self.getToken(py2jsParser.STRING, 0)

        def getRuleIndex(self):
            return py2jsParser.RULE_variableValue

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariableValue" ):
                listener.enterVariableValue(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariableValue" ):
                listener.exitVariableValue(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVariableValue" ):
                return visitor.visitVariableValue(self)
            else:
                return visitor.visitChildren(self)




    def variableValue(self):

        localctx = py2jsParser.VariableValueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_variableValue)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 78
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 448) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





