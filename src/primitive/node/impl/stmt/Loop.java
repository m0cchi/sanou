package primitive.node.impl.stmt;

import java.util.ArrayList;

import primitive.env.Enviroment;
import primitive.env.Memory;
import primitive.lexical.LexicalType;
import primitive.node.Node;

public class Loop implements Node{
    private Node stmtlist;
    private Enviroment env;
    public Loop(Enviroment env) {
        this.env = env;
    }

    @Override
    public char get() {
        Memory memory = env.getMemory();
        while(memory.get() != 0){
            stmtlist.get();
            memory = env.getMemory();
        }
        return 0;
    }

    @Override
    public boolean parse() {
        stmtlist = new StmtList(env);
        if(stmtlist.parse()){
            return env.getLexicalAnalyzer().get().getType() == LexicalType.JUMP;
        }
        return false;
    }

}
