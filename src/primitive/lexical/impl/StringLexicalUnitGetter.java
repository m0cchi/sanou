package primitive.lexical.impl;

import java.util.HashMap;
import java.util.Stack;

import primitive.lexical.LexicalType;
import primitive.lexical.LexicalUnit;
import primitive.lexical.interfaze.LexicalUnitGetter;

public class StringLexicalUnitGetter implements LexicalUnitGetter {
    private static HashMap<String, LexicalType> types = new HashMap<String, LexicalType>(){
        {
            put(">", LexicalType.RIGHT);
            put("<", LexicalType.LEFT);
            put("+", LexicalType.ADD);
            put("-", LexicalType.SUB);
            put(".", LexicalType.OUT);
            put("[", LexicalType.LOOP);
            put("]", LexicalType.JUMP);
            put("\n", LexicalType.NOP);
            put("\t", LexicalType.NOP);
            put(" ", LexicalType.NOP);
            put("\r", LexicalType.NOP);
        }
    };
    private String proc;
    private Stack<LexicalUnit> stack;

    public StringLexicalUnitGetter(String proc) {
        this.proc = proc;
        this.stack = new Stack<LexicalUnit>();
    }

    @Override
    public LexicalUnit get() {
        if(!stack.isEmpty()){
            return stack.pop();
        }
        int l = 0;
        int f = proc.length();
        StringBuffer sb = new StringBuffer();
        String temp = null;
        LexicalUnit unit = new LexicalUnit(LexicalType.END);
        if(f==0){
            return unit;
        }
        while (true) {
            sb.append(proc.substring(l, l+1));
            temp = sb.toString();
            
            if(types.containsKey(temp)){
                unit = new LexicalUnit(types.get(temp));
                this.proc = this.proc.substring(l+1, f);
                break;
            }
            l++;
            if(l==f){
                break;
            }
            
        }

        return unit;
    }

    @Override
    public void unget(LexicalUnit unit) {
        stack.push(unit);
    }

    @Override
    public LexicalUnit peek() {
        return stack.peek();
    }

}
