package primitive.env;

import primitive.env.interfaze.OutPutInterface;

public class SystemOut implements OutPutInterface{

    @Override
    public void write(char c) {
        System.out.print(c);
    }

    @Override
    public void write(String str) {
        System.out.print(str);
    }

}
