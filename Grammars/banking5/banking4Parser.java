// Generated from banking4.g4 by ANTLR 4.7.1

    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class banking4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEPOSIT=1, WITHDRAW=2, PRINTTOK=3, NUM=4, DIGIT=5, ID=6, WS=7;
	public static final int
		RULE_s = 0, RULE_transaction = 1, RULE_deposit = 2, RULE_withdraw = 3, 
		RULE_print = 4;
	public static final String[] ruleNames = {
		"s", "transaction", "deposit", "withdraw", "print"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'dep'", "'withdraw'", "'print'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DEPOSIT", "WITHDRAW", "PRINTTOK", "NUM", "DIGIT", "ID", "WS"
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
	public String getGrammarFileName() { return "banking4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	    // member data ---
	    Map < String, Integer > customers = new HashMap < String, Integer >();
	    // member functions ---
	    void makeDeposit(String user, int amt) {
	        if (customers.containsKey(user)) {
	            System.out.println("Existing customer: " + user);
	        } else {
		    System.out.println("New User: " + user);
	        }
	        customers.put(user, amt);
	        System.out.println("Deposit of " + amt + " has been processed");
	    }
	    void makeWithdrawal(String user, int amt) {
	        if (customers.containsKey(user)) {
	            System.out.println("Existing customer: " + user);
	        } else {
	            System.out.println("New Customer " + user);
		    customers.put(user, 0);
	        }
		if(customers.get(user) > amt) {
		int x = customers.get(user) - amt;
	        customers.put(user, x);
	        System.out.println("Withdrawal of " + amt + " has been processed");
		} else {
		System.out.println("Withdraw of $" + amt + " has been denied for " + user);
		}
	    }

	public banking4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public List<TransactionContext> transaction() {
			return getRuleContexts(TransactionContext.class);
		}
		public TransactionContext transaction(int i) {
			return getRuleContext(TransactionContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banking4Listener ) ((banking4Listener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banking4Listener ) ((banking4Listener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(12);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(10);
					transaction();
					}
					break;
				case PRINTTOK:
					{
					setState(11);
					print();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(14); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PRINTTOK || _la==ID );
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

	public static class TransactionContext extends ParserRuleContext {
		public DepositContext deposit() {
			return getRuleContext(DepositContext.class,0);
		}
		public WithdrawContext withdraw() {
			return getRuleContext(WithdrawContext.class,0);
		}
		public TransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banking4Listener ) ((banking4Listener)listener).enterTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banking4Listener ) ((banking4Listener)listener).exitTransaction(this);
		}
	}

	public final TransactionContext transaction() throws RecognitionException {
		TransactionContext _localctx = new TransactionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_transaction);
		try {
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				deposit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				withdraw();
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

	public static class DepositContext extends ParserRuleContext {
		public Token ID;
		public Token NUM;
		public TerminalNode ID() { return getToken(banking4Parser.ID, 0); }
		public TerminalNode DEPOSIT() { return getToken(banking4Parser.DEPOSIT, 0); }
		public TerminalNode NUM() { return getToken(banking4Parser.NUM, 0); }
		public DepositContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deposit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banking4Listener ) ((banking4Listener)listener).enterDeposit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banking4Listener ) ((banking4Listener)listener).exitDeposit(this);
		}
	}

	public final DepositContext deposit() throws RecognitionException {
		DepositContext _localctx = new DepositContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_deposit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			((DepositContext)_localctx).ID = match(ID);
			setState(21);
			match(DEPOSIT);
			setState(22);
			((DepositContext)_localctx).NUM = match(NUM);

			    makeDeposit((((DepositContext)_localctx).ID!=null?((DepositContext)_localctx).ID.getText():null), (((DepositContext)_localctx).NUM!=null?Integer.valueOf(((DepositContext)_localctx).NUM.getText()):0));

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

	public static class WithdrawContext extends ParserRuleContext {
		public Token ID;
		public Token NUM;
		public TerminalNode ID() { return getToken(banking4Parser.ID, 0); }
		public TerminalNode WITHDRAW() { return getToken(banking4Parser.WITHDRAW, 0); }
		public TerminalNode NUM() { return getToken(banking4Parser.NUM, 0); }
		public WithdrawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withdraw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banking4Listener ) ((banking4Listener)listener).enterWithdraw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banking4Listener ) ((banking4Listener)listener).exitWithdraw(this);
		}
	}

	public final WithdrawContext withdraw() throws RecognitionException {
		WithdrawContext _localctx = new WithdrawContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_withdraw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			((WithdrawContext)_localctx).ID = match(ID);
			setState(26);
			match(WITHDRAW);
			setState(27);
			((WithdrawContext)_localctx).NUM = match(NUM);

			    makeWithdrawal((((WithdrawContext)_localctx).ID!=null?((WithdrawContext)_localctx).ID.getText():null), (((WithdrawContext)_localctx).NUM!=null?Integer.valueOf(((WithdrawContext)_localctx).NUM.getText()):0));

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

	public static class PrintContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode PRINTTOK() { return getToken(banking4Parser.PRINTTOK, 0); }
		public TerminalNode ID() { return getToken(banking4Parser.ID, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof banking4Listener ) ((banking4Listener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof banking4Listener ) ((banking4Listener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(PRINTTOK);
			setState(31);
			((PrintContext)_localctx).ID = match(ID);

			    if (customers.get((((PrintContext)_localctx).ID!=null?((PrintContext)_localctx).ID.getText():null)) != null) {
			      System.out.println((((PrintContext)_localctx).ID!=null?((PrintContext)_localctx).ID.getText():null) + " : $" + customers.get((((PrintContext)_localctx).ID!=null?((PrintContext)_localctx).ID.getText():null)));
			    } else {
			      System.out.println((((PrintContext)_localctx).ID!=null?((PrintContext)_localctx).ID.getText():null) + " : $" + 0);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t%\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\6\2\17\n\2\r\2\16\2\20\3\3\3\3\5\3"+
		"\25\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\2"+
		"\2\7\2\4\6\b\n\2\2\2\"\2\16\3\2\2\2\4\24\3\2\2\2\6\26\3\2\2\2\b\33\3\2"+
		"\2\2\n \3\2\2\2\f\17\5\4\3\2\r\17\5\n\6\2\16\f\3\2\2\2\16\r\3\2\2\2\17"+
		"\20\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\3\3\2\2\2\22\25\5\6\4\2\23"+
		"\25\5\b\5\2\24\22\3\2\2\2\24\23\3\2\2\2\25\5\3\2\2\2\26\27\7\b\2\2\27"+
		"\30\7\3\2\2\30\31\7\6\2\2\31\32\b\4\1\2\32\7\3\2\2\2\33\34\7\b\2\2\34"+
		"\35\7\4\2\2\35\36\7\6\2\2\36\37\b\5\1\2\37\t\3\2\2\2 !\7\5\2\2!\"\7\b"+
		"\2\2\"#\b\6\1\2#\13\3\2\2\2\5\16\20\24";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}