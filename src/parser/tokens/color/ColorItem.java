package parser.tokens.color;

import parser.tokens.TokenBase;
import parser.tokens.TokenType;

public class ColorItem extends TokenBase {

    public ColorItem(int line, String name, String raw) {
        super(line, name, raw, TokenType.ColorItem);
    }


    @Override
    public void parseString(String string) {

    }
}
