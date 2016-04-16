// Generated from C:/MaheshVibhute/projects/self/kaizen/src/main/resources\FixRules.g4 by ANTLR 4.5.1
package com.resilient.re.ext.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FixRulesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, ID=40, INT=41, FLOAT=42, NEWLINE=43, WS=44, EQ=45, GR=46, GE=47, 
		LS=48, LE=49, NE=50, MT=51, T=52, A=53, G=54, STRING=55, ACTION_DIRECTOR=56;
	public static final int
		RULE_rules = 0, RULE_ifRule = 1, RULE_rule = 2, RULE_stmt = 3, RULE_action = 4, 
		RULE_tagStmt = 5, RULE_monoOperandOperator = 6, RULE_monoOperand = 7, 
		RULE_tag = 8, RULE_operand = 9, RULE_biOperandOperator = 10, RULE_biOperand = 11, 
		RULE_listOperator = 12, RULE_list = 13, RULE_logicalCondition = 14, RULE_logicalOperator = 15, 
		RULE_logicalOperand = 16, RULE_stringOperand = 17, RULE_andOr = 18, RULE_or = 19, 
		RULE_and = 20, RULE_not = 21, RULE_is = 22, RULE_mustBe = 23, RULE_mustNotBe = 24, 
		RULE_between = 25, RULE_equalTo = 26, RULE_match = 27, RULE_greaterThan = 28, 
		RULE_lessThan = 29, RULE_present = 30, RULE_absent = 31, RULE_alphanumeric = 32, 
		RULE_mandatory = 33, RULE_valid = 34, RULE_consistent = 35, RULE_numeric = 36, 
		RULE_before = 37, RULE_after = 38, RULE_dateToday = 39, RULE_dateTomorrow = 40, 
		RULE_dateYesterday = 41, RULE_date = 42, RULE_onlyIf = 43, RULE_openBracket = 44, 
		RULE_closeBracket = 45;
	public static final String[] ruleNames = {
		"rules", "ifRule", "rule", "stmt", "action", "tagStmt", "monoOperandOperator", 
		"monoOperand", "tag", "operand", "biOperandOperator", "biOperand", "listOperator", 
		"list", "logicalCondition", "logicalOperator", "logicalOperand", "stringOperand", 
		"andOr", "or", "and", "not", "is", "mustBe", "mustNotBe", "between", "equalTo", 
		"match", "greaterThan", "lessThan", "present", "absent", "alphanumeric", 
		"mandatory", "valid", "consistent", "numeric", "before", "after", "dateToday", 
		"dateTomorrow", "dateYesterday", "date", "onlyIf", "openBracket", "closeBracket"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'INCOMPLETE'", "'INVALID'", "'INCONSISTENT'", "'NOTUNIQ'", 
		"'+'", "'tag('", "')'", "'('", "','", "'in'", "'['", "']'", "'or '", "'and '", 
		"'not '", "'is '", "'must be'", "'must not be'", "'between'", "'equal to'", 
		"'match'", "'greater than'", "'less than'", "'present'", "'absent'", "'alphanumeric'", 
		"'mandatory'", "'valid'", "'consistent'", "'numeric'", "'before '", "'after '", 
		"'today'", "'tomorrow'", "'yesterday'", "'if '", "'{'", "'}'", null, null, 
		null, null, null, "'='", "'>'", "'>='", "'<'", "'<='", "'!='", "'~='", 
		null, null, null, null, "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "ID", "INT", "FLOAT", "NEWLINE", "WS", "EQ", "GR", 
		"GE", "LS", "LE", "NE", "MT", "T", "A", "G", "STRING", "ACTION_DIRECTOR"
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
	public String getGrammarFileName() { return "FixRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FixRulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RulesContext extends ParserRuleContext {
		public List<RuleContext> rule() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				rule();
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
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

	public static class IfRuleContext extends ParserRuleContext {
		public OnlyIfContext onlyIf() {
			return getRuleContext(OnlyIfContext.class,0);
		}
		public List<TagContext> tag() {
			return getRuleContexts(TagContext.class);
		}
		public TagContext tag(int i) {
			return getRuleContext(TagContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<AndOrContext> andOr() {
			return getRuleContexts(AndOrContext.class);
		}
		public AndOrContext andOr(int i) {
			return getRuleContext(AndOrContext.class,i);
		}
		public List<OpenBracketContext> openBracket() {
			return getRuleContexts(OpenBracketContext.class);
		}
		public OpenBracketContext openBracket(int i) {
			return getRuleContext(OpenBracketContext.class,i);
		}
		public List<CloseBracketContext> closeBracket() {
			return getRuleContexts(CloseBracketContext.class);
		}
		public CloseBracketContext closeBracket(int i) {
			return getRuleContext(CloseBracketContext.class,i);
		}
		public IfRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterIfRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitIfRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitIfRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfRuleContext ifRule() throws RecognitionException {
		IfRuleContext _localctx = new IfRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ifRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			onlyIf();
			setState(98);
			tag();
			setState(99);
			stmt();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__14) {
				{
				{
				setState(100);
				andOr();
				setState(102);
				_la = _input.LA(1);
				if (_la==T__37) {
					{
					setState(101);
					openBracket();
					}
				}

				setState(104);
				tag();
				setState(105);
				stmt();
				setState(107);
				_la = _input.LA(1);
				if (_la==T__38) {
					{
					setState(106);
					closeBracket();
					}
				}

				}
				}
				setState(113);
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

	public static class RuleContext extends ParserRuleContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public IfRuleContext ifRule() {
			return getRuleContext(IfRuleContext.class,0);
		}
		public TerminalNode ACTION_DIRECTOR() { return getToken(FixRulesParser.ACTION_DIRECTOR, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(FixRulesParser.NEWLINE, 0); }
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			tag();
			setState(115);
			stmt();
			setState(117);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(116);
				ifRule();
				}
			}

			setState(119);
			match(T__0);
			setState(122);
			_la = _input.LA(1);
			if (_la==ACTION_DIRECTOR) {
				{
				setState(120);
				match(ACTION_DIRECTOR);
				setState(121);
				action();
				}
			}

			setState(125);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(124);
				match(NEWLINE);
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

	public static class StmtContext extends ParserRuleContext {
		public ListOperatorContext listOperator() {
			return getRuleContext(ListOperatorContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public MonoOperandOperatorContext monoOperandOperator() {
			return getRuleContext(MonoOperandOperatorContext.class,0);
		}
		public TagStmtContext tagStmt() {
			return getRuleContext(TagStmtContext.class,0);
		}
		public MonoOperandContext monoOperand() {
			return getRuleContext(MonoOperandContext.class,0);
		}
		public LogicalConditionContext logicalCondition() {
			return getRuleContext(LogicalConditionContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				listOperator();
				setState(128);
				list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				monoOperandOperator();
				setState(131);
				tagStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				monoOperandOperator();
				setState(134);
				monoOperand();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				logicalCondition();
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

	public static class ActionContext extends ParserRuleContext {
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TagStmtContext extends ParserRuleContext {
		public List<TagContext> tag() {
			return getRuleContexts(TagContext.class);
		}
		public TagContext tag(int i) {
			return getRuleContext(TagContext.class,i);
		}
		public TagStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterTagStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitTagStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitTagStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagStmtContext tagStmt() throws RecognitionException {
		TagStmtContext _localctx = new TagStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tagStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			tag();
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(142);
				match(T__5);
				setState(143);
				tag();
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
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

	public static class MonoOperandOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(FixRulesParser.EQ, 0); }
		public TerminalNode GR() { return getToken(FixRulesParser.GR, 0); }
		public TerminalNode GE() { return getToken(FixRulesParser.GE, 0); }
		public TerminalNode LS() { return getToken(FixRulesParser.LS, 0); }
		public TerminalNode LE() { return getToken(FixRulesParser.LE, 0); }
		public TerminalNode NE() { return getToken(FixRulesParser.NE, 0); }
		public TerminalNode MT() { return getToken(FixRulesParser.MT, 0); }
		public MonoOperandOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monoOperandOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterMonoOperandOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitMonoOperandOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitMonoOperandOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonoOperandOperatorContext monoOperandOperator() throws RecognitionException {
		MonoOperandOperatorContext _localctx = new MonoOperandOperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_monoOperandOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << GR) | (1L << GE) | (1L << LS) | (1L << LE) | (1L << NE) | (1L << MT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class MonoOperandContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public MonoOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monoOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterMonoOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitMonoOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitMonoOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonoOperandContext monoOperand() throws RecognitionException {
		MonoOperandContext _localctx = new MonoOperandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_monoOperand);
		try {
			setState(152);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				operand();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				tag();
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

	public static class TagContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FixRulesParser.INT, 0); }
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__6);
			setState(155);
			match(INT);
			setState(156);
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

	public static class OperandContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(FixRulesParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(FixRulesParser.INT, 0); }
		public TerminalNode STRING() { return getToken(FixRulesParser.STRING, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class BiOperandOperatorContext extends ParserRuleContext {
		public BetweenContext between() {
			return getRuleContext(BetweenContext.class,0);
		}
		public BiOperandOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_biOperandOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterBiOperandOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitBiOperandOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitBiOperandOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BiOperandOperatorContext biOperandOperator() throws RecognitionException {
		BiOperandOperatorContext _localctx = new BiOperandOperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_biOperandOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			between();
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

	public static class BiOperandContext extends ParserRuleContext {
		public List<TerminalNode> FLOAT() { return getTokens(FixRulesParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(FixRulesParser.FLOAT, i);
		}
		public List<TerminalNode> INT() { return getTokens(FixRulesParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(FixRulesParser.INT, i);
		}
		public List<DateContext> date() {
			return getRuleContexts(DateContext.class);
		}
		public DateContext date(int i) {
			return getRuleContext(DateContext.class,i);
		}
		public BiOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_biOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterBiOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitBiOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitBiOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BiOperandContext biOperand() throws RecognitionException {
		BiOperandContext _localctx = new BiOperandContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_biOperand);
		try {
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(T__8);
				setState(163);
				match(FLOAT);
				setState(164);
				match(T__9);
				setState(165);
				match(FLOAT);
				setState(166);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__8);
				setState(168);
				match(INT);
				setState(169);
				match(T__9);
				setState(170);
				match(INT);
				setState(171);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(T__8);
				setState(173);
				date();
				setState(174);
				match(T__9);
				setState(175);
				date();
				setState(176);
				match(T__7);
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

	public static class ListOperatorContext extends ParserRuleContext {
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public ListOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterListOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitListOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitListOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListOperatorContext listOperator() throws RecognitionException {
		ListOperatorContext _localctx = new ListOperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(180);
				not();
				}
			}

			setState(183);
			match(T__10);
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

	public static class ListContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(185);
				match(T__11);
				}
			}

			setState(188);
			operand();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(189);
				match(T__9);
				setState(190);
				operand();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(196);
				match(T__12);
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

	public static class LogicalConditionContext extends ParserRuleContext {
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public LogicalOperandContext logicalOperand() {
			return getRuleContext(LogicalOperandContext.class,0);
		}
		public List<AndOrContext> andOr() {
			return getRuleContexts(AndOrContext.class);
		}
		public AndOrContext andOr(int i) {
			return getRuleContext(AndOrContext.class,i);
		}
		public List<LogicalConditionContext> logicalCondition() {
			return getRuleContexts(LogicalConditionContext.class);
		}
		public LogicalConditionContext logicalCondition(int i) {
			return getRuleContext(LogicalConditionContext.class,i);
		}
		public List<OpenBracketContext> openBracket() {
			return getRuleContexts(OpenBracketContext.class);
		}
		public OpenBracketContext openBracket(int i) {
			return getRuleContext(OpenBracketContext.class,i);
		}
		public List<CloseBracketContext> closeBracket() {
			return getRuleContexts(CloseBracketContext.class);
		}
		public CloseBracketContext closeBracket(int i) {
			return getRuleContext(CloseBracketContext.class,i);
		}
		public LogicalConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterLogicalCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitLogicalCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitLogicalCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalConditionContext logicalCondition() throws RecognitionException {
		LogicalConditionContext _localctx = new LogicalConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logicalCondition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			logicalOperator();
			setState(200);
			logicalOperand();
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(201);
					andOr();
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__37) {
						{
						{
						setState(202);
						openBracket();
						}
						}
						setState(207);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(208);
					logicalCondition();
					setState(212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(209);
							closeBracket();
							}
							} 
						}
						setState(214);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					}
					}
					} 
				}
				setState(219);
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
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOperatorContext extends ParserRuleContext {
		public IsContext is() {
			return getRuleContext(IsContext.class,0);
		}
		public MustBeContext mustBe() {
			return getRuleContext(MustBeContext.class,0);
		}
		public MustNotBeContext mustNotBe() {
			return getRuleContext(MustNotBeContext.class,0);
		}
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logicalOperator);
		try {
			setState(223);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				is();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				mustBe();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				mustNotBe();
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

	public static class LogicalOperandContext extends ParserRuleContext {
		public PresentContext present() {
			return getRuleContext(PresentContext.class,0);
		}
		public AbsentContext absent() {
			return getRuleContext(AbsentContext.class,0);
		}
		public MandatoryContext mandatory() {
			return getRuleContext(MandatoryContext.class,0);
		}
		public ValidContext valid() {
			return getRuleContext(ValidContext.class,0);
		}
		public ConsistentContext consistent() {
			return getRuleContext(ConsistentContext.class,0);
		}
		public NumericContext numeric() {
			return getRuleContext(NumericContext.class,0);
		}
		public AlphanumericContext alphanumeric() {
			return getRuleContext(AlphanumericContext.class,0);
		}
		public BeforeContext before() {
			return getRuleContext(BeforeContext.class,0);
		}
		public AfterContext after() {
			return getRuleContext(AfterContext.class,0);
		}
		public ListOperatorContext listOperator() {
			return getRuleContext(ListOperatorContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public BiOperandOperatorContext biOperandOperator() {
			return getRuleContext(BiOperandOperatorContext.class,0);
		}
		public BiOperandContext biOperand() {
			return getRuleContext(BiOperandContext.class,0);
		}
		public GreaterThanContext greaterThan() {
			return getRuleContext(GreaterThanContext.class,0);
		}
		public MonoOperandContext monoOperand() {
			return getRuleContext(MonoOperandContext.class,0);
		}
		public LessThanContext lessThan() {
			return getRuleContext(LessThanContext.class,0);
		}
		public EqualToContext equalTo() {
			return getRuleContext(EqualToContext.class,0);
		}
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public StringOperandContext stringOperand() {
			return getRuleContext(StringOperandContext.class,0);
		}
		public LogicalOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterLogicalOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitLogicalOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitLogicalOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperandContext logicalOperand() throws RecognitionException {
		LogicalOperandContext _localctx = new LogicalOperandContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logicalOperand);
		try {
			setState(252);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				present();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				absent();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				mandatory();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				valid();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				consistent();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 6);
				{
				setState(230);
				numeric();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 7);
				{
				setState(231);
				alphanumeric();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 8);
				{
				setState(232);
				before();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 9);
				{
				setState(233);
				after();
				}
				break;
			case T__10:
			case T__15:
				enterOuterAlt(_localctx, 10);
				{
				setState(234);
				listOperator();
				setState(235);
				list();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 11);
				{
				setState(237);
				biOperandOperator();
				setState(238);
				biOperand();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 12);
				{
				setState(240);
				greaterThan();
				setState(241);
				monoOperand();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 13);
				{
				setState(243);
				lessThan();
				setState(244);
				monoOperand();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 14);
				{
				setState(246);
				equalTo();
				setState(247);
				monoOperand();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 15);
				{
				setState(249);
				match();
				setState(250);
				stringOperand();
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

	public static class StringOperandContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(FixRulesParser.STRING, 0); }
		public StringOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterStringOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitStringOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitStringOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringOperandContext stringOperand() throws RecognitionException {
		StringOperandContext _localctx = new StringOperandContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stringOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(STRING);
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

	public static class AndOrContext extends ParserRuleContext {
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public AndOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitAndOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndOrContext andOr() throws RecognitionException {
		AndOrContext _localctx = new AndOrContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_andOr);
		try {
			setState(258);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				and();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				or();
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

	public static class OrContext extends ParserRuleContext {
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__13);
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

	public static class AndContext extends ParserRuleContext {
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__14);
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

	public static class NotContext extends ParserRuleContext {
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__15);
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

	public static class IsContext extends ParserRuleContext {
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public IsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitIs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsContext is() throws RecognitionException {
		IsContext _localctx = new IsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_is);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__16);
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(267);
				not();
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

	public static class MustBeContext extends ParserRuleContext {
		public MustBeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mustBe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterMustBe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitMustBe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitMustBe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MustBeContext mustBe() throws RecognitionException {
		MustBeContext _localctx = new MustBeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mustBe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__17);
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

	public static class MustNotBeContext extends ParserRuleContext {
		public MustNotBeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mustNotBe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterMustNotBe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitMustNotBe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitMustNotBe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MustNotBeContext mustNotBe() throws RecognitionException {
		MustNotBeContext _localctx = new MustNotBeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mustNotBe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__18);
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

	public static class BetweenContext extends ParserRuleContext {
		public BetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BetweenContext between() throws RecognitionException {
		BetweenContext _localctx = new BetweenContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_between);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__19);
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

	public static class EqualToContext extends ParserRuleContext {
		public EqualToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalTo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterEqualTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitEqualTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitEqualTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualToContext equalTo() throws RecognitionException {
		EqualToContext _localctx = new EqualToContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_equalTo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__20);
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

	public static class MatchContext extends ParserRuleContext {
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__21);
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

	public static class GreaterThanContext extends ParserRuleContext {
		public GreaterThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterThanContext greaterThan() throws RecognitionException {
		GreaterThanContext _localctx = new GreaterThanContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_greaterThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__22);
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

	public static class LessThanContext extends ParserRuleContext {
		public LessThanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessThanContext lessThan() throws RecognitionException {
		LessThanContext _localctx = new LessThanContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_lessThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__23);
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

	public static class PresentContext extends ParserRuleContext {
		public PresentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_present; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterPresent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitPresent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitPresent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PresentContext present() throws RecognitionException {
		PresentContext _localctx = new PresentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_present);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__24);
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

	public static class AbsentContext extends ParserRuleContext {
		public AbsentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterAbsent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitAbsent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitAbsent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsentContext absent() throws RecognitionException {
		AbsentContext _localctx = new AbsentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_absent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__25);
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

	public static class AlphanumericContext extends ParserRuleContext {
		public AlphanumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphanumeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterAlphanumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitAlphanumeric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitAlphanumeric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphanumericContext alphanumeric() throws RecognitionException {
		AlphanumericContext _localctx = new AlphanumericContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_alphanumeric);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__26);
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

	public static class MandatoryContext extends ParserRuleContext {
		public MandatoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mandatory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterMandatory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitMandatory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitMandatory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MandatoryContext mandatory() throws RecognitionException {
		MandatoryContext _localctx = new MandatoryContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mandatory);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__27);
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

	public static class ValidContext extends ParserRuleContext {
		public ValidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterValid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitValid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitValid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidContext valid() throws RecognitionException {
		ValidContext _localctx = new ValidContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_valid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__28);
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

	public static class ConsistentContext extends ParserRuleContext {
		public ConsistentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consistent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterConsistent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitConsistent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitConsistent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsistentContext consistent() throws RecognitionException {
		ConsistentContext _localctx = new ConsistentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_consistent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__29);
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

	public static class NumericContext extends ParserRuleContext {
		public NumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitNumeric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitNumeric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericContext numeric() throws RecognitionException {
		NumericContext _localctx = new NumericContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_numeric);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__30);
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

	public static class BeforeContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public BeforeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_before; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterBefore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitBefore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitBefore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeforeContext before() throws RecognitionException {
		BeforeContext _localctx = new BeforeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_before);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__31);
			setState(299);
			date();
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

	public static class AfterContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public AfterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_after; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterAfter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitAfter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitAfter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AfterContext after() throws RecognitionException {
		AfterContext _localctx = new AfterContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_after);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__32);
			setState(302);
			date();
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

	public static class DateTodayContext extends ParserRuleContext {
		public DateTodayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateToday; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterDateToday(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitDateToday(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitDateToday(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateTodayContext dateToday() throws RecognitionException {
		DateTodayContext _localctx = new DateTodayContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dateToday);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(T__33);
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

	public static class DateTomorrowContext extends ParserRuleContext {
		public DateTomorrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTomorrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterDateTomorrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitDateTomorrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitDateTomorrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateTomorrowContext dateTomorrow() throws RecognitionException {
		DateTomorrowContext _localctx = new DateTomorrowContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dateTomorrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__34);
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

	public static class DateYesterdayContext extends ParserRuleContext {
		public DateYesterdayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateYesterday; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterDateYesterday(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitDateYesterday(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitDateYesterday(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateYesterdayContext dateYesterday() throws RecognitionException {
		DateYesterdayContext _localctx = new DateYesterdayContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dateYesterday);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__35);
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

	public static class DateContext extends ParserRuleContext {
		public DateTodayContext dateToday() {
			return getRuleContext(DateTodayContext.class,0);
		}
		public DateTomorrowContext dateTomorrow() {
			return getRuleContext(DateTomorrowContext.class,0);
		}
		public DateYesterdayContext dateYesterday() {
			return getRuleContext(DateYesterdayContext.class,0);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_date);
		try {
			setState(313);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				dateToday();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				dateTomorrow();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				dateYesterday();
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

	public static class OnlyIfContext extends ParserRuleContext {
		public OnlyIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onlyIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterOnlyIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitOnlyIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitOnlyIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnlyIfContext onlyIf() throws RecognitionException {
		OnlyIfContext _localctx = new OnlyIfContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_onlyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__36);
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

	public static class OpenBracketContext extends ParserRuleContext {
		public OpenBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterOpenBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitOpenBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitOpenBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenBracketContext openBracket() throws RecognitionException {
		OpenBracketContext _localctx = new OpenBracketContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_openBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__37);
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

	public static class CloseBracketContext extends ParserRuleContext {
		public CloseBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).enterCloseBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FixRulesListener ) ((FixRulesListener)listener).exitCloseBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FixRulesVisitor ) return ((FixRulesVisitor<? extends T>)visitor).visitCloseBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseBracketContext closeBracket() throws RecognitionException {
		CloseBracketContext _localctx = new CloseBracketContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_closeBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__38);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u0144\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\6\2`\n\2\r\2\16\2a\3\3\3\3\3\3\3\3\3\3\5\3"+
		"i\n\3\3\3\3\3\3\3\5\3n\n\3\7\3p\n\3\f\3\16\3s\13\3\3\4\3\4\3\4\5\4x\n"+
		"\4\3\4\3\4\3\4\5\4}\n\4\3\4\5\4\u0080\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u008c\n\5\3\6\3\6\3\7\3\7\3\7\6\7\u0093\n\7\r\7\16\7"+
		"\u0094\3\b\3\b\3\t\3\t\5\t\u009b\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b5"+
		"\n\r\3\16\5\16\u00b8\n\16\3\16\3\16\3\17\5\17\u00bd\n\17\3\17\3\17\3\17"+
		"\7\17\u00c2\n\17\f\17\16\17\u00c5\13\17\3\17\5\17\u00c8\n\17\3\20\3\20"+
		"\3\20\3\20\7\20\u00ce\n\20\f\20\16\20\u00d1\13\20\3\20\3\20\7\20\u00d5"+
		"\n\20\f\20\16\20\u00d8\13\20\7\20\u00da\n\20\f\20\16\20\u00dd\13\20\3"+
		"\21\3\21\3\21\5\21\u00e2\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00ff\n\22\3\23\3\23\3\24\3\24\5\24\u0105"+
		"\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\5\30\u010f\n\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3,\5,\u013c\n,\3-\3-\3.\3.\3/\3/\3/\2\2\60\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\5\3\2"+
		"\4\7\3\2/\65\4\2+,99\u013e\2_\3\2\2\2\4c\3\2\2\2\6t\3\2\2\2\b\u008b\3"+
		"\2\2\2\n\u008d\3\2\2\2\f\u008f\3\2\2\2\16\u0096\3\2\2\2\20\u009a\3\2\2"+
		"\2\22\u009c\3\2\2\2\24\u00a0\3\2\2\2\26\u00a2\3\2\2\2\30\u00b4\3\2\2\2"+
		"\32\u00b7\3\2\2\2\34\u00bc\3\2\2\2\36\u00c9\3\2\2\2 \u00e1\3\2\2\2\"\u00fe"+
		"\3\2\2\2$\u0100\3\2\2\2&\u0104\3\2\2\2(\u0106\3\2\2\2*\u0108\3\2\2\2,"+
		"\u010a\3\2\2\2.\u010c\3\2\2\2\60\u0110\3\2\2\2\62\u0112\3\2\2\2\64\u0114"+
		"\3\2\2\2\66\u0116\3\2\2\28\u0118\3\2\2\2:\u011a\3\2\2\2<\u011c\3\2\2\2"+
		">\u011e\3\2\2\2@\u0120\3\2\2\2B\u0122\3\2\2\2D\u0124\3\2\2\2F\u0126\3"+
		"\2\2\2H\u0128\3\2\2\2J\u012a\3\2\2\2L\u012c\3\2\2\2N\u012f\3\2\2\2P\u0132"+
		"\3\2\2\2R\u0134\3\2\2\2T\u0136\3\2\2\2V\u013b\3\2\2\2X\u013d\3\2\2\2Z"+
		"\u013f\3\2\2\2\\\u0141\3\2\2\2^`\5\6\4\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2"+
		"ab\3\2\2\2b\3\3\2\2\2cd\5X-\2de\5\22\n\2eq\5\b\5\2fh\5&\24\2gi\5Z.\2h"+
		"g\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\5\22\n\2km\5\b\5\2ln\5\\/\2ml\3\2\2\2"+
		"mn\3\2\2\2np\3\2\2\2of\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\5\3\2\2"+
		"\2sq\3\2\2\2tu\5\22\n\2uw\5\b\5\2vx\5\4\3\2wv\3\2\2\2wx\3\2\2\2xy\3\2"+
		"\2\2y|\7\3\2\2z{\7:\2\2{}\5\n\6\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~\u0080"+
		"\7-\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\7\3\2\2\2\u0081\u0082\5\32"+
		"\16\2\u0082\u0083\5\34\17\2\u0083\u008c\3\2\2\2\u0084\u0085\5\16\b\2\u0085"+
		"\u0086\5\f\7\2\u0086\u008c\3\2\2\2\u0087\u0088\5\16\b\2\u0088\u0089\5"+
		"\20\t\2\u0089\u008c\3\2\2\2\u008a\u008c\5\36\20\2\u008b\u0081\3\2\2\2"+
		"\u008b\u0084\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u008a\3\2\2\2\u008c\t\3"+
		"\2\2\2\u008d\u008e\t\2\2\2\u008e\13\3\2\2\2\u008f\u0092\5\22\n\2\u0090"+
		"\u0091\7\b\2\2\u0091\u0093\5\22\n\2\u0092\u0090\3\2\2\2\u0093\u0094\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\r\3\2\2\2\u0096\u0097"+
		"\t\3\2\2\u0097\17\3\2\2\2\u0098\u009b\5\24\13\2\u0099\u009b\5\22\n\2\u009a"+
		"\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\21\3\2\2\2\u009c\u009d\7\t\2"+
		"\2\u009d\u009e\7+\2\2\u009e\u009f\7\n\2\2\u009f\23\3\2\2\2\u00a0\u00a1"+
		"\t\4\2\2\u00a1\25\3\2\2\2\u00a2\u00a3\5\64\33\2\u00a3\27\3\2\2\2\u00a4"+
		"\u00a5\7\13\2\2\u00a5\u00a6\7,\2\2\u00a6\u00a7\7\f\2\2\u00a7\u00a8\7,"+
		"\2\2\u00a8\u00b5\7\n\2\2\u00a9\u00aa\7\13\2\2\u00aa\u00ab\7+\2\2\u00ab"+
		"\u00ac\7\f\2\2\u00ac\u00ad\7+\2\2\u00ad\u00b5\7\n\2\2\u00ae\u00af\7\13"+
		"\2\2\u00af\u00b0\5V,\2\u00b0\u00b1\7\f\2\2\u00b1\u00b2\5V,\2\u00b2\u00b3"+
		"\7\n\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00a4\3\2\2\2\u00b4\u00a9\3\2\2\2\u00b4"+
		"\u00ae\3\2\2\2\u00b5\31\3\2\2\2\u00b6\u00b8\5,\27\2\u00b7\u00b6\3\2\2"+
		"\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\r\2\2\u00ba\33"+
		"\3\2\2\2\u00bb\u00bd\7\16\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2"+
		"\u00bd\u00be\3\2\2\2\u00be\u00c3\5\24\13\2\u00bf\u00c0\7\f\2\2\u00c0\u00c2"+
		"\5\24\13\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2"+
		"\u00c3\u00c4\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8"+
		"\7\17\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\35\3\2\2\2\u00c9"+
		"\u00ca\5 \21\2\u00ca\u00db\5\"\22\2\u00cb\u00cf\5&\24\2\u00cc\u00ce\5"+
		"Z.\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d6\5\36"+
		"\20\2\u00d3\u00d5\5\\/\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d9\u00cb\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\37\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e2\5.\30"+
		"\2\u00df\u00e2\5\60\31\2\u00e0\u00e2\5\62\32\2\u00e1\u00de\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2!\3\2\2\2\u00e3\u00ff\5> \2\u00e4"+
		"\u00ff\5@!\2\u00e5\u00ff\5D#\2\u00e6\u00ff\5F$\2\u00e7\u00ff\5H%\2\u00e8"+
		"\u00ff\5J&\2\u00e9\u00ff\5B\"\2\u00ea\u00ff\5L\'\2\u00eb\u00ff\5N(\2\u00ec"+
		"\u00ed\5\32\16\2\u00ed\u00ee\5\34\17\2\u00ee\u00ff\3\2\2\2\u00ef\u00f0"+
		"\5\26\f\2\u00f0\u00f1\5\30\r\2\u00f1\u00ff\3\2\2\2\u00f2\u00f3\5:\36\2"+
		"\u00f3\u00f4\5\20\t\2\u00f4\u00ff\3\2\2\2\u00f5\u00f6\5<\37\2\u00f6\u00f7"+
		"\5\20\t\2\u00f7\u00ff\3\2\2\2\u00f8\u00f9\5\66\34\2\u00f9\u00fa\5\20\t"+
		"\2\u00fa\u00ff\3\2\2\2\u00fb\u00fc\58\35\2\u00fc\u00fd\5$\23\2\u00fd\u00ff"+
		"\3\2\2\2\u00fe\u00e3\3\2\2\2\u00fe\u00e4\3\2\2\2\u00fe\u00e5\3\2\2\2\u00fe"+
		"\u00e6\3\2\2\2\u00fe\u00e7\3\2\2\2\u00fe\u00e8\3\2\2\2\u00fe\u00e9\3\2"+
		"\2\2\u00fe\u00ea\3\2\2\2\u00fe\u00eb\3\2\2\2\u00fe\u00ec\3\2\2\2\u00fe"+
		"\u00ef\3\2\2\2\u00fe\u00f2\3\2\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f8\3\2"+
		"\2\2\u00fe\u00fb\3\2\2\2\u00ff#\3\2\2\2\u0100\u0101\79\2\2\u0101%\3\2"+
		"\2\2\u0102\u0105\5*\26\2\u0103\u0105\5(\25\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0103\3\2\2\2\u0105\'\3\2\2\2\u0106\u0107\7\20\2\2\u0107)\3\2\2\2\u0108"+
		"\u0109\7\21\2\2\u0109+\3\2\2\2\u010a\u010b\7\22\2\2\u010b-\3\2\2\2\u010c"+
		"\u010e\7\23\2\2\u010d\u010f\5,\27\2\u010e\u010d\3\2\2\2\u010e\u010f\3"+
		"\2\2\2\u010f/\3\2\2\2\u0110\u0111\7\24\2\2\u0111\61\3\2\2\2\u0112\u0113"+
		"\7\25\2\2\u0113\63\3\2\2\2\u0114\u0115\7\26\2\2\u0115\65\3\2\2\2\u0116"+
		"\u0117\7\27\2\2\u0117\67\3\2\2\2\u0118\u0119\7\30\2\2\u01199\3\2\2\2\u011a"+
		"\u011b\7\31\2\2\u011b;\3\2\2\2\u011c\u011d\7\32\2\2\u011d=\3\2\2\2\u011e"+
		"\u011f\7\33\2\2\u011f?\3\2\2\2\u0120\u0121\7\34\2\2\u0121A\3\2\2\2\u0122"+
		"\u0123\7\35\2\2\u0123C\3\2\2\2\u0124\u0125\7\36\2\2\u0125E\3\2\2\2\u0126"+
		"\u0127\7\37\2\2\u0127G\3\2\2\2\u0128\u0129\7 \2\2\u0129I\3\2\2\2\u012a"+
		"\u012b\7!\2\2\u012bK\3\2\2\2\u012c\u012d\7\"\2\2\u012d\u012e\5V,\2\u012e"+
		"M\3\2\2\2\u012f\u0130\7#\2\2\u0130\u0131\5V,\2\u0131O\3\2\2\2\u0132\u0133"+
		"\7$\2\2\u0133Q\3\2\2\2\u0134\u0135\7%\2\2\u0135S\3\2\2\2\u0136\u0137\7"+
		"&\2\2\u0137U\3\2\2\2\u0138\u013c\5P)\2\u0139\u013c\5R*\2\u013a\u013c\5"+
		"T+\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c"+
		"W\3\2\2\2\u013d\u013e\7\'\2\2\u013eY\3\2\2\2\u013f\u0140\7(\2\2\u0140"+
		"[\3\2\2\2\u0141\u0142\7)\2\2\u0142]\3\2\2\2\31ahmqw|\177\u008b\u0094\u009a"+
		"\u00b4\u00b7\u00bc\u00c3\u00c7\u00cf\u00d6\u00db\u00e1\u00fe\u0104\u010e"+
		"\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}