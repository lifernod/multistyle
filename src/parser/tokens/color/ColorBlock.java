package parser.tokens.color;

import parser.tokens.TokenBlockBase;
import parser.tokens.TokenType;

import java.util.List;

public class ColorBlock extends TokenBlockBase<ColorItem> {
    public ColorBlock(int startPosition, int endPosition) {
        super(
                startPosition,
                endPosition,
                TokenType.ColorItem
        );
    }

    public ColorBlock(int startPosition, int endPosition, List<ColorItem> items) {
        super(
                startPosition,
                endPosition,
                TokenType.ColorItem,
                items
        );
    }

}
