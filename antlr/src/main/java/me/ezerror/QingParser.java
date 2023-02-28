// Generated from java-escape by ANTLR 4.11.1
package me.ezerror;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class QingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		CLASS_IDENTIFIER=18, FUCTION_IDENTIFIER=19, VAR_IDENTIFIER=20, PRINT=21, 
		EQUALS=22, NUMBER=23, STRING=24, ID=25, WS=26, STRING_DOUBLEQUOTE=27, 
		COLON=28, SEMICOLON=29, POINT=30;
	public static final int
		RULE_compilationUnit = 0, RULE_classDeclaration = 1, RULE_classBody = 2, 
		RULE_functionName = 3, RULE_parameterName = 4, RULE_function = 5, RULE_functionDeclaration = 6, 
		RULE_parametersList = 7, RULE_parameter = 8, RULE_functionReturn = 9, 
		RULE_functionStatement = 10, RULE_variableDeclarationStatement = 11, RULE_printStatement = 12, 
		RULE_name = 13, RULE_expression = 14, RULE_varReference = 15, RULE_value = 16, 
		RULE_type = 17, RULE_primitiveType = 18, RULE_className = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "classDeclaration", "classBody", "functionName", "parameterName", 
			"function", "functionDeclaration", "parametersList", "parameter", "functionReturn", 
			"functionStatement", "variableDeclarationStatement", "printStatement", 
			"name", "expression", "varReference", "value", "type", "primitiveType", 
			"className"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "','", "'boolean'", "'['", "']'", "'string'", 
			"'char'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", 
			"'void'", "'type'", "'fn'", "'var'", "'print'", "'='", null, null, null, 
			null, "'\"'", "':'", "';'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "CLASS_IDENTIFIER", "FUCTION_IDENTIFIER", 
			"VAR_IDENTIFIER", "PRINT", "EQUALS", "NUMBER", "STRING", "ID", "WS", 
			"STRING_DOUBLEQUOTE", "COLON", "SEMICOLON", "POINT"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(QingParser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			classDeclaration();
			setState(41);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS_IDENTIFIER() { return getToken(QingParser.CLASS_IDENTIFIER, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(CLASS_IDENTIFIER);
			setState(44);
			className();
			setState(45);
			match(T__0);
			setState(46);
			classBody();
			setState(47);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUCTION_IDENTIFIER) {
				{
				{
				setState(49);
				function();
				}
				}
				setState(54);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QingParser.ID, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QingParser.ID, 0); }
		public ParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitParameterName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitParameterName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterNameContext parameterName() throws RecognitionException {
		ParameterNameContext _localctx = new ParameterNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public List<FunctionStatementContext> functionStatement() {
			return getRuleContexts(FunctionStatementContext.class);
		}
		public FunctionStatementContext functionStatement(int i) {
			return getRuleContext(FunctionStatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			functionDeclaration();
			setState(60);
			match(T__0);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 3407424L) != 0) {
				{
				{
				setState(61);
				functionStatement();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUCTION_IDENTIFIER() { return getToken(QingParser.FUCTION_IDENTIFIER, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionReturnContext functionReturn() {
			return getRuleContext(FunctionReturnContext.class,0);
		}
		public ParametersListContext parametersList() {
			return getRuleContext(ParametersListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(FUCTION_IDENTIFIER);
			setState(70);
			functionName();
			setState(71);
			match(T__2);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(72);
				parametersList();
				}
			}

			setState(75);
			match(T__3);
			setState(76);
			functionReturn();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterParametersList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitParametersList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitParametersList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersListContext parametersList() throws RecognitionException {
		ParametersListContext _localctx = new ParametersListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametersList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			parameter();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(79);
				match(T__4);
				setState(80);
				parameter();
				}
				}
				setState(85);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public ParameterNameContext parameterName() {
			return getRuleContext(ParameterNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(QingParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			parameterName();
			setState(87);
			match(COLON);
			setState(88);
			type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionReturnContext extends ParserRuleContext {
		public TerminalNode POINT() { return getToken(QingParser.POINT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterFunctionReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitFunctionReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitFunctionReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnContext functionReturn() throws RecognitionException {
		FunctionReturnContext _localctx = new FunctionReturnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(90);
				match(POINT);
				setState(91);
				type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(QingParser.SEMICOLON, 0); }
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case VAR_IDENTIFIER:
				{
				setState(94);
				variableDeclarationStatement();
				}
				break;
			case PRINT:
				{
				setState(95);
				printStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(98);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(QingParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VAR_IDENTIFIER() { return getToken(QingParser.VAR_IDENTIFIER, 0); }
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				{
				setState(100);
				type();
				}
				break;
			case VAR_IDENTIFIER:
				{
				setState(101);
				match(VAR_IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(104);
			name();
			setState(105);
			match(EQUALS);
			setState(106);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(QingParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(PRINT);
			setState(109);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QingParser.ID, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public VarReferenceContext varReference() {
			return getRuleContext(VarReferenceContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				varReference();
				}
				break;
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarReferenceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QingParser.ID, 0); }
		public VarReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterVarReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitVarReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitVarReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarReferenceContext varReference() throws RecognitionException {
		VarReferenceContext _localctx = new VarReferenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(QingParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(QingParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==STRING) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			primitiveType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primitiveType);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(T__5);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(124);
					match(T__6);
					setState(125);
					match(T__7);
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__8);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(132);
					match(T__6);
					setState(133);
					match(T__7);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(T__9);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(140);
					match(T__6);
					setState(141);
					match(T__7);
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(T__10);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(148);
					match(T__6);
					setState(149);
					match(T__7);
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				match(T__11);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(156);
					match(T__6);
					setState(157);
					match(T__7);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				match(T__12);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(164);
					match(T__6);
					setState(165);
					match(T__7);
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				match(T__13);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(172);
					match(T__6);
					setState(173);
					match(T__7);
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 8);
				{
				setState(179);
				match(T__14);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(180);
					match(T__6);
					setState(181);
					match(T__7);
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 9);
				{
				setState(187);
				match(T__15);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(188);
					match(T__6);
					setState(189);
					match(T__7);
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 10);
				{
				setState(195);
				match(T__16);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(196);
					match(T__6);
					setState(197);
					match(T__7);
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QingParser.ID, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QingListener ) ((QingListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QingVisitor ) return ((QingVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ID);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00d0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0005\u00023\b\u0002\n\u0002\f\u00026\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005?\b\u0005\n\u0005\f\u0005B\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006J\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007R\b\u0007\n\u0007\f\u0007U\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0003\t]\b\t\u0001\n\u0001\n\u0003\na\b\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0003\u000bg\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0003\u000et\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u007f\b\u0012\n\u0012\f\u0012\u0082\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0087\b\u0012\n\u0012\f\u0012\u008a"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u008f\b\u0012"+
		"\n\u0012\f\u0012\u0092\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u0097\b\u0012\n\u0012\f\u0012\u009a\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u009f\b\u0012\n\u0012\f\u0012\u00a2\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00a7\b\u0012\n\u0012\f\u0012"+
		"\u00aa\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00af\b"+
		"\u0012\n\u0012\f\u0012\u00b2\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00b7\b\u0012\n\u0012\f\u0012\u00ba\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u00bf\b\u0012\n\u0012\f\u0012\u00c2\t\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00c7\b\u0012\n\u0012"+
		"\f\u0012\u00ca\t\u0012\u0003\u0012\u00cc\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0000\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0001\u0001\u0000"+
		"\u0017\u0018\u00d6\u0000(\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000"+
		"\u0000\u00044\u0001\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000\b"+
		"9\u0001\u0000\u0000\u0000\n;\u0001\u0000\u0000\u0000\fE\u0001\u0000\u0000"+
		"\u0000\u000eN\u0001\u0000\u0000\u0000\u0010V\u0001\u0000\u0000\u0000\u0012"+
		"\\\u0001\u0000\u0000\u0000\u0014`\u0001\u0000\u0000\u0000\u0016f\u0001"+
		"\u0000\u0000\u0000\u0018l\u0001\u0000\u0000\u0000\u001ao\u0001\u0000\u0000"+
		"\u0000\u001cs\u0001\u0000\u0000\u0000\u001eu\u0001\u0000\u0000\u0000 "+
		"w\u0001\u0000\u0000\u0000\"y\u0001\u0000\u0000\u0000$\u00cb\u0001\u0000"+
		"\u0000\u0000&\u00cd\u0001\u0000\u0000\u0000()\u0003\u0002\u0001\u0000"+
		")*\u0005\u0000\u0000\u0001*\u0001\u0001\u0000\u0000\u0000+,\u0005\u0012"+
		"\u0000\u0000,-\u0003&\u0013\u0000-.\u0005\u0001\u0000\u0000./\u0003\u0004"+
		"\u0002\u0000/0\u0005\u0002\u0000\u00000\u0003\u0001\u0000\u0000\u0000"+
		"13\u0003\n\u0005\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u00005\u0005\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000078\u0005\u0019\u0000\u00008\u0007"+
		"\u0001\u0000\u0000\u00009:\u0005\u0019\u0000\u0000:\t\u0001\u0000\u0000"+
		"\u0000;<\u0003\f\u0006\u0000<@\u0005\u0001\u0000\u0000=?\u0003\u0014\n"+
		"\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000CD\u0005\u0002\u0000\u0000D\u000b\u0001\u0000\u0000"+
		"\u0000EF\u0005\u0013\u0000\u0000FG\u0003\u0006\u0003\u0000GI\u0005\u0003"+
		"\u0000\u0000HJ\u0003\u000e\u0007\u0000IH\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0005\u0004\u0000\u0000"+
		"LM\u0003\u0012\t\u0000M\r\u0001\u0000\u0000\u0000NS\u0003\u0010\b\u0000"+
		"OP\u0005\u0005\u0000\u0000PR\u0003\u0010\b\u0000QO\u0001\u0000\u0000\u0000"+
		"RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000T\u000f\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0003"+
		"\b\u0004\u0000WX\u0005\u001c\u0000\u0000XY\u0003\"\u0011\u0000Y\u0011"+
		"\u0001\u0000\u0000\u0000Z[\u0005\u001e\u0000\u0000[]\u0003\"\u0011\u0000"+
		"\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u0013\u0001\u0000"+
		"\u0000\u0000^a\u0003\u0016\u000b\u0000_a\u0003\u0018\f\u0000`^\u0001\u0000"+
		"\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0005"+
		"\u001d\u0000\u0000c\u0015\u0001\u0000\u0000\u0000dg\u0003\"\u0011\u0000"+
		"eg\u0005\u0014\u0000\u0000fd\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hi\u0003\u001a\r\u0000ij\u0005\u0016\u0000"+
		"\u0000jk\u0003\u001c\u000e\u0000k\u0017\u0001\u0000\u0000\u0000lm\u0005"+
		"\u0015\u0000\u0000mn\u0003\u001c\u000e\u0000n\u0019\u0001\u0000\u0000"+
		"\u0000op\u0005\u0019\u0000\u0000p\u001b\u0001\u0000\u0000\u0000qt\u0003"+
		"\u001e\u000f\u0000rt\u0003 \u0010\u0000sq\u0001\u0000\u0000\u0000sr\u0001"+
		"\u0000\u0000\u0000t\u001d\u0001\u0000\u0000\u0000uv\u0005\u0019\u0000"+
		"\u0000v\u001f\u0001\u0000\u0000\u0000wx\u0007\u0000\u0000\u0000x!\u0001"+
		"\u0000\u0000\u0000yz\u0003$\u0012\u0000z#\u0001\u0000\u0000\u0000{\u0080"+
		"\u0005\u0006\u0000\u0000|}\u0005\u0007\u0000\u0000}\u007f\u0005\b\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u00cc"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0088"+
		"\u0005\t\u0000\u0000\u0084\u0085\u0005\u0007\u0000\u0000\u0085\u0087\u0005"+
		"\b\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u00cc\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008b\u0090\u0005\n\u0000\u0000\u008c\u008d\u0005\u0007\u0000"+
		"\u0000\u008d\u008f\u0005\b\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u00cc\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0098\u0005\u000b\u0000\u0000"+
		"\u0094\u0095\u0005\u0007\u0000\u0000\u0095\u0097\u0005\b\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u00cc\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b"+
		"\u00a0\u0005\f\u0000\u0000\u009c\u009d\u0005\u0007\u0000\u0000\u009d\u009f"+
		"\u0005\b\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u00cc\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a8\u0005\r\u0000\u0000\u00a4\u00a5\u0005\u0007"+
		"\u0000\u0000\u00a5\u00a7\u0005\b\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00cc\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00b0\u0005\u000e\u0000"+
		"\u0000\u00ac\u00ad\u0005\u0007\u0000\u0000\u00ad\u00af\u0005\b\u0000\u0000"+
		"\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b1\u00cc\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b8\u0005\u000f\u0000\u0000\u00b4\u00b5\u0005\u0007\u0000\u0000"+
		"\u00b5\u00b7\u0005\b\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7"+
		"\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u00cc\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bb\u00c0\u0005\u0010\u0000\u0000\u00bc"+
		"\u00bd\u0005\u0007\u0000\u0000\u00bd\u00bf\u0005\b\u0000\u0000\u00be\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00cc"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c8"+
		"\u0005\u0011\u0000\u0000\u00c4\u00c5\u0005\u0007\u0000\u0000\u00c5\u00c7"+
		"\u0005\b\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cb{\u0001\u0000\u0000\u0000\u00cb\u0083\u0001\u0000"+
		"\u0000\u0000\u00cb\u008b\u0001\u0000\u0000\u0000\u00cb\u0093\u0001\u0000"+
		"\u0000\u0000\u00cb\u009b\u0001\u0000\u0000\u0000\u00cb\u00a3\u0001\u0000"+
		"\u0000\u0000\u00cb\u00ab\u0001\u0000\u0000\u0000\u00cb\u00b3\u0001\u0000"+
		"\u0000\u0000\u00cb\u00bb\u0001\u0000\u0000\u0000\u00cb\u00c3\u0001\u0000"+
		"\u0000\u0000\u00cc%\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0019\u0000"+
		"\u0000\u00ce\'\u0001\u0000\u0000\u0000\u00134@IS\\`fs\u0080\u0088\u0090"+
		"\u0098\u00a0\u00a8\u00b0\u00b8\u00c0\u00c8\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}