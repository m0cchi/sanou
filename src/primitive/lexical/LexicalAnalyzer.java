package primitive.lexical;

import java.io.File;

import primitive.lexical.impl.StringLexicalUnitGetter;
import primitive.lexical.interfaze.LexicalUnitGetter;

public class LexicalAnalyzer implements LexicalUnitGetter{
    private LexicalUnitGetter getter;
    public LexicalAnalyzer(File path) {

    }
    public LexicalAnalyzer(String proc){
        getter = new StringLexicalUnitGetter(proc);
    }
    public LexicalAnalyzer(LexicalUnitGetter impl){
        getter = impl;
    }
    @Override
    public LexicalUnit get() {
        return getter.get();
    }
    @Override
    public void unget(LexicalUnit unit) {
        getter.unget(unit);
    }
    @Override
    public LexicalUnit peek() {
        return getter.peek();
    }
    
}
