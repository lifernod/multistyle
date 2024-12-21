package parser.tokens;

public enum TokenType {
    ColorBlockOpen,
    ColorItem,
    ColorBlockClose;


    public static Token colorBlockOpen(int line) {
        return new Token(line, "colors", "<colors>", ColorBlockOpen);
    }

    public static Token colorItem(int line, String name, String value) {
        return new Token(line, name, value, ColorItem);
    }

    public static Token colorBlockClose(int line) {
        return new Token(line, "colors", "</colors>", ColorBlockClose);
    }

    public static RuntimeException unrecognizedToken(int position, String line) {
        return new RuntimeException("Unrecognized token at line " + position + ": " + line);
    }
}
