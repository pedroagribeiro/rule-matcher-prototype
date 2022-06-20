// Generated from /Users/pedro/Code/rule_matcher/src/main/antlr4/IpAddress.g4 by ANTLR 4.10.1
package pt.alticelabs.rule_matcher.antlr4.ipAddress;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link IpAddressVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class IpAddressBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements IpAddressVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpression(IpAddressParser.ExpressionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitComplex_expression(IpAddressParser.Complex_expressionContext ctx) { return visitChildren(ctx); }
}