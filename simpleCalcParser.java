// Generated from simpleCalc.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleCalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, OP=13, AND=14, OR=15, REQ=16, GREAT=17, GREATEQ=18, 
		LESS=19, LESSEQ=20, EQ=21, NOTEQ=22, ID=23, FLOAT=24, ALPHA=25, NUM=26, 
		WHITESPACE=27, COMMENT=28, COMMENT2=29;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_assign = 2, RULE_expression = 3, 
		RULE_ifstatement = 4, RULE_loop = 5, RULE_condition = 6;
	public static final String[] ruleNames = {
		"start", "program", "assign", "expression", "ifstatement", "loop", "condition"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'*'", "'/'", "'('", "')'", "'if'", "'{'", "'}'", "'elseif'", 
		"'else if'", "'else'", "'while'", null, "'&&'", "'||'", null, "'>'", "'>='", 
		"'<'", "'<='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "OP", "AND", "OR", "REQ", "GREAT", "GREATEQ", "LESS", "LESSEQ", 
		"EQ", "NOTEQ", "ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", "COMMENT", 
		"COMMENT2"
	};
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
	public String getGrammarFileName() { return "simpleCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simpleCalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ProgramContext prog;
		public TerminalNode EOF() { return getToken(simpleCalcParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			((StartContext)_localctx).prog = program();
			setState(15);
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

	public static class ProgramContext extends ParserRuleContext {
		public AssignContext assign;
		public List<AssignContext> as = new ArrayList<AssignContext>();
		public ExpressionContext e;
		public IfstatementContext d;
		public LoopContext l;
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<IfstatementContext> ifstatement() {
			return getRuleContexts(IfstatementContext.class);
		}
		public IfstatementContext ifstatement(int i) {
			return getRuleContext(IfstatementContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(17);
					((ProgramContext)_localctx).assign = assign();
					((ProgramContext)_localctx).as.add(((ProgramContext)_localctx).assign);
					}
					} 
				}
				setState(22);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__11) | (1L << OP) | (1L << ID) | (1L << FLOAT))) != 0)) {
				{
				setState(26);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case OP:
				case ID:
				case FLOAT:
					{
					setState(23);
					((ProgramContext)_localctx).e = expression(0);
					}
					break;
				case T__5:
					{
					setState(24);
					((ProgramContext)_localctx).d = ifstatement();
					}
					break;
				case T__11:
					{
					setState(25);
					((ProgramContext)_localctx).l = loop();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(30);
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

	public static class AssignContext extends ParserRuleContext {
		public Token x;
		public ExpressionContext e;
		public TerminalNode ID() { return getToken(simpleCalcParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			((AssignContext)_localctx).x = match(ID);
			setState(32);
			match(T__0);
			setState(33);
			((AssignContext)_localctx).e = expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenthesisContext extends ExpressionContext {
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitParenthesis(this);
		}
	}
	public static class MultiplicationContext extends ExpressionContext {
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplicationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitMultiplication(this);
		}
	}
	public static class AdditionContext extends ExpressionContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP() { return getToken(simpleCalcParser.OP, 0); }
		public AdditionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitAddition(this);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public Token x;
		public TerminalNode ID() { return getToken(simpleCalcParser.ID, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitVariable(this);
		}
	}
	public static class ConstantContext extends ExpressionContext {
		public Token c;
		public TerminalNode FLOAT() { return getToken(simpleCalcParser.FLOAT, 0); }
		public ConstantContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitConstant(this);
		}
	}
	public static class OrstatementContext extends ExpressionContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(simpleCalcParser.OR, 0); }
		public OrstatementContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterOrstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitOrstatement(this);
		}
	}
	public static class DivisionContext extends ExpressionContext {
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitDivision(this);
		}
	}
	public static class SignedConstantContext extends ExpressionContext {
		public Token op;
		public Token f;
		public TerminalNode OP() { return getToken(simpleCalcParser.OP, 0); }
		public TerminalNode FLOAT() { return getToken(simpleCalcParser.FLOAT, 0); }
		public SignedConstantContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterSignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitSignedConstant(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(36);
				((VariableContext)_localctx).x = match(ID);
				}
				break;
			case FLOAT:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				((ConstantContext)_localctx).c = match(FLOAT);
				}
				break;
			case T__3:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(T__3);
				setState(39);
				((ParenthesisContext)_localctx).e = expression(0);
				setState(40);
				match(T__4);
				}
				break;
			case OP:
				{
				_localctx = new SignedConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				((SignedConstantContext)_localctx).op = match(OP);
				setState(43);
				((SignedConstantContext)_localctx).f = match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(58);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(46);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(47);
						match(T__1);
						setState(48);
						((MultiplicationContext)_localctx).e2 = expression(7);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						((DivisionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(49);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(50);
						match(T__2);
						setState(51);
						((DivisionContext)_localctx).e2 = expression(6);
						}
						break;
					case 3:
						{
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						((AdditionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(52);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(53);
						((AdditionContext)_localctx).op = match(OP);
						setState(54);
						((AdditionContext)_localctx).e2 = expression(5);
						}
						break;
					case 4:
						{
						_localctx = new OrstatementContext(new ExpressionContext(_parentctx, _parentState));
						((OrstatementContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(55);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(56);
						((OrstatementContext)_localctx).op = match(OR);
						setState(57);
						((OrstatementContext)_localctx).e2 = expression(2);
						}
						break;
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class IfstatementContext extends ParserRuleContext {
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitIfstatement(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__5);
			setState(64);
			match(T__3);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				condition(0);
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << OP) | (1L << ID) | (1L << FLOAT))) != 0) );
			setState(70);
			match(T__4);
			setState(71);
			match(T__6);
			setState(72);
			program();
			setState(73);
			match(T__7);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				{
				setState(74);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(75);
				match(T__3);
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(76);
					condition(0);
					}
					}
					setState(79); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << OP) | (1L << ID) | (1L << FLOAT))) != 0) );
				setState(81);
				match(T__4);
				setState(82);
				match(T__6);
				setState(83);
				program();
				setState(84);
				match(T__7);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(T__10);
			setState(92);
			match(T__6);
			setState(93);
			program();
			setState(94);
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

	public static class LoopContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__11);
			setState(97);
			match(T__3);
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98);
				condition(0);
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << OP) | (1L << ID) | (1L << FLOAT))) != 0) );
			setState(103);
			match(T__4);
			setState(104);
			match(T__6);
			setState(105);
			program();
			setState(106);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GRETEREQContext extends ConditionContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATEQ() { return getToken(simpleCalcParser.GREATEQ, 0); }
		public GRETEREQContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterGRETEREQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitGRETEREQ(this);
		}
	}
	public static class ORContext extends ConditionContext {
		public ConditionContext e1;
		public Token op;
		public ConditionContext e2;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode OR() { return getToken(simpleCalcParser.OR, 0); }
		public ORContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitOR(this);
		}
	}
	public static class EQUALSContext extends ConditionContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(simpleCalcParser.EQ, 0); }
		public EQUALSContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterEQUALS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitEQUALS(this);
		}
	}
	public static class LESSEQContext extends ConditionContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESSEQ() { return getToken(simpleCalcParser.LESSEQ, 0); }
		public LESSEQContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterLESSEQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitLESSEQ(this);
		}
	}
	public static class ANDContext extends ConditionContext {
		public ConditionContext e1;
		public Token op;
		public ConditionContext e2;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(simpleCalcParser.AND, 0); }
		public ANDContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitAND(this);
		}
	}
	public static class GREATERContext extends ConditionContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREAT() { return getToken(simpleCalcParser.GREAT, 0); }
		public GREATERContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterGREATER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitGREATER(this);
		}
	}
	public static class LESSContext extends ConditionContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS() { return getToken(simpleCalcParser.LESS, 0); }
		public LESSContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterLESS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitLESS(this);
		}
	}
	public static class NOTEQContext extends ConditionContext {
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOTEQ() { return getToken(simpleCalcParser.NOTEQ, 0); }
		public NOTEQContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterNOTEQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitNOTEQ(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new EQUALSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(109);
				((EQUALSContext)_localctx).e1 = expression(0);
				setState(110);
				((EQUALSContext)_localctx).op = match(EQ);
				setState(111);
				((EQUALSContext)_localctx).e2 = expression(0);
				}
				break;
			case 2:
				{
				_localctx = new NOTEQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				((NOTEQContext)_localctx).e1 = expression(0);
				setState(114);
				((NOTEQContext)_localctx).op = match(NOTEQ);
				setState(115);
				((NOTEQContext)_localctx).e2 = expression(0);
				}
				break;
			case 3:
				{
				_localctx = new GREATERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				((GREATERContext)_localctx).e1 = expression(0);
				setState(118);
				((GREATERContext)_localctx).op = match(GREAT);
				setState(119);
				((GREATERContext)_localctx).e2 = expression(0);
				}
				break;
			case 4:
				{
				_localctx = new GRETEREQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				((GRETEREQContext)_localctx).e1 = expression(0);
				setState(122);
				((GRETEREQContext)_localctx).op = match(GREATEQ);
				setState(123);
				((GRETEREQContext)_localctx).e2 = expression(0);
				}
				break;
			case 5:
				{
				_localctx = new LESSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				((LESSContext)_localctx).e1 = expression(0);
				setState(126);
				((LESSContext)_localctx).op = match(LESS);
				setState(127);
				((LESSContext)_localctx).e2 = expression(0);
				}
				break;
			case 6:
				{
				_localctx = new LESSEQContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				((LESSEQContext)_localctx).e1 = expression(0);
				setState(130);
				((LESSEQContext)_localctx).op = match(LESSEQ);
				setState(131);
				((LESSEQContext)_localctx).e2 = expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(141);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ANDContext(new ConditionContext(_parentctx, _parentState));
						((ANDContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(135);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(136);
						((ANDContext)_localctx).op = match(AND);
						setState(137);
						((ANDContext)_localctx).e2 = condition(9);
						}
						break;
					case 2:
						{
						_localctx = new ORContext(new ConditionContext(_parentctx, _parentState));
						((ORContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(138);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(139);
						((ORContext)_localctx).op = match(OR);
						setState(140);
						((ORContext)_localctx).e2 = condition(8);
						}
						break;
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 6:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0095\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\7\3\25"+
		"\n\3\f\3\16\3\30\13\3\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5/\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\6\3\6\3\6\6\6"+
		"E\n\6\r\6\16\6F\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6P\n\6\r\6\16\6Q\3\6\3\6"+
		"\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\6\7f\n\7\r\7\16\7g\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0088\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0090\n\b\f\b\16\b\u0093\13"+
		"\b\3\b\2\4\b\16\t\2\4\6\b\n\f\16\2\3\3\2\13\f\2\u00a3\2\20\3\2\2\2\4\26"+
		"\3\2\2\2\6!\3\2\2\2\b.\3\2\2\2\nA\3\2\2\2\fb\3\2\2\2\16\u0087\3\2\2\2"+
		"\20\21\5\4\3\2\21\22\7\2\2\3\22\3\3\2\2\2\23\25\5\6\4\2\24\23\3\2\2\2"+
		"\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\36\3\2\2\2\30\26\3\2\2\2"+
		"\31\35\5\b\5\2\32\35\5\n\6\2\33\35\5\f\7\2\34\31\3\2\2\2\34\32\3\2\2\2"+
		"\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\5\3\2\2\2 \36"+
		"\3\2\2\2!\"\7\31\2\2\"#\7\3\2\2#$\5\b\5\2$\7\3\2\2\2%&\b\5\1\2&/\7\31"+
		"\2\2\'/\7\32\2\2()\7\6\2\2)*\5\b\5\2*+\7\7\2\2+/\3\2\2\2,-\7\17\2\2-/"+
		"\7\32\2\2.%\3\2\2\2.\'\3\2\2\2.(\3\2\2\2.,\3\2\2\2/>\3\2\2\2\60\61\f\b"+
		"\2\2\61\62\7\4\2\2\62=\5\b\5\t\63\64\f\7\2\2\64\65\7\5\2\2\65=\5\b\5\b"+
		"\66\67\f\6\2\2\678\7\17\2\28=\5\b\5\79:\f\3\2\2:;\7\21\2\2;=\5\b\5\4<"+
		"\60\3\2\2\2<\63\3\2\2\2<\66\3\2\2\2<9\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3"+
		"\2\2\2?\t\3\2\2\2@>\3\2\2\2AB\7\b\2\2BD\7\6\2\2CE\5\16\b\2DC\3\2\2\2E"+
		"F\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\7\2\2IJ\7\t\2\2JK\5\4\3\2"+
		"KZ\7\n\2\2LM\t\2\2\2MO\7\6\2\2NP\5\16\b\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2"+
		"\2QR\3\2\2\2RS\3\2\2\2ST\7\7\2\2TU\7\t\2\2UV\5\4\3\2VW\7\n\2\2WY\3\2\2"+
		"\2XL\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\r"+
		"\2\2^_\7\t\2\2_`\5\4\3\2`a\7\n\2\2a\13\3\2\2\2bc\7\16\2\2ce\7\6\2\2df"+
		"\5\16\b\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\7\2\2"+
		"jk\7\t\2\2kl\5\4\3\2lm\7\n\2\2m\r\3\2\2\2no\b\b\1\2op\5\b\5\2pq\7\27\2"+
		"\2qr\5\b\5\2r\u0088\3\2\2\2st\5\b\5\2tu\7\30\2\2uv\5\b\5\2v\u0088\3\2"+
		"\2\2wx\5\b\5\2xy\7\23\2\2yz\5\b\5\2z\u0088\3\2\2\2{|\5\b\5\2|}\7\24\2"+
		"\2}~\5\b\5\2~\u0088\3\2\2\2\177\u0080\5\b\5\2\u0080\u0081\7\25\2\2\u0081"+
		"\u0082\5\b\5\2\u0082\u0088\3\2\2\2\u0083\u0084\5\b\5\2\u0084\u0085\7\26"+
		"\2\2\u0085\u0086\5\b\5\2\u0086\u0088\3\2\2\2\u0087n\3\2\2\2\u0087s\3\2"+
		"\2\2\u0087w\3\2\2\2\u0087{\3\2\2\2\u0087\177\3\2\2\2\u0087\u0083\3\2\2"+
		"\2\u0088\u0091\3\2\2\2\u0089\u008a\f\n\2\2\u008a\u008b\7\20\2\2\u008b"+
		"\u0090\5\16\b\13\u008c\u008d\f\t\2\2\u008d\u008e\7\21\2\2\u008e\u0090"+
		"\5\16\b\n\u008f\u0089\3\2\2\2\u008f\u008c\3\2\2\2\u0090\u0093\3\2\2\2"+
		"\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\17\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\17\26\34\36.<>FQZg\u0087\u008f\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}