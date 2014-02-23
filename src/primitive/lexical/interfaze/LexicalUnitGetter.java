package primitive.lexical.interfaze;

import primitive.lexical.LexicalUnit;

public interface LexicalUnitGetter {
    public LexicalUnit get();
    public void unget(LexicalUnit unit);
    public LexicalUnit peek();
}
