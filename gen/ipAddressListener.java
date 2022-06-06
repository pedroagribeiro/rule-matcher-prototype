// Generated from /Users/pedro/Code/rule_matcher/src/main/antlr4/ipAddress.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ipAddressParser}.
 */
public interface ipAddressListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ipAddressParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ipAddressParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipAddressParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ipAddressParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipAddressParser#complex_expression}.
	 * @param ctx the parse tree
	 */
	void enterComplex_expression(ipAddressParser.Complex_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipAddressParser#complex_expression}.
	 * @param ctx the parse tree
	 */
	void exitComplex_expression(ipAddressParser.Complex_expressionContext ctx);
}