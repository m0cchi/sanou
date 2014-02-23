package primitive.lexical;

public class LexicalUnit {
    private LexicalType type;
    public LexicalUnit(LexicalType type){
        this.type = type;
    }
    public LexicalType getType(){
        return this.type;
    }
}
