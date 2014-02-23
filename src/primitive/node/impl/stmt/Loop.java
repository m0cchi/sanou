package primitive.node.impl.stmt;

import primitive.env.Enviroment;
import primitive.env.Memory;
import primitive.lexical.LexicalAnalyzer;
import primitive.lexical.LexicalType;
import primitive.lexical.LexicalUnit;
import primitive.node.Node;

public class Loop implements Node {
    private Node stmtlist;
    private Enviroment env;

    public Loop(Enviroment env) {
        this.env = env;
    }

    @Override
    public char get() {
        Memory memory = env.getMemory();
        while (memory.get() != 0) {
            stmtlist.get();
            memory = env.getMemory();
        }
        return 0;
    }

    @Override
    public boolean parse() {
        LexicalAnalyzer lex = env.getLexicalAnalyzer();
        LexicalUnit unit;
        LexicalType type;
        stmtlist = new StmtList(env);
        if (stmtlist.parse()) {
            unit = lex.get();
            type = unit.getType();
            return type == LexicalType.JUMP;
        }
        return false;
    }

}
