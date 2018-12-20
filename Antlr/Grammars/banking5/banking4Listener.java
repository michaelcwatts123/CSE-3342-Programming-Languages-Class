// Generated from banking4.g4 by ANTLR 4.7.1

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link banking4Parser}.
 */
public interface banking4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link banking4Parser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(banking4Parser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link banking4Parser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(banking4Parser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link banking4Parser#transaction}.
	 * @param ctx the parse tree
	 */
	void enterTransaction(banking4Parser.TransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link banking4Parser#transaction}.
	 * @param ctx the parse tree
	 */
	void exitTransaction(banking4Parser.TransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link banking4Parser#deposit}.
	 * @param ctx the parse tree
	 */
	void enterDeposit(banking4Parser.DepositContext ctx);
	/**
	 * Exit a parse tree produced by {@link banking4Parser#deposit}.
	 * @param ctx the parse tree
	 */
	void exitDeposit(banking4Parser.DepositContext ctx);
	/**
	 * Enter a parse tree produced by {@link banking4Parser#withdraw}.
	 * @param ctx the parse tree
	 */
	void enterWithdraw(banking4Parser.WithdrawContext ctx);
	/**
	 * Exit a parse tree produced by {@link banking4Parser#withdraw}.
	 * @param ctx the parse tree
	 */
	void exitWithdraw(banking4Parser.WithdrawContext ctx);
	/**
	 * Enter a parse tree produced by {@link banking4Parser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(banking4Parser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link banking4Parser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(banking4Parser.PrintContext ctx);
}