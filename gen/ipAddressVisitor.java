// Generated from /Users/pedro/Code/rule_matcher/src/main/antlr4/ipAddress.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ipAddressParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ipAddressVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ipAddressParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ipAddressParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ipAddressParser#complex_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_expression(ipAddressParser.Complex_expressionContext ctx);
}