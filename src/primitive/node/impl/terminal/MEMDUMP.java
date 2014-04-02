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
        int no = 0,thisNo = -1;
        char ch = 0;
        Pointer p = env.getPointer();
        final Pointer finalPointer = p;
        StringBuffer sb = new StringBuffer();
        //get top
        while(p.hasLeft()){
            p = p.left();
        }
        //show all
        System.out.println("\n---- memory dump ----");
        while(p.hasRight()){
            ch = p.getMemory().get();
            if(p == finalPointer){
                System.out.println("current pointer - no:0x" + Integer.toHexString((no)));
            }
            sb.append("addr:0x"+ Integer.toHexString((no)) + " val:0x" + Integer.toHexString((int)ch) + "\n");
            p = p.right();
            no++;
        }
        System.out.println(sb);
        System.out.println("---------------------");
        return 0;
    }
    @Override
    public boolean parse() {
        return true;
    }

}
