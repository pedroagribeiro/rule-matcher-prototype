// Generated from /Users/pedro/Code/rule_matcher/src/main/antlr4/IpAddress.g4 by ANTLR 4.10.1
package pt.alticelabs.rule_matcher.antlr4.ipAddress;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IpAddressParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUAL=1, GREATER_THAN=2, LOWER_THAN=3, STARTSWITH=4, ENDSWITH=5, LOGIC_AND=6, 
		LOGIC_OR=7, IP_ADDRESS_REGULAR_EXPRESSION=8, IP_ADDRESS_SINGLE_EXPRESSION=9, 
		IP_ADDRESS_SINGLE_PARTIAL_EXPRESSION=10, WORD=11, WHITESPACE=12, NEWLINE=13;
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
			null, "'eq'", "'gt'", "'lt'", "'startswith'", "'endswith'", "'and'", 
			"'or'", "'^(?:[0-9]{1,3}.){3}[0-9]{1,3}$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUAL", "GREATER_THAN", "LOWER_THAN", "STARTSWITH", "ENDSWITH", 
			"LOGIC_AND", "LOGIC_OR", "IP_ADDRESS_REGULAR_EXPRESSION", "IP_ADDRESS_SINGLE_EXPRESSION", 
			"IP_ADDRESS_SINGLE_PARTIAL_EXPRESSION", "WORD", "WHITESPACE", "NEWLINE"
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
	public String getGrammarFileName() { return "IpAddress.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IpAddressParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Complex_expressionContext complex_expression() {
			return getRuleContext(Complex_expressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(IpAddressParser.EOF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IpAddressListener ) ((IpAddressListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IpAddressListener ) ((IpAddressListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IpAddressVisitor ) return ((IpAddressVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			complex_expression();
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
		public TerminalNode IP_ADDRESS_SINGLE_EXPRESSION() { return getToken(IpAddressParser.IP_ADDRESS_SINGLE_EXPRESSION, 0); }
		public TerminalNode IP_ADDRESS_SINGLE_PARTIAL_EXPRESSION() { return getToken(IpAddressParser.IP_ADDRESS_SINGLE_PARTIAL_EXPRESSION, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(IpAddressParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(IpAddressParser.WHITESPACE, i);
		}
		public Complex_expressionContext complex_expression() {
			return getRuleContext(Complex_expressionContext.class,0);
		}
		public TerminalNode LOGIC_AND() { return getToken(IpAddressParser.LOGIC_AND, 0); }
		public TerminalNode LOGIC_OR() { return getToken(IpAddressParser.LOGIC_OR, 0); }
		public Complex_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IpAddressListener ) ((IpAddressListener)listener).enterComplex_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IpAddressListener ) ((IpAddressListener)listener).exitComplex_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IpAddressVisitor ) return ((IpAddressVisitor<? extends T>)visitor).visitComplex_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_expressionContext complex_expression() throws RecognitionException {
		Complex_expressionContext _localctx = new Complex_expressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_complex_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_la = _input.LA(1);
			if ( !(_la==IP_ADDRESS_SINGLE_EXPRESSION || _la==IP_ADDRESS_SINGLE_PARTIAL_EXPRESSION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(11);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(8);
					match(WHITESPACE);
					}
					} 
				}
				setState(13);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOGIC_AND || _la==LOGIC_OR) {
				{
				setState(14);
				_la = _input.LA(1);
				if ( !(_la==LOGIC_AND || _la==LOGIC_OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(17);
				match(WHITESPACE);
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IP_ADDRESS_SINGLE_EXPRESSION || _la==IP_ADDRESS_SINGLE_PARTIAL_EXPRESSION) {
				{
				setState(23);
				complex_expression();
				}
			}

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
		"\u0004\u0001\r\u001b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001\n\b"+
		"\u0001\n\u0001\f\u0001\r\t\u0001\u0001\u0001\u0003\u0001\u0010\b\u0001"+
		"\u0001\u0001\u0005\u0001\u0013\b\u0001\n\u0001\f\u0001\u0016\t\u0001\u0001"+
		"\u0001\u0003\u0001\u0019\b\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002"+
		"\u0000\u0002\u0001\u0000\t\n\u0001\u0000\u0006\u0007\u001c\u0000\u0004"+
		"\u0001\u0000\u0000\u0000\u0002\u0007\u0001\u0000\u0000\u0000\u0004\u0005"+
		"\u0003\u0002\u0001\u0000\u0005\u0006\u0005\u0000\u0000\u0001\u0006\u0001"+
		"\u0001\u0000\u0000\u0000\u0007\u000b\u0007\u0000\u0000\u0000\b\n\u0005"+
		"\f\u0000\u0000\t\b\u0001\u0000\u0000\u0000\n\r\u0001\u0000\u0000\u0000"+
		"\u000b\t\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000\u0000\f\u000f"+
		"\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\u000e\u0010\u0007"+
		"\u0001\u0000\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u000f\u0010\u0001"+
		"\u0000\u0000\u0000\u0010\u0014\u0001\u0000\u0000\u0000\u0011\u0013\u0005"+
		"\f\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0013\u0016\u0001\u0000"+
		"\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000"+
		"\u0000\u0000\u0015\u0018\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000"+
		"\u0000\u0000\u0017\u0019\u0003\u0002\u0001\u0000\u0018\u0017\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0003\u0001\u0000"+
		"\u0000\u0000\u0004\u000b\u000f\u0014\u0018";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}