package primitive.node.impl.terminal;

import primitive.env.Enviroment;
import primitive.env.Memory;
import primitive.node.Node;

public class OUT implements Node{
    private Enviroment env;
    public OUT(Enviroment env){
        this.env = env;
    }
    @Override
    public char get() {
        Memory memory = env.getMemory();
        char mem = memory.get();
        System.out.print(mem);
        return 0;
    }
    @Override
    public boolean parse() {
        return true;
    }

}
