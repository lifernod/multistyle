package parser.tokens;

public class Token extends TokenBase {

    public Token(int line, String name, String raw, TokenType type) {
        super(line, name, raw, type);
    }
}
