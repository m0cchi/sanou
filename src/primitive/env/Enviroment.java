package primitive.env;

import primitive.env.interfaze.OutPutInterface;
import primitive.lexical.LexicalAnalyzer;

public class Enviroment {
    // constant
    public static final String VERSION = "OMOCHI_CORE_1.2";
    //
    private Pointer pointer;
    private LexicalAnalyzer lexicalAnalyzer;
    private OutPutInterface outPutInterface;

    public Enviroment(LexicalAnalyzer lexicalAnalyzer) {
        this.pointer = new Pointer();
        this.lexicalAnalyzer = lexicalAnalyzer;
        this.outPutInterface = new SystemOut();
    }

    public Enviroment(LexicalAnalyzer lexicalAnalyzer,OutPutInterface out) {
        this.pointer = new Pointer();
        this.lexicalAnalyzer = lexicalAnalyzer;
        this.outPutInterface = out;
    }

    public LexicalAnalyzer getLexicalAnalyzer() {
        return lexicalAnalyzer;
    }

    public Pointer getPointer(){
        return pointer;
    }

    public void left() {
        pointer = pointer.left();
    }

    public void right() {
        pointer = pointer.right();
    }

    public Memory getMemory() {
        return pointer.getMemory();
    }

    public void write(char c) {
        outPutInterface.write(c);
    }
}
