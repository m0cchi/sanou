package primitive.env;

public class Memory {
    private char mem;

    public Memory() {
        mem = 0;
    }

    public Memory(Memory memory) {
        this.mem = memory.mem;
    }

    public void add() {
        mem++;
    }

    public void sub() {
        mem--;
    }

    public char get() {
        return mem;
    }

    public void out() {
        System.out.print(mem);
    }
}
