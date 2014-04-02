package primitive.node.impl.terminal;

import java.util.Scanner;

import primitive.env.Enviroment;
import primitive.env.Memory;
import primitive.node.Node;

public class IN implements Node{
    private Enviroment env;
    private Scanner in;
    public IN(Enviroment env){
        this.env = env;
        this.in = new Scanner(System.in);
    }
    @Override
    public char get() {
        Memory memory = env.getMemory();
        char ch = this.in.next().charAt(0);
        memory.set(ch);
        return 0;
    }
    @Override
    public boolean parse() {
        return true;
    }

}
