// Generated from /Users/pedro/Code/rule_matcher/src/main/antlr4/IpAddress.g4 by ANTLR 4.10.1
package pt.alticelabs.rule_matcher.antlr4.ipAddress;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IpAddressParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IpAddressVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IpAddressParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(IpAddressParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IpAddressParser#complex_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_expression(IpAddressParser.Complex_expressionContext ctx);
}