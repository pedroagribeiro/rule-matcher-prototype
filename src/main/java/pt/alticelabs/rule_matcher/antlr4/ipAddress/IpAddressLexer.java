// Generated from /Users/pedro/Code/rule_matcher/src/main/antlr4/IpAddress.g4 by ANTLR 4.10.1
package pt.alticelabs.rule_matcher.antlr4.ipAddress;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IpAddressLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUAL=1, GREATER_THAN=2, LOWER_THAN=3, STARTSWITH=4, ENDSWITH=5, LOGIC_AND=6, 
		LOGIC_OR=7, IP_ADDRESS_REGULAR_EXPRESSION=8, IP_ADDRESS_SINGLE_EXPRESSION=9, 
		IP_ADDRESS_SINGLE_PARTIAL_EXPRESSION=10, WORD=11, WHITESPACE=12, NEWLINE=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EQUAL", "GREATER_THAN", "LOWER_THAN", "STARTSWITH", "ENDSWITH", "LOGIC_AND", 
			"LOGIC_OR", "IP_ADDRESS_REGULAR_EXPRESSION", "IP_ADDRESS_SINGLE_EXPRESSION", 
			"IP_ADDRESS_SINGLE_PARTIAL_EXPRESSION", "WORD", "WHITESPACE", "NEWLINE"
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


	public IpAddressLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IpAddress.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\r}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003"+
		"\bb\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\ti\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0004\no\b\n\u000b\n\f\np\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0003\fv\b\f\u0001\f\u0001\f\u0004\fz\b\f\u000b\f\f\f{\u0000\u0000"+
		"\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u0001\u0000"+
		"\u0002\u0002\u0000))]]\u0002\u0000\t\t  \u0083\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0001\u001b\u0001\u0000\u0000\u0000\u0003\u001e\u0001\u0000\u0000\u0000"+
		"\u0005!\u0001\u0000\u0000\u0000\u0007$\u0001\u0000\u0000\u0000\t/\u0001"+
		"\u0000\u0000\u0000\u000b8\u0001\u0000\u0000\u0000\r<\u0001\u0000\u0000"+
		"\u0000\u000f?\u0001\u0000\u0000\u0000\u0011a\u0001\u0000\u0000\u0000\u0013"+
		"h\u0001\u0000\u0000\u0000\u0015n\u0001\u0000\u0000\u0000\u0017r\u0001"+
		"\u0000\u0000\u0000\u0019y\u0001\u0000\u0000\u0000\u001b\u001c\u0005e\u0000"+
		"\u0000\u001c\u001d\u0005q\u0000\u0000\u001d\u0002\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0005g\u0000\u0000\u001f \u0005t\u0000\u0000 \u0004\u0001"+
		"\u0000\u0000\u0000!\"\u0005l\u0000\u0000\"#\u0005t\u0000\u0000#\u0006"+
		"\u0001\u0000\u0000\u0000$%\u0005s\u0000\u0000%&\u0005t\u0000\u0000&\'"+
		"\u0005a\u0000\u0000\'(\u0005r\u0000\u0000()\u0005t\u0000\u0000)*\u0005"+
		"s\u0000\u0000*+\u0005w\u0000\u0000+,\u0005i\u0000\u0000,-\u0005t\u0000"+
		"\u0000-.\u0005h\u0000\u0000.\b\u0001\u0000\u0000\u0000/0\u0005e\u0000"+
		"\u000001\u0005n\u0000\u000012\u0005d\u0000\u000023\u0005s\u0000\u0000"+
		"34\u0005w\u0000\u000045\u0005i\u0000\u000056\u0005t\u0000\u000067\u0005"+
		"h\u0000\u00007\n\u0001\u0000\u0000\u000089\u0005a\u0000\u00009:\u0005"+
		"n\u0000\u0000:;\u0005d\u0000\u0000;\f\u0001\u0000\u0000\u0000<=\u0005"+
		"o\u0000\u0000=>\u0005r\u0000\u0000>\u000e\u0001\u0000\u0000\u0000?@\u0005"+
		"^\u0000\u0000@A\u0005(\u0000\u0000AB\u0005?\u0000\u0000BC\u0005:\u0000"+
		"\u0000CD\u0005[\u0000\u0000DE\u00050\u0000\u0000EF\u0005-\u0000\u0000"+
		"FG\u00059\u0000\u0000GH\u0005]\u0000\u0000HI\u0005{\u0000\u0000IJ\u0005"+
		"1\u0000\u0000JK\u0005,\u0000\u0000KL\u00053\u0000\u0000LM\u0005}\u0000"+
		"\u0000MN\u0005.\u0000\u0000NO\u0005)\u0000\u0000OP\u0005{\u0000\u0000"+
		"PQ\u00053\u0000\u0000QR\u0005}\u0000\u0000RS\u0005[\u0000\u0000ST\u0005"+
		"0\u0000\u0000TU\u0005-\u0000\u0000UV\u00059\u0000\u0000VW\u0005]\u0000"+
		"\u0000WX\u0005{\u0000\u0000XY\u00051\u0000\u0000YZ\u0005,\u0000\u0000"+
		"Z[\u00053\u0000\u0000[\\\u0005}\u0000\u0000\\]\u0005$\u0000\u0000]\u0010"+
		"\u0001\u0000\u0000\u0000^b\u0003\u0001\u0000\u0000_b\u0003\u0003\u0001"+
		"\u0000`b\u0003\u0005\u0002\u0000a^\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0003"+
		"\u0017\u000b\u0000de\u0003\u000f\u0007\u0000e\u0012\u0001\u0000\u0000"+
		"\u0000fi\u0003\u0007\u0003\u0000gi\u0003\t\u0004\u0000hf\u0001\u0000\u0000"+
		"\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0003\u0017"+
		"\u000b\u0000kl\u0003\u0015\n\u0000l\u0014\u0001\u0000\u0000\u0000mo\b"+
		"\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q\u0016\u0001\u0000"+
		"\u0000\u0000rs\u0007\u0001\u0000\u0000s\u0018\u0001\u0000\u0000\u0000"+
		"tv\u0005\r\u0000\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000wz\u0005\n\u0000\u0000xz\u0005\r\u0000\u0000"+
		"yu\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u001a\u0001"+
		"\u0000\u0000\u0000\u0007\u0000ahpuy{\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}