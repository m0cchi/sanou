package primitive.env;

import primitive.lexical.LexicalAnalyzer;

public class Enviroment {
    //constant
    public static final String VERSION = "OMOCHI_CORE_1.1";
    //
    private Pointer pointer;
    private LexicalAnalyzer lexicalAnalyzer;
    
    public Enviroment(LexicalAnalyzer lexicalAnalyzer){
        this.pointer = new Pointer();
        this.lexicalAnalyzer = lexicalAnalyzer;
    }

    public LexicalAnalyzer getLexicalAnalyzer(){
        return lexicalAnalyzer;
    }
    
    public void left(){
        pointer = pointer.left();
    }
    
    public void right(){
        pointer = pointer.right();
    }
    
    public Memory getMemory(){
        return pointer.getMemory();
    }
}
