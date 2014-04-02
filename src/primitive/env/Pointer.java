package primitive.env;



public class Pointer {
    private Memory pointer;
    private Pointer left;
    private Pointer right;
    public Pointer(){
        pointer = new Memory();
    }

    public Pointer left(){
        if(!hasLeft()){
            this.left = new Pointer();
            this.left.right = this;
        }
        return this.left;
    }
    
    public Pointer right(){
        if(this.right == null){
            this.right = new Pointer();
            this.right.left = this;
        }
        return this.right;
    }
    
    public boolean hasLeft(){
        return this.left != null;
    }
    
    public void setMemory(Memory memory){
        this.pointer = memory;
    }
    
    public Memory getMemory(){
        return pointer;
    }
    
}
