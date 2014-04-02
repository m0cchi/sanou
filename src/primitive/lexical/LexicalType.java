package primitive.lexical;

public enum LexicalType {
    RIGHT,  //decrement the data pointer
    LEFT,   //increment the data pointer
    ADD,    //increment
    SUB,    //decrement 
    OUT,    //output
    LOOP,   //LOOP LABEL
    JUMP,    //JUMP to LOOP LABEL
    NOP,    //no operation
    MEMDUMP,    //memory dump
    END
}
