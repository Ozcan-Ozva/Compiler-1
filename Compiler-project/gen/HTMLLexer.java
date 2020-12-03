// Generated from C:/Users/Dell/Downloads/Compressed/Compiler-project/Compiler-project/src\HTMLLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, HTML_CONDITIONAL_COMMENT=2, XML=3, CDATA=4, DTD=5, SCRIPTLET=6, 
		SEA_WS=7, SCRIPT_OPEN=8, STYLE_OPEN=9, TAG_OPEN=10, HTML_TEXT=11, CP_SHOW=12, 
		TAG_CLOSE=13, TAG_SLASH_CLOSE=14, TAG_SLASH=15, TAG_EQUALS=16, TAG_NAME=17, 
		TAG_WHITESPACE=18, SCRIPT_BODY=19, SCRIPT_SHORT_BODY=20, STYLE_BODY=21, 
		STYLE_SHORT_BODY=22, ATTVALUE_VALUE=23, ATTRIBUTE=24;
	public static final int
		TAG=1, SCRIPT=2, STYLE=3, ATTVALUE=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "TAG", "SCRIPT", "STYLE", "ATTVALUE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", "SCRIPTLET", 
			"SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", "CP_SHOW", 
			"TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", 
			"TAG_WHITESPACE", "HEXDIGIT", "DIGIT", "TAG_NameChar", "TAG_NameStartChar", 
			"SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY", 
			"ATTVALUE_VALUE", "ATTRIBUTE", "ATTCHARS", "ATTCHAR", "HEXCHARS", "DECCHARS", 
			"DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'<'", null, 
			"'cp-show'", "'>'", "'/>'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", 
			"SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", 
			"CP_SHOW", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", 
			"TAG_NAME", "TAG_WHITESPACE", "SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", 
			"STYLE_SHORT_BODY", "ATTVALUE_VALUE", "ATTRIBUTE"
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


	public HTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0187\b\1\b\1"+
		"\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\7\2R\n\2"+
		"\f\2\16\2U\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3`\n\3\f\3\16\3"+
		"c\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4o\n\4\f\4\16\4r\13\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0081\n\5\f\5"+
		"\16\5\u0084\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u008e\n\6\f\6\16"+
		"\6\u0091\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u0099\n\7\f\7\16\7\u009c\13"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a4\n\7\f\7\16\7\u00a7\13\7\3\7\3\7\5"+
		"\7\u00ab\n\7\3\b\3\b\5\b\u00af\n\b\3\b\6\b\u00b2\n\b\r\b\16\b\u00b3\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00bf\n\t\f\t\16\t\u00c2\13\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d0\n\n\f\n\16\n"+
		"\u00d3\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\6\f\u00de\n\f\r\f"+
		"\16\f\u00df\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\7\22\u00fb"+
		"\n\22\f\22\16\22\u00fe\13\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\5\26\u010c\n\26\3\27\5\27\u010f\n\27\3\30\7\30\u0112"+
		"\n\30\f\30\16\30\u0115\13\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\7\31\u0124\n\31\f\31\16\31\u0127\13\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\7\32\u0130\n\32\f\32\16\32\u0133\13\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\7\33\u0141"+
		"\n\33\f\33\16\33\u0144\13\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\7\34\u014d"+
		"\n\34\f\34\16\34\u0150\13\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\5\35\u015b\n\35\3\36\6\36\u015e\n\36\r\36\16\36\u015f\3\36\5\36\u0163"+
		"\n\36\3\37\5\37\u0166\n\37\3 \3 \6 \u016a\n \r \16 \u016b\3!\6!\u016f"+
		"\n!\r!\16!\u0170\3!\5!\u0174\n!\3\"\3\"\7\"\u0178\n\"\f\"\16\"\u017b\13"+
		"\"\3\"\3\"\3#\3#\7#\u0181\n#\f#\16#\u0184\13#\3#\3#\17Sap\u0082\u008f"+
		"\u009a\u00a5\u00c0\u00d1\u0113\u0125\u0131\u0142\2$\7\3\t\4\13\5\r\6\17"+
		"\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\2"+
		"-\2/\2\61\2\63\25\65\26\67\279\30;\31=\32?\2A\2C\2E\2G\2I\2\7\2\3\4\5"+
		"\6\r\4\2\13\13\"\"\3\2>>\5\2\13\f\17\17\"\"\5\2\62;CHch\3\2\62;\4\2/\60"+
		"aa\5\2\u00b9\u00b9\u0302\u0371\u2041\u2042\n\2<<C\\c|\u2072\u2191\u2c02"+
		"\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\t\2%%-=??AAC\\aac|\4\2$$>>"+
		"\4\2))>>\2\u019a\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\3\35\3\2\2\2\3\37\3\2\2\2\3!\3\2\2\2\3#\3\2\2\2\3%\3"+
		"\2\2\2\3\'\3\2\2\2\3)\3\2\2\2\4\63\3\2\2\2\4\65\3\2\2\2\5\67\3\2\2\2\5"+
		"9\3\2\2\2\6;\3\2\2\2\6=\3\2\2\2\7K\3\2\2\2\tZ\3\2\2\2\13g\3\2\2\2\ru\3"+
		"\2\2\2\17\u0089\3\2\2\2\21\u00aa\3\2\2\2\23\u00b1\3\2\2\2\25\u00b5\3\2"+
		"\2\2\27\u00c7\3\2\2\2\31\u00d8\3\2\2\2\33\u00dd\3\2\2\2\35\u00e1\3\2\2"+
		"\2\37\u00e9\3\2\2\2!\u00ed\3\2\2\2#\u00f2\3\2\2\2%\u00f4\3\2\2\2\'\u00f8"+
		"\3\2\2\2)\u00ff\3\2\2\2+\u0103\3\2\2\2-\u0105\3\2\2\2/\u010b\3\2\2\2\61"+
		"\u010e\3\2\2\2\63\u0113\3\2\2\2\65\u0125\3\2\2\2\67\u0131\3\2\2\29\u0142"+
		"\3\2\2\2;\u014e\3\2\2\2=\u015a\3\2\2\2?\u015d\3\2\2\2A\u0165\3\2\2\2C"+
		"\u0167\3\2\2\2E\u016e\3\2\2\2G\u0175\3\2\2\2I\u017e\3\2\2\2KL\7>\2\2L"+
		"M\7#\2\2MN\7/\2\2NO\7/\2\2OS\3\2\2\2PR\13\2\2\2QP\3\2\2\2RU\3\2\2\2ST"+
		"\3\2\2\2SQ\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7/\2\2WX\7/\2\2XY\7@\2\2Y\b\3"+
		"\2\2\2Z[\7>\2\2[\\\7#\2\2\\]\7]\2\2]a\3\2\2\2^`\13\2\2\2_^\3\2\2\2`c\3"+
		"\2\2\2ab\3\2\2\2a_\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7_\2\2ef\7@\2\2f\n\3"+
		"\2\2\2gh\7>\2\2hi\7A\2\2ij\7z\2\2jk\7o\2\2kl\7n\2\2lp\3\2\2\2mo\13\2\2"+
		"\2nm\3\2\2\2or\3\2\2\2pq\3\2\2\2pn\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7@\2"+
		"\2t\f\3\2\2\2uv\7>\2\2vw\7#\2\2wx\7]\2\2xy\7E\2\2yz\7F\2\2z{\7C\2\2{|"+
		"\7V\2\2|}\7C\2\2}~\7]\2\2~\u0082\3\2\2\2\177\u0081\13\2\2\2\u0080\177"+
		"\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7_\2\2\u0086\u0087\7_\2"+
		"\2\u0087\u0088\7@\2\2\u0088\16\3\2\2\2\u0089\u008a\7>\2\2\u008a\u008b"+
		"\7#\2\2\u008b\u008f\3\2\2\2\u008c\u008e\13\2\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7@\2\2\u0093\20\3\2\2\2\u0094\u0095"+
		"\7>\2\2\u0095\u0096\7A\2\2\u0096\u009a\3\2\2\2\u0097\u0099\13\2\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u009b\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7A\2\2\u009e"+
		"\u00ab\7@\2\2\u009f\u00a0\7>\2\2\u00a0\u00a1\7\'\2\2\u00a1\u00a5\3\2\2"+
		"\2\u00a2\u00a4\13\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00a9\7\'\2\2\u00a9\u00ab\7@\2\2\u00aa\u0094\3\2\2\2\u00aa"+
		"\u009f\3\2\2\2\u00ab\22\3\2\2\2\u00ac\u00b2\t\2\2\2\u00ad\u00af\7\17\2"+
		"\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2"+
		"\7\f\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\24\3\2\2\2\u00b5\u00b6\7>\2\2"+
		"\u00b6\u00b7\7u\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba"+
		"\7k\2\2\u00ba\u00bb\7r\2\2\u00bb\u00bc\7v\2\2\u00bc\u00c0\3\2\2\2\u00bd"+
		"\u00bf\13\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00c1\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c4\7@\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b\t\2\2\u00c6\26\3\2\2\2"+
		"\u00c7\u00c8\7>\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb"+
		"\7{\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7g\2\2\u00cd\u00d1\3\2\2\2\u00ce"+
		"\u00d0\13\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d2\3"+
		"\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d5\7@\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\b\n\3\2\u00d7\30\3\2\2\2"+
		"\u00d8\u00d9\7>\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\b\13\4\2\u00db\32"+
		"\3\2\2\2\u00dc\u00de\n\3\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\34\3\2\2\2\u00e1\u00e2\7e\2\2"+
		"\u00e2\u00e3\7r\2\2\u00e3\u00e4\7/\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6"+
		"\7j\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7y\2\2\u00e8\36\3\2\2\2\u00e9\u00ea"+
		"\7@\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b\16\5\2\u00ec \3\2\2\2\u00ed"+
		"\u00ee\7\61\2\2\u00ee\u00ef\7@\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\b\17"+
		"\5\2\u00f1\"\3\2\2\2\u00f2\u00f3\7\61\2\2\u00f3$\3\2\2\2\u00f4\u00f5\7"+
		"?\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b\21\6\2\u00f7&\3\2\2\2\u00f8\u00fc"+
		"\5\61\27\2\u00f9\u00fb\5/\26\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2"+
		"\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd(\3\2\2\2\u00fe\u00fc\3"+
		"\2\2\2\u00ff\u0100\t\4\2\2\u0100\u0101\3\2\2\2\u0101\u0102\b\23\7\2\u0102"+
		"*\3\2\2\2\u0103\u0104\t\5\2\2\u0104,\3\2\2\2\u0105\u0106\t\6\2\2\u0106"+
		".\3\2\2\2\u0107\u010c\5\61\27\2\u0108\u010c\t\7\2\2\u0109\u010c\5-\25"+
		"\2\u010a\u010c\t\b\2\2\u010b\u0107\3\2\2\2\u010b\u0108\3\2\2\2\u010b\u0109"+
		"\3\2\2\2\u010b\u010a\3\2\2\2\u010c\60\3\2\2\2\u010d\u010f\t\t\2\2\u010e"+
		"\u010d\3\2\2\2\u010f\62\3\2\2\2\u0110\u0112\13\2\2\2\u0111\u0110\3\2\2"+
		"\2\u0112\u0115\3\2\2\2\u0113\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0116"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7>\2\2\u0117\u0118\7\61\2\2\u0118"+
		"\u0119\7u\2\2\u0119\u011a\7e\2\2\u011a\u011b\7t\2\2\u011b\u011c\7k\2\2"+
		"\u011c\u011d\7r\2\2\u011d\u011e\7v\2\2\u011e\u011f\7@\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u0121\b\30\5\2\u0121\64\3\2\2\2\u0122\u0124\13\2\2\2\u0123"+
		"\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0126\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7>\2\2\u0129"+
		"\u012a\7\61\2\2\u012a\u012b\7@\2\2\u012b\u012c\3\2\2\2\u012c\u012d\b\31"+
		"\5\2\u012d\66\3\2\2\2\u012e\u0130\13\2\2\2\u012f\u012e\3\2\2\2\u0130\u0133"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0135\7>\2\2\u0135\u0136\7\61\2\2\u0136\u0137\7u"+
		"\2\2\u0137\u0138\7v\2\2\u0138\u0139\7{\2\2\u0139\u013a\7n\2\2\u013a\u013b"+
		"\7g\2\2\u013b\u013c\7@\2\2\u013c\u013d\3\2\2\2\u013d\u013e\b\32\5\2\u013e"+
		"8\3\2\2\2\u013f\u0141\13\2\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2"+
		"\u0142\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\u0145\u0146\7>\2\2\u0146\u0147\7\61\2\2\u0147\u0148\7@\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014a\b\33\5\2\u014a:\3\2\2\2\u014b\u014d\7\"\2\2"+
		"\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\5=\35\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0154\b\34\5\2\u0154<\3\2\2\2\u0155\u015b\5G\"\2"+
		"\u0156\u015b\5I#\2\u0157\u015b\5?\36\2\u0158\u015b\5C \2\u0159\u015b\5"+
		"E!\2\u015a\u0155\3\2\2\2\u015a\u0156\3\2\2\2\u015a\u0157\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b>\3\2\2\2\u015c\u015e\5A\37\2"+
		"\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u0163\7\"\2\2\u0162\u0161\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163@\3\2\2\2\u0164\u0166\t\n\2\2\u0165\u0164\3\2\2\2"+
		"\u0166B\3\2\2\2\u0167\u0169\7%\2\2\u0168\u016a\t\5\2\2\u0169\u0168\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"D\3\2\2\2\u016d\u016f\t\6\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2"+
		"\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0174"+
		"\7\'\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174F\3\2\2\2\u0175"+
		"\u0179\7$\2\2\u0176\u0178\n\13\2\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2"+
		"\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017c\u017d\7$\2\2\u017dH\3\2\2\2\u017e\u0182\7)\2\2\u017f"+
		"\u0181\n\f\2\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185"+
		"\u0186\7)\2\2\u0186J\3\2\2\2&\2\3\4\5\6Sap\u0082\u008f\u009a\u00a5\u00aa"+
		"\u00ae\u00b1\u00b3\u00c0\u00d1\u00df\u00fc\u010b\u010e\u0113\u0125\u0131"+
		"\u0142\u014e\u015a\u015f\u0162\u0165\u016b\u0170\u0173\u0179\u0182\b\7"+
		"\4\2\7\5\2\7\3\2\6\2\2\7\6\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}