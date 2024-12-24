package parser.tokens;

public abstract class TokenBase {
    public final int line;

    public final String name;
    public final String raw;

    public final TokenType type;

    public TokenBase(int line, String name, String raw, TokenType type) {
        this.line = line;
        this.name = name;
        this.raw = raw;
        this.type = type;
    }
}
