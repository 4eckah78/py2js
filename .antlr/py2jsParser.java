// Generated from d:\Универ\Магистратура\1 курс\2 семестр\Программная инженерия\py2js\py2js.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class py2jsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, PASS=55, NUMBER=56, BOOL=57, STRING=58, WORD=59, WHITESPACE=60, 
		NL=61, COMMENT=62, ANY=63;
	public static final int
		RULE_start = 0, RULE_variableDeclarations = 1, RULE_methodDeclarations = 2, 
		RULE_globalVariableDeclaration = 3, RULE_methodDeclaration = 4, RULE_methodHeader = 5, 
		RULE_parameters = 6, RULE_typedargslist = 7, RULE_arg = 8, RULE_methodBody = 9, 
		RULE_expr = 10, RULE_assign = 11, RULE_augassign = 12, RULE_unaryExpr = 13, 
		RULE_variableValue = 14, RULE_methodName = 15, RULE_variableName = 16, 
		RULE_statement = 17, RULE_emdeddedStatement = 18, RULE_arrayStatement = 19, 
		RULE_methodCall = 20, RULE_ifStatement = 21, RULE_passStatement = 22, 
		RULE_continueStatement = 23, RULE_returnStatement = 24, RULE_yieldStatement = 25, 
		RULE_breakStatement = 26, RULE_whileStatement = 27, RULE_forStatement = 28, 
		RULE_variableValueList = 29, RULE_expr_list = 30, RULE_elifStatement = 31, 
		RULE_elseStatement = 32, RULE_commentText = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "variableDeclarations", "methodDeclarations", "globalVariableDeclaration", 
			"methodDeclaration", "methodHeader", "parameters", "typedargslist", "arg", 
			"methodBody", "expr", "assign", "augassign", "unaryExpr", "variableValue", 
			"methodName", "variableName", "statement", "emdeddedStatement", "arrayStatement", 
			"methodCall", "ifStatement", "passStatement", "continueStatement", "returnStatement", 
			"yieldStatement", "breakStatement", "whileStatement", "forStatement", 
			"variableValueList", "expr_list", "elifStatement", "elseStatement", "commentText"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'def'", "':'", "'('", "')'", "','", "'{'", "'}'", "'**'", 
			"'*'", "'/'", "'%'", "'//'", "'+'", "'-'", "'<<'", "'>>'", "'&'", "'^'", 
			"'|'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'and'", "'or'", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", 
			"'>>='", "'**='", "'~'", "'not'", "'['", "']'", "'if'", "'continue'", 
			"'return'", "'yield'", "'break'", "'while'", "'for'", "'in'", "'range'", 
			"'elif'", "'else:'", "'pass'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "PASS", "NUMBER", "BOOL", "STRING", 
			"WORD", "WHITESPACE", "NL", "COMMENT", "ANY"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "py2js.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public py2jsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(py2jsParser.EOF, 0); }
		public List<CommentTextContext> commentText() {
			return getRuleContexts(CommentTextContext.class);
		}
		public CommentTextContext commentText(int i) {
			return getRuleContext(CommentTextContext.class,i);
		}
		public VariableDeclarationsContext variableDeclarations() {
			return getRuleContext(VariableDeclarationsContext.class,0);
		}
		public MethodDeclarationsContext methodDeclarations() {
			return getRuleContext(MethodDeclarationsContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(68);
				commentText();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(74);
				variableDeclarations();
				}
			}

			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(77);
				methodDeclarations();
				}
			}

			setState(80);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationsContext extends ParserRuleContext {
		public List<GlobalVariableDeclarationContext> globalVariableDeclaration() {
			return getRuleContexts(GlobalVariableDeclarationContext.class);
		}
		public GlobalVariableDeclarationContext globalVariableDeclaration(int i) {
			return getRuleContext(GlobalVariableDeclarationContext.class,i);
		}
		public List<CommentTextContext> commentText() {
			return getRuleContexts(CommentTextContext.class);
		}
		public CommentTextContext commentText(int i) {
			return getRuleContext(CommentTextContext.class,i);
		}
		public VariableDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarations; }
	}

	public final VariableDeclarationsContext variableDeclarations() throws RecognitionException {
		VariableDeclarationsContext _localctx = new VariableDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variableDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				globalVariableDeclaration();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(87);
				commentText();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationsContext extends ParserRuleContext {
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public MethodDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarations; }
	}

	public final MethodDeclarationsContext methodDeclarations() throws RecognitionException {
		MethodDeclarationsContext _localctx = new MethodDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_methodDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				methodDeclaration();
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalVariableDeclarationContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CommentTextContext commentText() {
			return getRuleContext(CommentTextContext.class,0);
		}
		public GlobalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVariableDeclaration; }
	}

	public final GlobalVariableDeclarationContext globalVariableDeclaration() throws RecognitionException {
		GlobalVariableDeclarationContext _localctx = new GlobalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_globalVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			variableName();
			setState(99);
			match(T__0);
			setState(100);
			expr(0);
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(101);
				commentText();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<CommentTextContext> commentText() {
			return getRuleContexts(CommentTextContext.class);
		}
		public CommentTextContext commentText(int i) {
			return getRuleContext(CommentTextContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			methodHeader();
			setState(105);
			methodBody();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(106);
				commentText();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public CommentTextContext commentText() {
			return getRuleContext(CommentTextContext.class,0);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__1);
			setState(113);
			methodName();
			setState(114);
			parameters();
			setState(115);
			match(T__2);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(116);
				commentText();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public TypedargslistContext typedargslist() {
			return getRuleContext(TypedargslistContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__3);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__41) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << WORD))) != 0)) {
				{
				setState(120);
				typedargslist();
				}
			}

			setState(123);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedargslistContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TypedargslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedargslist; }
	}

	public final TypedargslistContext typedargslist() throws RecognitionException {
		TypedargslistContext _localctx = new TypedargslistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typedargslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			arg();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(126);
				match(T__0);
				setState(127);
				expr(0);
				}
			}

			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(130);
				match(T__5);
				setState(131);
				arg();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(132);
					match(T__0);
					setState(133);
					expr(0);
					}
				}

				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arg);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				variableName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				variableValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__6);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << PASS) | (1L << WORD) | (1L << COMMENT))) != 0)) {
				{
				{
				setState(146);
				statement();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnoExprContext extends ExprContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public UnoExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OropContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OropContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BracketsopContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BracketsopContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ComparisopContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparisopContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BitmulopContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BitmulopContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AndopContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndopContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MulopContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulopContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class XoropContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public XoropContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AssignopContext extends ExprContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AssignopContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DegContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DegContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SumopContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SumopContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ArrowsopContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrowsopContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new AssignopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(155);
				assign();
				}
				break;
			case 2:
				{
				_localctx = new BracketsopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(T__3);
				setState(157);
				expr(0);
				setState(158);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new UnoExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				unaryExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new DegContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(164);
						match(T__8);
						setState(165);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new MulopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(167);
						((MulopContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
							((MulopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(168);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new SumopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(170);
						((SumopContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
							((SumopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(171);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ArrowsopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(173);
						((ArrowsopContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
							((ArrowsopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(174);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new BitmulopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(176);
						match(T__17);
						setState(177);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new XoropContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(179);
						match(T__18);
						setState(180);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new SumopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(182);
						match(T__19);
						setState(183);
						expr(5);
						}
						break;
					case 8:
						{
						_localctx = new ComparisopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(185);
						((ComparisopContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
							((ComparisopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(186);
						expr(4);
						}
						break;
					case 9:
						{
						_localctx = new AndopContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(188);
						match(T__26);
						setState(189);
						expr(3);
						}
						break;
					case 10:
						{
						_localctx = new OropContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(191);
						match(T__27);
						setState(192);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AugassignContext augassign() {
			return getRuleContext(AugassignContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			variableName();
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(199);
				match(T__0);
				}
				break;
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
				{
				setState(200);
				augassign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(203);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AugassignContext extends ParserRuleContext {
		public AugassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_augassign; }
	}

	public final AugassignContext augassign() throws RecognitionException {
		AugassignContext _localctx = new AugassignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_augassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
	 
		public UnaryExprContext() { }
		public void copyFrom(UnaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnoopContext extends UnaryExprContext {
		public Token op;
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public UnoopContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}
	public static class VarvalueContext extends UnaryExprContext {
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
		}
		public VarvalueContext(UnaryExprContext ctx) { copyFrom(ctx); }
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unaryExpr);
		int _la;
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__41:
			case NUMBER:
			case BOOL:
			case STRING:
			case WORD:
				_localctx = new VarvalueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				variableValue();
				}
				break;
			case T__13:
			case T__14:
			case T__39:
			case T__40:
				_localctx = new UnoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				((UnoopContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__39) | (1L << T__40))) != 0)) ) {
					((UnoopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(209);
				unaryExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableValueContext extends ParserRuleContext {
		public VariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableValue; }
	 
		public VariableValueContext() { }
		public void copyFrom(VariableValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncallContext extends VariableValueContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FuncallContext(VariableValueContext ctx) { copyFrom(ctx); }
	}
	public static class NumvalContext extends VariableValueContext {
		public TerminalNode NUMBER() { return getToken(py2jsParser.NUMBER, 0); }
		public NumvalContext(VariableValueContext ctx) { copyFrom(ctx); }
	}
	public static class StrvalContext extends VariableValueContext {
		public TerminalNode STRING() { return getToken(py2jsParser.STRING, 0); }
		public StrvalContext(VariableValueContext ctx) { copyFrom(ctx); }
	}
	public static class ArrcallContext extends VariableValueContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrcallContext(VariableValueContext ctx) { copyFrom(ctx); }
	}
	public static class BracketsvalContext extends VariableValueContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BracketsvalContext(VariableValueContext ctx) { copyFrom(ctx); }
	}
	public static class ListvalContext extends VariableValueContext {
		public List<VariableValueContext> variableValue() {
			return getRuleContexts(VariableValueContext.class);
		}
		public VariableValueContext variableValue(int i) {
			return getRuleContext(VariableValueContext.class,i);
		}
		public ListvalContext(VariableValueContext ctx) { copyFrom(ctx); }
	}
	public static class BoolvalContext extends VariableValueContext {
		public TerminalNode BOOL() { return getToken(py2jsParser.BOOL, 0); }
		public BoolvalContext(VariableValueContext ctx) { copyFrom(ctx); }
	}
	public static class VarnameContext extends VariableValueContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public VarnameContext(VariableValueContext ctx) { copyFrom(ctx); }
	}

	public final VariableValueContext variableValue() throws RecognitionException {
		VariableValueContext _localctx = new VariableValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableValue);
		int _la;
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new VarnameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				variableName();
				}
				break;
			case 2:
				_localctx = new ArrcallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				variableName();
				setState(214);
				match(T__41);
				setState(215);
				expr(0);
				setState(216);
				match(T__42);
				}
				break;
			case 3:
				_localctx = new BracketsvalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(T__3);
				setState(219);
				expr(0);
				setState(220);
				match(T__4);
				}
				break;
			case 4:
				_localctx = new FuncallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				variableName();
				setState(223);
				parameters();
				}
				break;
			case 5:
				_localctx = new BoolvalContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				match(BOOL);
				}
				break;
			case 6:
				_localctx = new NumvalContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
				match(NUMBER);
				}
				break;
			case 7:
				_localctx = new StrvalContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(227);
				match(STRING);
				}
				break;
			case 8:
				_localctx = new ListvalContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(228);
				match(T__41);
				setState(229);
				variableValue();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(230);
					match(T__5);
					setState(231);
					variableValue();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(237);
				match(T__42);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(py2jsParser.WORD, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(py2jsParser.WORD, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public EmdeddedStatementContext emdeddedStatement() {
			return getRuleContext(EmdeddedStatementContext.class,0);
		}
		public CommentTextContext commentText() {
			return getRuleContext(CommentTextContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			emdeddedStatement();
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(246);
				commentText();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmdeddedStatementContext extends ParserRuleContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public PassStatementContext passStatement() {
			return getRuleContext(PassStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public CommentTextContext commentText() {
			return getRuleContext(CommentTextContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public YieldStatementContext yieldStatement() {
			return getRuleContext(YieldStatementContext.class,0);
		}
		public ArrayStatementContext arrayStatement() {
			return getRuleContext(ArrayStatementContext.class,0);
		}
		public EmdeddedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emdeddedStatement; }
	}

	public final EmdeddedStatementContext emdeddedStatement() throws RecognitionException {
		EmdeddedStatementContext _localctx = new EmdeddedStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_emdeddedStatement);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				methodCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				passStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				continueStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				breakStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				commentText();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(255);
				assign();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(256);
				ifStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(257);
				forStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(258);
				whileStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(259);
				yieldStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(260);
				arrayStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayStatementContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AugassignContext augassign() {
			return getRuleContext(AugassignContext.class,0);
		}
		public ArrayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayStatement; }
	}

	public final ArrayStatementContext arrayStatement() throws RecognitionException {
		ArrayStatementContext _localctx = new ArrayStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			variableName();
			setState(264);
			match(T__41);
			setState(265);
			expr(0);
			setState(266);
			match(T__42);
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(267);
				match(T__0);
				}
				break;
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
				{
				setState(268);
				augassign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(271);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			methodName();
			setState(274);
			parameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<ElifStatementContext> elifStatement() {
			return getRuleContexts(ElifStatementContext.class);
		}
		public ElifStatementContext elifStatement(int i) {
			return getRuleContext(ElifStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__43);
			setState(277);
			expr(0);
			setState(278);
			match(T__2);
			setState(279);
			methodBody();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__52) {
				{
				{
				setState(280);
				elifStatement();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__53) {
				{
				setState(286);
				elseStatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PassStatementContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(py2jsParser.PASS, 0); }
		public PassStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passStatement; }
	}

	public final PassStatementContext passStatement() throws RecognitionException {
		PassStatementContext _localctx = new PassStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_passStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(PASS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__44);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__45);
			setState(294);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YieldStatementContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public YieldStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldStatement; }
	}

	public final YieldStatementContext yieldStatement() throws RecognitionException {
		YieldStatementContext _localctx = new YieldStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_yieldStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__46);
			setState(297);
			unaryExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__47);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__48);
			setState(302);
			expr(0);
			setState(303);
			match(T__2);
			setState(304);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public VariableValueListContext variableValueList() {
			return getRuleContext(VariableValueListContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__49);
			setState(307);
			variableName();
			setState(308);
			match(T__50);
			setState(309);
			match(T__51);
			setState(310);
			match(T__3);
			setState(311);
			variableValueList();
			setState(312);
			match(T__4);
			setState(313);
			match(T__2);
			setState(314);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableValueListContext extends ParserRuleContext {
		public List<VariableValueContext> variableValue() {
			return getRuleContexts(VariableValueContext.class);
		}
		public VariableValueContext variableValue(int i) {
			return getRuleContext(VariableValueContext.class,i);
		}
		public VariableValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableValueList; }
	}

	public final VariableValueListContext variableValueList() throws RecognitionException {
		VariableValueListContext _localctx = new VariableValueListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variableValueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			variableValue();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(317);
				match(T__5);
				setState(318);
				variableValue();
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(319);
					match(T__5);
					setState(320);
					variableValue();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			expr(0);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(326);
				match(T__5);
				setState(327);
				expr(0);
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElifStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public ElifStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifStatement; }
	}

	public final ElifStatementContext elifStatement() throws RecognitionException {
		ElifStatementContext _localctx = new ElifStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_elifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__52);
			setState(334);
			expr(0);
			setState(335);
			match(T__2);
			setState(336);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(T__53);
			setState(339);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentTextContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(py2jsParser.COMMENT, 0); }
		public CommentTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentText; }
	}

	public final CommentTextContext commentText() throws RecognitionException {
		CommentTextContext _localctx = new CommentTextContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_commentText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u015a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\5\2N\n\2\3\2\5\2Q\n"+
		"\2\3\2\3\2\3\3\6\3V\n\3\r\3\16\3W\3\3\7\3[\n\3\f\3\16\3^\13\3\3\4\6\4"+
		"a\n\4\r\4\16\4b\3\5\3\5\3\5\3\5\5\5i\n\5\3\6\3\6\3\6\7\6n\n\6\f\6\16\6"+
		"q\13\6\3\7\3\7\3\7\3\7\3\7\5\7x\n\7\3\b\3\b\5\b|\n\b\3\b\3\b\3\t\3\t\3"+
		"\t\5\t\u0083\n\t\3\t\3\t\3\t\3\t\5\t\u0089\n\t\7\t\u008b\n\t\f\t\16\t"+
		"\u008e\13\t\3\n\3\n\5\n\u0092\n\n\3\13\3\13\7\13\u0096\n\13\f\13\16\13"+
		"\u0099\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a4\n\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c4\n\f\f\f\16\f\u00c7"+
		"\13\f\3\r\3\r\3\r\5\r\u00cc\n\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\5\17"+
		"\u00d5\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00eb\n\20\f\20\16\20\u00ee"+
		"\13\20\3\20\3\20\5\20\u00f2\n\20\3\21\3\21\3\22\3\22\3\23\3\23\5\23\u00fa"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0108\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0110\n\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u011c\n\27\f\27\16\27\u011f"+
		"\13\27\3\27\5\27\u0122\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37\u0144\n\37\5\37"+
		"\u0146\n\37\3 \3 \3 \7 \u014b\n \f \16 \u014e\13 \3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3#\2\3\26$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BD\2\b\3\2\f\17\3\2\20\21\3\2\22\23\3\2\27\34\3\2\37"+
		")\4\2\20\21*+\2\u016e\2I\3\2\2\2\4U\3\2\2\2\6`\3\2\2\2\bd\3\2\2\2\nj\3"+
		"\2\2\2\fr\3\2\2\2\16y\3\2\2\2\20\177\3\2\2\2\22\u0091\3\2\2\2\24\u0093"+
		"\3\2\2\2\26\u00a3\3\2\2\2\30\u00c8\3\2\2\2\32\u00cf\3\2\2\2\34\u00d4\3"+
		"\2\2\2\36\u00f1\3\2\2\2 \u00f3\3\2\2\2\"\u00f5\3\2\2\2$\u00f7\3\2\2\2"+
		"&\u0107\3\2\2\2(\u0109\3\2\2\2*\u0113\3\2\2\2,\u0116\3\2\2\2.\u0123\3"+
		"\2\2\2\60\u0125\3\2\2\2\62\u0127\3\2\2\2\64\u012a\3\2\2\2\66\u012d\3\2"+
		"\2\28\u012f\3\2\2\2:\u0134\3\2\2\2<\u013e\3\2\2\2>\u0147\3\2\2\2@\u014f"+
		"\3\2\2\2B\u0154\3\2\2\2D\u0157\3\2\2\2FH\5D#\2GF\3\2\2\2HK\3\2\2\2IG\3"+
		"\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2LN\5\4\3\2ML\3\2\2\2MN\3\2\2\2NP\3"+
		"\2\2\2OQ\5\6\4\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\2\2\3S\3\3\2\2\2TV"+
		"\5\b\5\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\\\3\2\2\2Y[\5D#\2ZY"+
		"\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\5\3\2\2\2^\\\3\2\2\2_a\5\n\6"+
		"\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\7\3\2\2\2de\5\"\22\2ef\7\3"+
		"\2\2fh\5\26\f\2gi\5D#\2hg\3\2\2\2hi\3\2\2\2i\t\3\2\2\2jk\5\f\7\2ko\5\24"+
		"\13\2ln\5D#\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\13\3\2\2\2qo\3"+
		"\2\2\2rs\7\4\2\2st\5 \21\2tu\5\16\b\2uw\7\5\2\2vx\5D#\2wv\3\2\2\2wx\3"+
		"\2\2\2x\r\3\2\2\2y{\7\6\2\2z|\5\20\t\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}"+
		"~\7\7\2\2~\17\3\2\2\2\177\u0082\5\22\n\2\u0080\u0081\7\3\2\2\u0081\u0083"+
		"\5\26\f\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u008c\3\2\2\2"+
		"\u0084\u0085\7\b\2\2\u0085\u0088\5\22\n\2\u0086\u0087\7\3\2\2\u0087\u0089"+
		"\5\26\f\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2"+
		"\u008a\u0084\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\21\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0092\5\"\22\2\u0090"+
		"\u0092\5\36\20\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\23\3\2"+
		"\2\2\u0093\u0097\7\t\2\2\u0094\u0096\5$\23\2\u0095\u0094\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\n\2\2\u009b\25\3\2\2\2\u009c\u009d"+
		"\b\f\1\2\u009d\u00a4\5\30\r\2\u009e\u009f\7\6\2\2\u009f\u00a0\5\26\f\2"+
		"\u00a0\u00a1\7\7\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a4\5\34\17\2\u00a3\u009c"+
		"\3\2\2\2\u00a3\u009e\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00c5\3\2\2\2\u00a5"+
		"\u00a6\f\r\2\2\u00a6\u00a7\7\13\2\2\u00a7\u00c4\5\26\f\16\u00a8\u00a9"+
		"\f\13\2\2\u00a9\u00aa\t\2\2\2\u00aa\u00c4\5\26\f\f\u00ab\u00ac\f\n\2\2"+
		"\u00ac\u00ad\t\3\2\2\u00ad\u00c4\5\26\f\13\u00ae\u00af\f\t\2\2\u00af\u00b0"+
		"\t\4\2\2\u00b0\u00c4\5\26\f\n\u00b1\u00b2\f\b\2\2\u00b2\u00b3\7\24\2\2"+
		"\u00b3\u00c4\5\26\f\t\u00b4\u00b5\f\7\2\2\u00b5\u00b6\7\25\2\2\u00b6\u00c4"+
		"\5\26\f\b\u00b7\u00b8\f\6\2\2\u00b8\u00b9\7\26\2\2\u00b9\u00c4\5\26\f"+
		"\7\u00ba\u00bb\f\5\2\2\u00bb\u00bc\t\5\2\2\u00bc\u00c4\5\26\f\6\u00bd"+
		"\u00be\f\4\2\2\u00be\u00bf\7\35\2\2\u00bf\u00c4\5\26\f\5\u00c0\u00c1\f"+
		"\3\2\2\u00c1\u00c2\7\36\2\2\u00c2\u00c4\5\26\f\4\u00c3\u00a5\3\2\2\2\u00c3"+
		"\u00a8\3\2\2\2\u00c3\u00ab\3\2\2\2\u00c3\u00ae\3\2\2\2\u00c3\u00b1\3\2"+
		"\2\2\u00c3\u00b4\3\2\2\2\u00c3\u00b7\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3"+
		"\u00bd\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\27\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb"+
		"\5\"\22\2\u00c9\u00cc\7\3\2\2\u00ca\u00cc\5\32\16\2\u00cb\u00c9\3\2\2"+
		"\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\5\26\f\2\u00ce"+
		"\31\3\2\2\2\u00cf\u00d0\t\6\2\2\u00d0\33\3\2\2\2\u00d1\u00d5\5\36\20\2"+
		"\u00d2\u00d3\t\7\2\2\u00d3\u00d5\5\34\17\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\35\3\2\2\2\u00d6\u00f2\5\"\22\2\u00d7\u00d8\5\"\22\2\u00d8"+
		"\u00d9\7,\2\2\u00d9\u00da\5\26\f\2\u00da\u00db\7-\2\2\u00db\u00f2\3\2"+
		"\2\2\u00dc\u00dd\7\6\2\2\u00dd\u00de\5\26\f\2\u00de\u00df\7\7\2\2\u00df"+
		"\u00f2\3\2\2\2\u00e0\u00e1\5\"\22\2\u00e1\u00e2\5\16\b\2\u00e2\u00f2\3"+
		"\2\2\2\u00e3\u00f2\7;\2\2\u00e4\u00f2\7:\2\2\u00e5\u00f2\7<\2\2\u00e6"+
		"\u00e7\7,\2\2\u00e7\u00ec\5\36\20\2\u00e8\u00e9\7\b\2\2\u00e9\u00eb\5"+
		"\36\20\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7-"+
		"\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00d6\3\2\2\2\u00f1\u00d7\3\2\2\2\u00f1"+
		"\u00dc\3\2\2\2\u00f1\u00e0\3\2\2\2\u00f1\u00e3\3\2\2\2\u00f1\u00e4\3\2"+
		"\2\2\u00f1\u00e5\3\2\2\2\u00f1\u00e6\3\2\2\2\u00f2\37\3\2\2\2\u00f3\u00f4"+
		"\7=\2\2\u00f4!\3\2\2\2\u00f5\u00f6\7=\2\2\u00f6#\3\2\2\2\u00f7\u00f9\5"+
		"&\24\2\u00f8\u00fa\5D#\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"%\3\2\2\2\u00fb\u0108\5*\26\2\u00fc\u0108\5.\30\2\u00fd\u0108\5\60\31"+
		"\2\u00fe\u0108\5\66\34\2\u00ff\u0108\5\62\32\2\u0100\u0108\5D#\2\u0101"+
		"\u0108\5\30\r\2\u0102\u0108\5,\27\2\u0103\u0108\5:\36\2\u0104\u0108\5"+
		"8\35\2\u0105\u0108\5\64\33\2\u0106\u0108\5(\25\2\u0107\u00fb\3\2\2\2\u0107"+
		"\u00fc\3\2\2\2\u0107\u00fd\3\2\2\2\u0107\u00fe\3\2\2\2\u0107\u00ff\3\2"+
		"\2\2\u0107\u0100\3\2\2\2\u0107\u0101\3\2\2\2\u0107\u0102\3\2\2\2\u0107"+
		"\u0103\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2"+
		"\2\2\u0108\'\3\2\2\2\u0109\u010a\5\"\22\2\u010a\u010b\7,\2\2\u010b\u010c"+
		"\5\26\f\2\u010c\u010f\7-\2\2\u010d\u0110\7\3\2\2\u010e\u0110\5\32\16\2"+
		"\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112"+
		"\5\26\f\2\u0112)\3\2\2\2\u0113\u0114\5 \21\2\u0114\u0115\5\16\b\2\u0115"+
		"+\3\2\2\2\u0116\u0117\7.\2\2\u0117\u0118\5\26\f\2\u0118\u0119\7\5\2\2"+
		"\u0119\u011d\5\24\13\2\u011a\u011c\5@!\2\u011b\u011a\3\2\2\2\u011c\u011f"+
		"\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u0120\u0122\5B\"\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122-\3\2\2\2\u0123\u0124\79\2\2\u0124/\3\2\2\2\u0125\u0126\7/\2"+
		"\2\u0126\61\3\2\2\2\u0127\u0128\7\60\2\2\u0128\u0129\5\26\f\2\u0129\63"+
		"\3\2\2\2\u012a\u012b\7\61\2\2\u012b\u012c\5\34\17\2\u012c\65\3\2\2\2\u012d"+
		"\u012e\7\62\2\2\u012e\67\3\2\2\2\u012f\u0130\7\63\2\2\u0130\u0131\5\26"+
		"\f\2\u0131\u0132\7\5\2\2\u0132\u0133\5\24\13\2\u01339\3\2\2\2\u0134\u0135"+
		"\7\64\2\2\u0135\u0136\5\"\22\2\u0136\u0137\7\65\2\2\u0137\u0138\7\66\2"+
		"\2\u0138\u0139\7\6\2\2\u0139\u013a\5<\37\2\u013a\u013b\7\7\2\2\u013b\u013c"+
		"\7\5\2\2\u013c\u013d\5\24\13\2\u013d;\3\2\2\2\u013e\u0145\5\36\20\2\u013f"+
		"\u0140\7\b\2\2\u0140\u0143\5\36\20\2\u0141\u0142\7\b\2\2\u0142\u0144\5"+
		"\36\20\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145"+
		"\u013f\3\2\2\2\u0145\u0146\3\2\2\2\u0146=\3\2\2\2\u0147\u014c\5\26\f\2"+
		"\u0148\u0149\7\b\2\2\u0149\u014b\5\26\f\2\u014a\u0148\3\2\2\2\u014b\u014e"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d?\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0150\7\67\2\2\u0150\u0151\5\26\f\2\u0151\u0152\7"+
		"\5\2\2\u0152\u0153\5\24\13\2\u0153A\3\2\2\2\u0154\u0155\78\2\2\u0155\u0156"+
		"\5\24\13\2\u0156C\3\2\2\2\u0157\u0158\7@\2\2\u0158E\3\2\2\2 IMPW\\bho"+
		"w{\u0082\u0088\u008c\u0091\u0097\u00a3\u00c3\u00c5\u00cb\u00d4\u00ec\u00f1"+
		"\u00f9\u0107\u010f\u011d\u0121\u0143\u0145\u014c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}