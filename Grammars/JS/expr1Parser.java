// Generated from expr1.g4 by ANTLR 4.7.1

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
public class expr1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MUL=2, DIV=3, ADD=4, SUB=5, MODULO=6, PLUSEQ=7, MINUSEQ=8, PRINT=9, 
		LP=10, RP=11, ENDTOK=12, SPACE=13, VAR=14, COMMENT=15, NUM=16, ID=17, 
		WS=18;
	public static final int
		RULE_s = 0, RULE_inc = 1, RULE_dec = 2, RULE_print = 3, RULE_declare = 4, 
		RULE_expr = 5;
	public static final String[] ruleNames = {
		"s", "inc", "dec", "print", "declare", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'*'", "'/'", "'+'", "'-'", "'%'", "'+='", "'-='", "'console.log'", 
		"'('", "')'", "';'", "' '", "'var'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "MUL", "DIV", "ADD", "SUB", "MODULO", "PLUSEQ", "MINUSEQ", 
		"PRINT", "LP", "RP", "ENDTOK", "SPACE", "VAR", "COMMENT", "NUM", "ID", 
		"WS"
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
	public String getGrammarFileName() { return "expr1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String,Integer> mem = new HashMap<String,Integer>();
	    
	  // member functions ---  
	  
	  /**
	   * getValue - returns the value of var  
	   * @param var - name of existing variable 
	   * @return value of var or 0 if no such var AND display error message
	   */
	  int getValue(String var) {
	     if (mem.containsKey(var) ) {
	             return mem.get(var);
	     }
	     else {
	       System.out.println("Error: undefined var : " + var) ;
	       return 0;
	     }  
	  }
	   
	  /**
	   * setVarVal - set memory var to the value of val. 
	   *             if no such var, create it.  
	   * @param var - name of existing variable
	   * @param val - value to assign to var
	   * @return - no value returned
	   */
	  void setVarVal(String var, int val) {    
	        mem.put(var,val);
	  }
	  
	   /**
	    * incVarVal - increment memory var by the value of val.
	    *             if no such variable, print error message
	    * @param var - name of existing variable
	    * @param val - value to increment by 
	    * @return - no value returned
	   */
	  void incVarVal(String var, int val) {
	     if (mem.containsKey(var) ) {
	        int oldval = mem.get(var);
	        mem.put(var,oldval+val);
	     }
	     else System.out.println("Error: undefined var : " + var) ;
	  } 
	  
	  /**
	   * printvalue - print the value of var
	   *             if no such variable, print error message
	   * @param var - name of existing variable
	   * @return - no value returned
	   */
	  void printvalue (String var) {

	    if (mem.containsKey(var) ) {
	     System.out.println( mem.get(var) );
	    }
	    else {
	      System.out.println("ReferenceError: " + var +  " is not defined");
	    }  
	  } 
	  

	public expr1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public List<TerminalNode> ENDTOK() { return getTokens(expr1Parser.ENDTOK); }
		public TerminalNode ENDTOK(int i) {
			return getToken(expr1Parser.ENDTOK, i);
		}
		public List<DeclareContext> declare() {
			return getRuleContexts(DeclareContext.class);
		}
		public DeclareContext declare(int i) {
			return getRuleContext(DeclareContext.class,i);
		}
		public List<IncContext> inc() {
			return getRuleContexts(IncContext.class);
		}
		public IncContext inc(int i) {
			return getRuleContext(IncContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(expr1Parser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(expr1Parser.SPACE, i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expr1Listener ) ((expr1Listener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expr1Listener ) ((expr1Listener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(12);
					declare();
					}
					break;
				case 2:
					{
					setState(13);
					inc();
					}
					break;
				case 3:
					{
					setState(14);
					print();
					}
					break;
				case 4:
					{
					setState(15);
					dec();
					}
					break;
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(18);
					match(SPACE);
					}
				}

				setState(21);
				match(ENDTOK);
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << SPACE) | (1L << VAR) | (1L << ID))) != 0) );
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

	public static class IncContext extends ParserRuleContext {
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(expr1Parser.ID, 0); }
		public TerminalNode PLUSEQ() { return getToken(expr1Parser.PLUSEQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(expr1Parser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(expr1Parser.SPACE, i);
		}
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expr1Listener ) ((expr1Listener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expr1Listener ) ((expr1Listener)listener).exitInc(this);
		}
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			((IncContext)_localctx).ID = match(ID);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(28);
				match(SPACE);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(PLUSEQ);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(35);
				match(SPACE);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			((IncContext)_localctx).expr = expr(0);
			incVarVal((((IncContext)_localctx).ID!=null?((IncContext)_localctx).ID.getText():null), ((IncContext)_localctx).expr.val);        
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

	public static class DecContext extends ParserRuleContext {
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(expr1Parser.ID, 0); }
		public TerminalNode MINUSEQ() { return getToken(expr1Parser.MINUSEQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(expr1Parser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(expr1Parser.SPACE, i);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expr1Listener ) ((expr1Listener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expr1Listener ) ((expr1Listener)listener).exitDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			((DecContext)_localctx).ID = match(ID);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(45);
				match(SPACE);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(MINUSEQ);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(52);
				match(SPACE);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			((DecContext)_localctx).expr = expr(0);
			incVarVal((((DecContext)_localctx).ID!=null?((DecContext)_localctx).ID.getText():null), (((DecContext)_localctx).expr.val * -1));        
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
		public TerminalNode PRINT() { return getToken(expr1Parser.PRINT, 0); }
		public TerminalNode LP() { return getToken(expr1Parser.LP, 0); }
		public TerminalNode ID() { return getToken(expr1Parser.ID, 0); }
		public TerminalNode RP() { return getToken(expr1Parser.RP, 0); }
		public List<TerminalNode> SPACE() { return getTokens(expr1Parser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(expr1Parser.SPACE, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expr1Listener ) ((expr1Listener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expr1Listener ) ((expr1Listener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(PRINT);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(62);
				match(SPACE);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(LP);
			setState(69);
			((PrintContext)_localctx).ID = match(ID);
			setState(70);
			match(RP);
			printvalue((((PrintContext)_localctx).ID!=null?((PrintContext)_localctx).ID.getText():null));          
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

	public static class DeclareContext extends ParserRuleContext {
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(expr1Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode VAR() { return getToken(expr1Parser.VAR, 0); }
		public List<TerminalNode> SPACE() { return getTokens(expr1Parser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(expr1Parser.SPACE, i);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expr1Listener ) ((expr1Listener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expr1Listener ) ((expr1Listener)listener).exitDeclare(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(73);
				match(VAR);
				}
			}

			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(76);
				match(SPACE);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			((DeclareContext)_localctx).ID = match(ID);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(83);
				match(SPACE);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(T__0);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(90);
				match(SPACE);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			((DeclareContext)_localctx).expr = expr(0);
			setVarVal((((DeclareContext)_localctx).ID!=null?((DeclareContext)_localctx).ID.getText():null), ((DeclareContext)_localctx).expr.val);	       	
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
		public int val;
		public ExprContext a;
		public Token NUM;
		public Token ID;
		public ExprContext e;
		public ExprContext b;
		public TerminalNode NUM() { return getToken(expr1Parser.NUM, 0); }
		public TerminalNode ID() { return getToken(expr1Parser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(expr1Parser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(expr1Parser.SPACE, i);
		}
		public TerminalNode MUL() { return getToken(expr1Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(expr1Parser.DIV, 0); }
		public TerminalNode MODULO() { return getToken(expr1Parser.MODULO, 0); }
		public TerminalNode ADD() { return getToken(expr1Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(expr1Parser.SUB, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expr1Listener ) ((expr1Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expr1Listener ) ((expr1Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(100);
				((ExprContext)_localctx).NUM = match(NUM);
				((ExprContext)_localctx).val =  (((ExprContext)_localctx).NUM!=null?Integer.valueOf(((ExprContext)_localctx).NUM.getText()):0);        
				}
				break;
			case ID:
				{
				setState(102);
				((ExprContext)_localctx).ID = match(ID);
				((ExprContext)_localctx).val =  getValue((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)); 
				}
				break;
			case LP:
				{
				setState(104);
				match(LP);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(105);
					match(SPACE);
					}
				}

				setState(108);
				((ExprContext)_localctx).e = expr(0);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(109);
					match(SPACE);
					}
				}

				setState(112);
				match(RP);
				((ExprContext)_localctx).val =  ((ExprContext)_localctx).e.val;             
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(119);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(118);
							match(SPACE);
							}
						}

						setState(121);
						match(MUL);
						setState(123);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(122);
							match(SPACE);
							}
						}

						setState(125);
						((ExprContext)_localctx).b = expr(9);
						((ExprContext)_localctx).val =  ((ExprContext)_localctx).a.val * ((ExprContext)_localctx).b.val; 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(130);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(129);
							match(SPACE);
							}
						}

						setState(132);
						match(DIV);
						setState(134);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(133);
							match(SPACE);
							}
						}

						setState(136);
						((ExprContext)_localctx).b = expr(8);
						((ExprContext)_localctx).val =  ((ExprContext)_localctx).a.val / ((ExprContext)_localctx).b.val; 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(141);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(140);
							match(SPACE);
							}
						}

						setState(143);
						match(MODULO);
						setState(145);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(144);
							match(SPACE);
							}
						}

						setState(147);
						((ExprContext)_localctx).b = expr(7);
						((ExprContext)_localctx).val =  ((ExprContext)_localctx).a.val % ((ExprContext)_localctx).b.val; 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(152);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(151);
							match(SPACE);
							}
						}

						setState(154);
						match(ADD);
						setState(156);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(155);
							match(SPACE);
							}
						}

						setState(158);
						((ExprContext)_localctx).b = expr(6);
						((ExprContext)_localctx).val =  ((ExprContext)_localctx).a.val + ((ExprContext)_localctx).b.val; 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(163);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(162);
							match(SPACE);
							}
						}

						setState(165);
						match(SUB);
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(166);
							match(SPACE);
							}
						}

						setState(169);
						((ExprContext)_localctx).b = expr(5);
						((ExprContext)_localctx).val =  ((ExprContext)_localctx).a.val - ((ExprContext)_localctx).b.val; 
						}
						break;
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u00b4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\5\2\23\n\2\3"+
		"\2\5\2\26\n\2\3\2\3\2\6\2\32\n\2\r\2\16\2\33\3\3\3\3\7\3 \n\3\f\3\16\3"+
		"#\13\3\3\3\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\3\3\3\4\3\4\7\4\61\n\4"+
		"\f\4\16\4\64\13\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\3\4\3\5\3\5"+
		"\7\5B\n\5\f\5\16\5E\13\5\3\5\3\5\3\5\3\5\3\5\3\6\5\6M\n\6\3\6\7\6P\n\6"+
		"\f\6\16\6S\13\6\3\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\6\3\6\7\6^\n\6\f\6\16"+
		"\6a\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7m\n\7\3\7\3\7\5\7"+
		"q\n\7\3\7\3\7\3\7\5\7v\n\7\3\7\3\7\5\7z\n\7\3\7\3\7\5\7~\n\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u0085\n\7\3\7\3\7\5\7\u0089\n\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u0090\n\7\3\7\3\7\5\7\u0094\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u009b\n\7\3\7"+
		"\3\7\5\7\u009f\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a6\n\7\3\7\3\7\5\7\u00aa"+
		"\n\7\3\7\3\7\3\7\7\7\u00af\n\7\f\7\16\7\u00b2\13\7\3\7\2\3\f\b\2\4\6\b"+
		"\n\f\2\2\2\u00ce\2\31\3\2\2\2\4\35\3\2\2\2\6.\3\2\2\2\b?\3\2\2\2\nL\3"+
		"\2\2\2\fu\3\2\2\2\16\23\5\n\6\2\17\23\5\4\3\2\20\23\5\b\5\2\21\23\5\6"+
		"\4\2\22\16\3\2\2\2\22\17\3\2\2\2\22\20\3\2\2\2\22\21\3\2\2\2\23\25\3\2"+
		"\2\2\24\26\7\17\2\2\25\24\3\2\2\2\25\26\3\2\2\2\26\27\3\2\2\2\27\30\7"+
		"\16\2\2\30\32\3\2\2\2\31\22\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34"+
		"\3\2\2\2\34\3\3\2\2\2\35!\7\23\2\2\36 \7\17\2\2\37\36\3\2\2\2 #\3\2\2"+
		"\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$(\7\t\2\2%\'\7\17\2\2&"+
		"%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\5\f\7\2"+
		",-\b\3\1\2-\5\3\2\2\2.\62\7\23\2\2/\61\7\17\2\2\60/\3\2\2\2\61\64\3\2"+
		"\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\659\7\n\2"+
		"\2\668\7\17\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2"+
		"\2;9\3\2\2\2<=\5\f\7\2=>\b\4\1\2>\7\3\2\2\2?C\7\13\2\2@B\7\17\2\2A@\3"+
		"\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\f\2\2GH\7"+
		"\23\2\2HI\7\r\2\2IJ\b\5\1\2J\t\3\2\2\2KM\7\20\2\2LK\3\2\2\2LM\3\2\2\2"+
		"MQ\3\2\2\2NP\7\17\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2"+
		"\2SQ\3\2\2\2TX\7\23\2\2UW\7\17\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2"+
		"\2\2Y[\3\2\2\2ZX\3\2\2\2[_\7\3\2\2\\^\7\17\2\2]\\\3\2\2\2^a\3\2\2\2_]"+
		"\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\5\f\7\2cd\b\6\1\2d\13\3\2\2\2"+
		"ef\b\7\1\2fg\7\22\2\2gv\b\7\1\2hi\7\23\2\2iv\b\7\1\2jl\7\f\2\2km\7\17"+
		"\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2np\5\f\7\2oq\7\17\2\2po\3\2\2\2pq\3"+
		"\2\2\2qr\3\2\2\2rs\7\r\2\2st\b\7\1\2tv\3\2\2\2ue\3\2\2\2uh\3\2\2\2uj\3"+
		"\2\2\2v\u00b0\3\2\2\2wy\f\n\2\2xz\7\17\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2"+
		"\2{}\7\4\2\2|~\7\17\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\5\f"+
		"\7\13\u0080\u0081\b\7\1\2\u0081\u00af\3\2\2\2\u0082\u0084\f\t\2\2\u0083"+
		"\u0085\7\17\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0088\7\5\2\2\u0087\u0089\7\17\2\2\u0088\u0087\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\5\f\7\n\u008b\u008c\b\7"+
		"\1\2\u008c\u00af\3\2\2\2\u008d\u008f\f\b\2\2\u008e\u0090\7\17\2\2\u008f"+
		"\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\7\b"+
		"\2\2\u0092\u0094\7\17\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\5\f\7\t\u0096\u0097\b\7\1\2\u0097\u00af\3\2"+
		"\2\2\u0098\u009a\f\7\2\2\u0099\u009b\7\17\2\2\u009a\u0099\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\7\6\2\2\u009d\u009f\7\17"+
		"\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\5\f\7\b\u00a1\u00a2\b\7\1\2\u00a2\u00af\3\2\2\2\u00a3\u00a5\f\6"+
		"\2\2\u00a4\u00a6\7\17\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a9\7\7\2\2\u00a8\u00aa\7\17\2\2\u00a9\u00a8\3"+
		"\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\5\f\7\7\u00ac"+
		"\u00ad\b\7\1\2\u00ad\u00af\3\2\2\2\u00aew\3\2\2\2\u00ae\u0082\3\2\2\2"+
		"\u00ae\u008d\3\2\2\2\u00ae\u0098\3\2\2\2\u00ae\u00a3\3\2\2\2\u00af\u00b2"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\r\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\35\22\25\33!(\629CLQX_lpuy}\u0084\u0088\u008f\u0093\u009a"+
		"\u009e\u00a5\u00a9\u00ae\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}