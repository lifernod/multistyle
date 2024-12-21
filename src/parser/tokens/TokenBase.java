package parser.tokens;

public abstract class TokenBase {
    public int line;

    public String name;
    public String raw;

    public TokenType type;

    public TokenBase(int line, String name, String raw, TokenType type) {
        this.line = line;
        this.name = name;
        this.raw = raw;
        this.type = type;
    }

    public void parseString(String string) {

    }
}
