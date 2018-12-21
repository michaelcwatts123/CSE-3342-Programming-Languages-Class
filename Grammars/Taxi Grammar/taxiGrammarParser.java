// Generated from taxiGrammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class taxiGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NUM=4, DIGIT=5, Q=6, TTOK=7, STR=8, WS=9;
	public static final int
		RULE_s = 0, RULE_stringdec = 1, RULE_numdec = 2;
	public static final String[] ruleNames = {
		"s", "stringdec", "numdec"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'is waiting at'", "'Writer's Depot.'", "'Starchild Numerology.'", 
		null, null, "'\"'", "'the'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "NUM", "DIGIT", "Q", "TTOK", "STR", "WS"
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
	public String getGrammarFileName() { return "taxiGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public taxiGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public List<StringdecContext> stringdec() {
			return getRuleContexts(StringdecContext.class);
		}
		public StringdecContext stringdec(int i) {
			return getRuleContext(StringdecContext.class,i);
		}
		public List<NumdecContext> numdec() {
			return getRuleContexts(NumdecContext.class);
		}
		public NumdecContext numdec(int i) {
			return getRuleContext(NumdecContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taxiGrammarListener ) ((taxiGrammarListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taxiGrammarListener ) ((taxiGrammarListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(8);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Q:
					{
					setState(6);
					stringdec();
					}
					break;
				case NUM:
					{
					setState(7);
					numdec();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(10); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUM || _la==Q );
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

	public static class StringdecContext extends ParserRuleContext {
		public List<TerminalNode> Q() { return getTokens(taxiGrammarParser.Q); }
		public TerminalNode Q(int i) {
			return getToken(taxiGrammarParser.Q, i);
		}
		public TerminalNode STR() { return getToken(taxiGrammarParser.STR, 0); }
		public List<TerminalNode> TTOK() { return getTokens(taxiGrammarParser.TTOK); }
		public TerminalNode TTOK(int i) {
			return getToken(taxiGrammarParser.TTOK, i);
		}
		public StringdecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringdec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taxiGrammarListener ) ((taxiGrammarListener)listener).enterStringdec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taxiGrammarListener ) ((taxiGrammarListener)listener).exitStringdec(this);
		}
	}

	public final StringdecContext stringdec() throws RecognitionException {
		StringdecContext _localctx = new StringdecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stringdec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(Q);
			setState(13);
			match(STR);
			setState(14);
			match(Q);
			setState(15);
			match(T__0);
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TTOK) {
				{
				{
				setState(16);
				match(TTOK);
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
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

	public static class NumdecContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(taxiGrammarParser.NUM, 0); }
		public List<TerminalNode> TTOK() { return getTokens(taxiGrammarParser.TTOK); }
		public TerminalNode TTOK(int i) {
			return getToken(taxiGrammarParser.TTOK, i);
		}
		public NumdecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numdec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof taxiGrammarListener ) ((taxiGrammarListener)listener).enterNumdec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof taxiGrammarListener ) ((taxiGrammarListener)listener).exitNumdec(this);
		}
	}

	public final NumdecContext numdec() throws RecognitionException {
		NumdecContext _localctx = new NumdecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numdec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(NUM);
			setState(25);
			match(T__0);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TTOK) {
				{
				{
				setState(26);
				match(TTOK);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(T__2);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13%\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\6\2\13\n\2\r\2\16\2\f\3\3\3\3\3\3\3\3\3\3\7\3\24\n"+
		"\3\f\3\16\3\27\13\3\3\3\3\3\3\4\3\4\3\4\7\4\36\n\4\f\4\16\4!\13\4\3\4"+
		"\3\4\3\4\2\2\5\2\4\6\2\2\2%\2\n\3\2\2\2\4\16\3\2\2\2\6\32\3\2\2\2\b\13"+
		"\5\4\3\2\t\13\5\6\4\2\n\b\3\2\2\2\n\t\3\2\2\2\13\f\3\2\2\2\f\n\3\2\2\2"+
		"\f\r\3\2\2\2\r\3\3\2\2\2\16\17\7\b\2\2\17\20\7\n\2\2\20\21\7\b\2\2\21"+
		"\25\7\3\2\2\22\24\7\t\2\2\23\22\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25"+
		"\26\3\2\2\2\26\30\3\2\2\2\27\25\3\2\2\2\30\31\7\4\2\2\31\5\3\2\2\2\32"+
		"\33\7\6\2\2\33\37\7\3\2\2\34\36\7\t\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\5\2\2#\7\3\2\2\2\6\n"+
		"\f\25\37";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}