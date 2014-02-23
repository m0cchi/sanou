package primitive.node.impl.terminal;

import primitive.env.Enviroment;
import primitive.node.Node;

public class OUT implements Node{
    private Enviroment env;
    public OUT(Enviroment env){
        this.env = env;
    }
    @Override
    public char get() {
        env.getMemory().out();
        return 0;
    }
    @Override
    public boolean parse() {
        return true;
    }

}
