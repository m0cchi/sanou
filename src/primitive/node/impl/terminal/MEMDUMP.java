package primitive.node.impl.terminal;

import primitive.env.Enviroment;
import primitive.env.Memory;
import primitive.env.Pointer;
import primitive.node.Node;

public class MEMDUMP implements Node{
    private Enviroment env;
    public MEMDUMP(Enviroment env){
        this.env = env;
    }
    @Override
    public char get() {
        int no = 0;
        char ch = 0;
        Pointer p = env.getPointer();
        //get top
        while(p.hasLeft()){
            p = p.left();
        }
        //show all
        System.out.println("\n---- memory dump ----");
        while(p.hasRight()){
            ch = p.getMemory().get();
            System.out.println("addr:0x"+ Integer.toHexString((no)) + " val:0x" + Integer.toHexString((int)ch));
            p = p.right();
            no++;
        }
        System.out.println("---------------------");
        return 0;
    }
    @Override
    public boolean parse() {
        return true;
    }

}
