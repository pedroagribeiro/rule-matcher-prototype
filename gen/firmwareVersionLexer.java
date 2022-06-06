// Generated from /Users/pedro/Code/rule_matcher/src/main/antlr4/firmwareVersion.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class firmwareVersionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUAL=1, GREATER_THAN=2, LOWER_THAN=3, MAJOR=4, MINOR=5, PATCH=6, NUMBER=7, 
		LOGIC_AND=8, LOGIC_OR=9, SEMANTIC_VERSION=10, SEMANTIC_VERSION_EXPRESSION=11, 
		PARTIAL_SEMANTIC_VERSION_EXPRESSION=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EQUAL", "GREATER_THAN", "LOWER_THAN", "MAJOR", "MINOR", "PATCH", "NUMBER", 
			"LOGIC_AND", "LOGIC_OR", "SEMANTIC_VERSION", "SEMANTIC_VERSION_EXPRESSION", 
			"PARTIAL_SEMANTIC_VERSION_EXPRESSION"
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


	public firmwareVersionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "firmwareVersion.g4"; }

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
		"\u0004\u0000\fV\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006"+
		"6\b\u0006\u000b\u0006\f\u00067\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0003\nJ\b\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bR\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0001\u0000\u0001\u0001\u000009Z\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000"+
		"\u0003\u001c\u0001\u0000\u0000\u0000\u0005\u001f\u0001\u0000\u0000\u0000"+
		"\u0007\"\u0001\u0000\u0000\u0000\t(\u0001\u0000\u0000\u0000\u000b.\u0001"+
		"\u0000\u0000\u0000\r5\u0001\u0000\u0000\u0000\u000f9\u0001\u0000\u0000"+
		"\u0000\u0011=\u0001\u0000\u0000\u0000\u0013@\u0001\u0000\u0000\u0000\u0015"+
		"I\u0001\u0000\u0000\u0000\u0017Q\u0001\u0000\u0000\u0000\u0019\u001a\u0005"+
		"e\u0000\u0000\u001a\u001b\u0005q\u0000\u0000\u001b\u0002\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0005g\u0000\u0000\u001d\u001e\u0005t\u0000\u0000\u001e"+
		"\u0004\u0001\u0000\u0000\u0000\u001f \u0005l\u0000\u0000 !\u0005t\u0000"+
		"\u0000!\u0006\u0001\u0000\u0000\u0000\"#\u0005m\u0000\u0000#$\u0005a\u0000"+
		"\u0000$%\u0005j\u0000\u0000%&\u0005o\u0000\u0000&\'\u0005r\u0000\u0000"+
		"\'\b\u0001\u0000\u0000\u0000()\u0005m\u0000\u0000)*\u0005i\u0000\u0000"+
		"*+\u0005n\u0000\u0000+,\u0005o\u0000\u0000,-\u0005r\u0000\u0000-\n\u0001"+
		"\u0000\u0000\u0000./\u0005p\u0000\u0000/0\u0005a\u0000\u000001\u0005t"+
		"\u0000\u000012\u0005c\u0000\u000023\u0005h\u0000\u00003\f\u0001\u0000"+
		"\u0000\u000046\u0007\u0000\u0000\u000054\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"8\u000e\u0001\u0000\u0000\u00009:\u0005a\u0000\u0000:;\u0005n\u0000\u0000"+
		";<\u0005d\u0000\u0000<\u0010\u0001\u0000\u0000\u0000=>\u0005o\u0000\u0000"+
		">?\u0005r\u0000\u0000?\u0012\u0001\u0000\u0000\u0000@A\u0003\r\u0006\u0000"+
		"AB\u0005.\u0000\u0000BC\u0003\r\u0006\u0000CD\u0005.\u0000\u0000DE\u0003"+
		"\r\u0006\u0000E\u0014\u0001\u0000\u0000\u0000FJ\u0003\u0001\u0000\u0000"+
		"GJ\u0003\u0003\u0001\u0000HJ\u0003\u0005\u0002\u0000IF\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000KL\u0005 \u0000\u0000LM\u0003\u0013\t\u0000M\u0016\u0001\u0000"+
		"\u0000\u0000NR\u0003\u0007\u0003\u0000OR\u0003\t\u0004\u0000PR\u0003\u000b"+
		"\u0005\u0000QN\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0005 \u0000\u0000TU\u0003"+
		"\r\u0006\u0000U\u0018\u0001\u0000\u0000\u0000\u0004\u00007IQ\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}