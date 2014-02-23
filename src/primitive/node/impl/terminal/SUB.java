package primitive.node.impl.terminal;

import primitive.env.Enviroment;
import primitive.node.Node;

public class SUB implements Node{
    private Enviroment env;
    public SUB(Enviroment env){
        this.env = env;
    }
    @Override
    public char get() {
        env.getMemory().sub();
        return 0;
    }

    @Override
    public boolean parse() {
        return true;
    }
    

}
