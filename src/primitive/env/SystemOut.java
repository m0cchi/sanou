package primitive.env;

import primitive.env.interfaze.OutFrame;

public class SystemOut implements OutFrame{

    @Override
    public void write(char c) {
        System.out.print(c);
    }

    @Override
    public void write(String str) {
        System.out.print(str);
    }

}
