// Generated from /Users/pedro/Code/rule_matcher/src/main/antlr4/IpAddress.g4 by ANTLR 4.10.1
package pt.alticelabs.rule_matcher.antlr4.ipAddress;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IpAddressParser}.
 */
public interface IpAddressListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IpAddressParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(IpAddressParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IpAddressParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(IpAddressParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IpAddressParser#complex_expression}.
	 * @param ctx the parse tree
	 */
	void enterComplex_expression(IpAddressParser.Complex_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IpAddressParser#complex_expression}.
	 * @param ctx the parse tree
	 */
	void exitComplex_expression(IpAddressParser.Complex_expressionContext ctx);
}