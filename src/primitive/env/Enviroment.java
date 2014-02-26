package primitive.env;

import primitive.env.interfaze.OutFrame;
import primitive.lexical.LexicalAnalyzer;

public class Enviroment {
    // constant
    public static final String VERSION = "OMOCHI_CORE_1.1";
    //
    private Pointer pointer;
    private LexicalAnalyzer lexicalAnalyzer;
    private OutFrame outFrame;

    public Enviroment(LexicalAnalyzer lexicalAnalyzer) {
        this.pointer = new Pointer();
        this.lexicalAnalyzer = lexicalAnalyzer;
        this.outFrame = new SystemOut();
    }

    public LexicalAnalyzer getLexicalAnalyzer() {
        return lexicalAnalyzer;
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
        outFrame.write(c);
    }
}
