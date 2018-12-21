// Generated from expr1.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class expr1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MUL=2, DIV=3, ADD=4, SUB=5, MODULO=6, PLUSEQ=7, MINUSEQ=8, PRINT=9, 
		LP=10, RP=11, ENDTOK=12, SPACE=13, VAR=14, COMMENT=15, NUM=16, ID=17, 
		WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "MUL", "DIV", "ADD", "SUB", "MODULO", "PLUSEQ", "MINUSEQ", "PRINT", 
		"LP", "RP", "ENDTOK", "SPACE", "VAR", "COMMENT", "NUM", "ID", "WS"
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


	public expr1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "expr1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24r\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\7\20T\n\20\f"+
		"\20\16\20W\13\20\3\20\3\20\3\21\6\21\\\n\21\r\21\16\21]\3\22\6\22a\n\22"+
		"\r\22\16\22b\3\22\3\22\7\22g\n\22\f\22\16\22j\13\22\3\23\6\23m\n\23\r"+
		"\23\16\23n\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\6\4\2\f\f\17\17\3\2\62"+
		";\6\2//C\\aac|\5\2\13\f\17\17\"\"\2w\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2"+
		"\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2\21\66"+
		"\3\2\2\2\239\3\2\2\2\25E\3\2\2\2\27G\3\2\2\2\31I\3\2\2\2\33K\3\2\2\2\35"+
		"M\3\2\2\2\37Q\3\2\2\2![\3\2\2\2#`\3\2\2\2%l\3\2\2\2\'(\7?\2\2(\4\3\2\2"+
		"\2)*\7,\2\2*\6\3\2\2\2+,\7\61\2\2,\b\3\2\2\2-.\7-\2\2.\n\3\2\2\2/\60\7"+
		"/\2\2\60\f\3\2\2\2\61\62\7\'\2\2\62\16\3\2\2\2\63\64\7-\2\2\64\65\7?\2"+
		"\2\65\20\3\2\2\2\66\67\7/\2\2\678\7?\2\28\22\3\2\2\29:\7e\2\2:;\7q\2\2"+
		";<\7p\2\2<=\7u\2\2=>\7q\2\2>?\7n\2\2?@\7g\2\2@A\7\60\2\2AB\7n\2\2BC\7"+
		"q\2\2CD\7i\2\2D\24\3\2\2\2EF\7*\2\2F\26\3\2\2\2GH\7+\2\2H\30\3\2\2\2I"+
		"J\7=\2\2J\32\3\2\2\2KL\7\"\2\2L\34\3\2\2\2MN\7x\2\2NO\7c\2\2OP\7t\2\2"+
		"P\36\3\2\2\2QU\7%\2\2RT\n\2\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2"+
		"\2VX\3\2\2\2WU\3\2\2\2XY\b\20\2\2Y \3\2\2\2Z\\\t\3\2\2[Z\3\2\2\2\\]\3"+
		"\2\2\2][\3\2\2\2]^\3\2\2\2^\"\3\2\2\2_a\t\4\2\2`_\3\2\2\2ab\3\2\2\2b`"+
		"\3\2\2\2bc\3\2\2\2ch\3\2\2\2dg\5!\21\2eg\t\4\2\2fd\3\2\2\2fe\3\2\2\2g"+
		"j\3\2\2\2hf\3\2\2\2hi\3\2\2\2i$\3\2\2\2jh\3\2\2\2km\t\5\2\2lk\3\2\2\2"+
		"mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\b\23\2\2q&\3\2\2\2\t\2U]bf"+
		"hn\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}