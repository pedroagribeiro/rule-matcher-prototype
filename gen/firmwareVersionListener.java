// Generated from /Users/pedro/Code/rule_matcher/src/main/antlr4/firmwareVersion.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link firmwareVersionParser}.
 */
public interface firmwareVersionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link firmwareVersionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(firmwareVersionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link firmwareVersionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(firmwareVersionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link firmwareVersionParser#complex_expression}.
	 * @param ctx the parse tree
	 */
	void enterComplex_expression(firmwareVersionParser.Complex_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link firmwareVersionParser#complex_expression}.
	 * @param ctx the parse tree
	 */
	void exitComplex_expression(firmwareVersionParser.Complex_expressionContext ctx);
}