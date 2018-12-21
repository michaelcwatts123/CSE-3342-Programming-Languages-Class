// Generated from taxiGrammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link taxiGrammarParser}.
 */
public interface taxiGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link taxiGrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(taxiGrammarParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link taxiGrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(taxiGrammarParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link taxiGrammarParser#stringdec}.
	 * @param ctx the parse tree
	 */
	void enterStringdec(taxiGrammarParser.StringdecContext ctx);
	/**
	 * Exit a parse tree produced by {@link taxiGrammarParser#stringdec}.
	 * @param ctx the parse tree
	 */
	void exitStringdec(taxiGrammarParser.StringdecContext ctx);
	/**
	 * Enter a parse tree produced by {@link taxiGrammarParser#numdec}.
	 * @param ctx the parse tree
	 */
	void enterNumdec(taxiGrammarParser.NumdecContext ctx);
	/**
	 * Exit a parse tree produced by {@link taxiGrammarParser#numdec}.
	 * @param ctx the parse tree
	 */
	void exitNumdec(taxiGrammarParser.NumdecContext ctx);
}