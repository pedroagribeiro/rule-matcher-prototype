// Generated from /Users/pedro/Code/rule_matcher/src/main/antlr4/firmwareVersion.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link firmwareVersionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface firmwareVersionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link firmwareVersionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(firmwareVersionParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link firmwareVersionParser#complex_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_expression(firmwareVersionParser.Complex_expressionContext ctx);
}