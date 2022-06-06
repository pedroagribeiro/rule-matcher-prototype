// Generated from /Users/pedro/Code/rule_matcher/src/main/antlr4/firmwareVersion.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class firmwareVersionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUAL=1, GREATER_THAN=2, LOWER_THAN=3, MAJOR=4, MINOR=5, PATCH=6, NUMBER=7, 
		LOGIC_AND=8, LOGIC_OR=9, SEMANTIC_VERSION=10, SEMANTIC_VERSION_EXPRESSION=11, 
		PARTIAL_SEMANTIC_VERSION_EXPRESSION=12;
	public static final int
		RULE_expression = 0, RULE_complex_expression = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "complex_expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'eq'", "'gt'", "'lt'", "'major'", "'minor'", "'patch'", null, 
			"'and'", "'or'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUAL", "GREATER_THAN", "LOWER_THAN", "MAJOR", "MINOR", "PATCH", 
			"NUMBER", "LOGIC_AND", "LOGIC_OR", "SEMANTIC_VERSION", "SEMANTIC_VERSION_EXPRESSION", 
			"PARTIAL_SEMANTIC_VERSION_EXPRESSION"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "firmwareVersion.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public firmwareVersionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(firmwareVersionParser.EOF, 0); }
		public TerminalNode SEMANTIC_VERSION_EXPRESSION() { return getToken(firmwareVersionParser.SEMANTIC_VERSION_EXPRESSION, 0); }
		public TerminalNode PARTIAL_SEMANTIC_VERSION_EXPRESSION() { return getToken(firmwareVersionParser.PARTIAL_SEMANTIC_VERSION_EXPRESSION, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firmwareVersionListener ) ((firmwareVersionListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firmwareVersionListener ) ((firmwareVersionListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firmwareVersionVisitor ) return ((firmwareVersionVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			_la = _input.LA(1);
			if ( !(_la==SEMANTIC_VERSION_EXPRESSION || _la==PARTIAL_SEMANTIC_VERSION_EXPRESSION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(5);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Complex_expressionContext extends ParserRuleContext {
		public Complex_expressionContext complex_expression() {
			return getRuleContext(Complex_expressionContext.class,0);
		}
		public TerminalNode SEMANTIC_VERSION_EXPRESSION() { return getToken(firmwareVersionParser.SEMANTIC_VERSION_EXPRESSION, 0); }
		public TerminalNode PARTIAL_SEMANTIC_VERSION_EXPRESSION() { return getToken(firmwareVersionParser.PARTIAL_SEMANTIC_VERSION_EXPRESSION, 0); }
		public TerminalNode LOGIC_AND() { return getToken(firmwareVersionParser.LOGIC_AND, 0); }
		public TerminalNode LOGIC_OR() { return getToken(firmwareVersionParser.LOGIC_OR, 0); }
		public Complex_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firmwareVersionListener ) ((firmwareVersionListener)listener).enterComplex_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firmwareVersionListener ) ((firmwareVersionListener)listener).exitComplex_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firmwareVersionVisitor ) return ((firmwareVersionVisitor<? extends T>)visitor).visitComplex_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_expressionContext complex_expression() throws RecognitionException {
		Complex_expressionContext _localctx = new Complex_expressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_complex_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_la = _input.LA(1);
			if ( !(_la==SEMANTIC_VERSION_EXPRESSION || _la==PARTIAL_SEMANTIC_VERSION_EXPRESSION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(8);
			_la = _input.LA(1);
			if ( !(_la==LOGIC_AND || _la==LOGIC_OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(9);
			complex_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\f\f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0002\u0001\u0000"+
		"\u000b\f\u0001\u0000\b\t\t\u0000\u0004\u0001\u0000\u0000\u0000\u0002\u0007"+
		"\u0001\u0000\u0000\u0000\u0004\u0005\u0007\u0000\u0000\u0000\u0005\u0006"+
		"\u0005\u0000\u0000\u0001\u0006\u0001\u0001\u0000\u0000\u0000\u0007\b\u0007"+
		"\u0000\u0000\u0000\b\t\u0007\u0001\u0000\u0000\t\n\u0003\u0002\u0001\u0000"+
		"\n\u0003\u0001\u0000\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}