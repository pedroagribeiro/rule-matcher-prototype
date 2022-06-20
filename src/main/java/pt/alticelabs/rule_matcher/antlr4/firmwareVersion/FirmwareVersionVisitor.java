// Generated from /Users/pedro/Code/rule_matcher/src/main/antlr4/FirmwareVersion.g4 by ANTLR 4.10.1
package pt.alticelabs.rule_matcher.antlr4.firmwareVersion;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FirmwareVersionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FirmwareVersionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FirmwareVersionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FirmwareVersionParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirmwareVersionParser#complex_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_expression(FirmwareVersionParser.Complex_expressionContext ctx);
}