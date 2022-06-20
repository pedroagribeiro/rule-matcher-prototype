// Generated from /Users/pedro/Code/rule_matcher/src/main/antlr4/FirmwareVersion.g4 by ANTLR 4.10.1
package pt.alticelabs.rule_matcher.antlr4.firmwareVersion;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FirmwareVersionParser}.
 */
public interface FirmwareVersionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FirmwareVersionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FirmwareVersionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirmwareVersionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FirmwareVersionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirmwareVersionParser#complex_expression}.
	 * @param ctx the parse tree
	 */
	void enterComplex_expression(FirmwareVersionParser.Complex_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirmwareVersionParser#complex_expression}.
	 * @param ctx the parse tree
	 */
	void exitComplex_expression(FirmwareVersionParser.Complex_expressionContext ctx);
}