package primitive.node.impl.terminal;

import primitive.env.Enviroment;
import primitive.node.Node;

public class LEFT implements Node{
    private Enviroment env;
    public LEFT(Enviroment env){
        this.env = env;
    }
    @Override
    public char get() {
        env.left();
        return 0;
    }
    @Override
    public boolean parse() {
        return true;
    }

}
