package primitive.node.impl.terminal;

import primitive.env.Enviroment;
import primitive.node.Node;

public class RIGHT implements Node{
    private Enviroment env;
    public RIGHT(Enviroment env){
        this.env = env;
    }
    @Override
    public char get() {
        env.right();
        return 0;
    }
    @Override
    public boolean parse() {
        return true;
    }

}
