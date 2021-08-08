// Generated from J:/Users/Joshua/Documents/Workspace/rs2asm-intellij-plugin/src/main/java/net/runelite/cache/script/assembler\rs2asm.g4 by ANTLR 4.9.1
package net.runelite.cache.script.assembler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rs2asmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NEWLINE=7, INT=8, QSTRING=9, 
		IDENTIFIER=10, COMMENT=11, WS=12, ERRCHAR=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "NEWLINE", "INT", "QSTRING", 
			"IDENTIFIER", "COMMENT", "WS", "ERRCHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.id '", "'.int_stack_count '", "'.string_stack_count '", "'.int_var_count '", 
			"'.string_var_count '", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NEWLINE", "INT", "QSTRING", 
			"IDENTIFIER", "COMMENT", "WS", "ERRCHAR"
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


	public rs2asmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "rs2asm.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\b\6\bp\n\b\r\b\16\bq\3\t\5\tu\n\t\3\t\6\tx\n\t\r\t\16\ty\3"+
		"\n\3\n\3\n\3\n\7\n\u0080\n\n\f\n\16\n\u0083\13\n\3\n\3\n\3\13\6\13\u0088"+
		"\n\13\r\13\16\13\u0089\3\f\3\f\7\f\u008e\n\f\f\f\16\f\u0091\13\f\3\f\3"+
		"\f\3\r\6\r\u0096\n\r\r\r\16\r\u0097\3\r\3\r\3\16\3\16\3\16\3\16\2\2\17"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\b"+
		"\4\2\f\f\17\17\3\2\62;\6\2\f\f\17\17$$^^\4\2$$^^\6\2\62;C\\aac|\4\2\13"+
		"\13\"\"\2\u00a6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\"\3\2\2\2\7\64"+
		"\3\2\2\2\tI\3\2\2\2\13Y\3\2\2\2\rl\3\2\2\2\17o\3\2\2\2\21t\3\2\2\2\23"+
		"{\3\2\2\2\25\u0087\3\2\2\2\27\u008b\3\2\2\2\31\u0095\3\2\2\2\33\u009b"+
		"\3\2\2\2\35\36\7\60\2\2\36\37\7k\2\2\37 \7f\2\2 !\7\"\2\2!\4\3\2\2\2\""+
		"#\7\60\2\2#$\7k\2\2$%\7p\2\2%&\7v\2\2&\'\7a\2\2\'(\7u\2\2()\7v\2\2)*\7"+
		"c\2\2*+\7e\2\2+,\7m\2\2,-\7a\2\2-.\7e\2\2./\7q\2\2/\60\7w\2\2\60\61\7"+
		"p\2\2\61\62\7v\2\2\62\63\7\"\2\2\63\6\3\2\2\2\64\65\7\60\2\2\65\66\7u"+
		"\2\2\66\67\7v\2\2\678\7t\2\289\7k\2\29:\7p\2\2:;\7i\2\2;<\7a\2\2<=\7u"+
		"\2\2=>\7v\2\2>?\7c\2\2?@\7e\2\2@A\7m\2\2AB\7a\2\2BC\7e\2\2CD\7q\2\2DE"+
		"\7w\2\2EF\7p\2\2FG\7v\2\2GH\7\"\2\2H\b\3\2\2\2IJ\7\60\2\2JK\7k\2\2KL\7"+
		"p\2\2LM\7v\2\2MN\7a\2\2NO\7x\2\2OP\7c\2\2PQ\7t\2\2QR\7a\2\2RS\7e\2\2S"+
		"T\7q\2\2TU\7w\2\2UV\7p\2\2VW\7v\2\2WX\7\"\2\2X\n\3\2\2\2YZ\7\60\2\2Z["+
		"\7u\2\2[\\\7v\2\2\\]\7t\2\2]^\7k\2\2^_\7p\2\2_`\7i\2\2`a\7a\2\2ab\7x\2"+
		"\2bc\7c\2\2cd\7t\2\2de\7a\2\2ef\7e\2\2fg\7q\2\2gh\7w\2\2hi\7p\2\2ij\7"+
		"v\2\2jk\7\"\2\2k\f\3\2\2\2lm\7<\2\2m\16\3\2\2\2np\t\2\2\2on\3\2\2\2pq"+
		"\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\20\3\2\2\2su\7/\2\2ts\3\2\2\2tu\3\2\2\2"+
		"uw\3\2\2\2vx\t\3\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\22\3\2\2"+
		"\2{\u0081\7$\2\2|\u0080\n\4\2\2}~\7^\2\2~\u0080\t\5\2\2\177|\3\2\2\2\177"+
		"}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7$\2\2\u0085\24\3\2\2\2"+
		"\u0086\u0088\t\6\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\26\3\2\2\2\u008b\u008f\7=\2\2\u008c"+
		"\u008e\n\2\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0093\b\f\2\2\u0093\30\3\2\2\2\u0094\u0096\t\7\2\2\u0095\u0094\3\2\2"+
		"\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009a\b\r\2\2\u009a\32\3\2\2\2\u009b\u009c\13\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\b\16\2\2\u009e\34\3\2\2\2\13\2qty\177\u0081"+
		"\u0089\u008f\u0097\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}