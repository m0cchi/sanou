package primitive.node.impl.terminal;

import primitive.env.Enviroment;
import primitive.node.Node;

public class ADD implements Node{
    private Enviroment env;
    public ADD(Enviroment env){
        this.env = env;
    }
    @Override
    public char get() {
        env.getMemory().add();
        return 0;
    }

    @Override
    public boolean parse() {
        return true;
    }

}
