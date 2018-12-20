// Generated from expr1.g4 by ANTLR 4.7.1

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link expr1Parser}.
 */
public interface expr1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link expr1Parser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(expr1Parser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link expr1Parser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(expr1Parser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link expr1Parser#inc}.
	 * @param ctx the parse tree
	 */
	void enterInc(expr1Parser.IncContext ctx);
	/**
	 * Exit a parse tree produced by {@link expr1Parser#inc}.
	 * @param ctx the parse tree
	 */
	void exitInc(expr1Parser.IncContext ctx);
	/**
	 * Enter a parse tree produced by {@link expr1Parser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(expr1Parser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link expr1Parser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(expr1Parser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link expr1Parser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(expr1Parser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link expr1Parser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(expr1Parser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link expr1Parser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(expr1Parser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link expr1Parser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(expr1Parser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link expr1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(expr1Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link expr1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(expr1Parser.ExprContext ctx);
}