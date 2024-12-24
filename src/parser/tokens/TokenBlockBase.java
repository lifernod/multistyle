package parser.tokens;

import java.util.Collections;
import java.util.List;

public abstract class TokenBlockBase<T> {
    public final int startPosition;
    public final int endPosition;

    public final int count;
    public final TokenType itemsType;

    public final List<T> items;

    public TokenBlockBase(int startPosition, int endPosition, TokenType itemsType, List<T> items) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
        this.count = endPosition - startPosition;
        this.itemsType = itemsType;
        this.items = items;
    }

    public TokenBlockBase(int startPosition, int endPosition, TokenType itemsType) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
        this.count = endPosition - startPosition;
        this.itemsType = itemsType;
        this.items = Collections.emptyList();
    }

    public void addItem(T item) {
        this.items.add(item);
    }
}
