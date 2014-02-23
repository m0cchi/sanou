package test;

import primitive.env.Enviroment;
import primitive.lexical.LexicalAnalyzer;
import primitive.node.impl.stmt.StmtList;

public class test {

    public static void main(String[] args) {
        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer(
                ">+++++++++[<++++++++>-]<.>+++++++[<++++>-]<+.+++++++..+++.[-]>++++++++[<++++>-]<.>+++++++++++[<+++++>-]<.>++++++++[<+++>-]<.+++.------.--------.[-]>++++++++[<++++>-]<+.[-]++++++++++.");
        Enviroment env = new Enviroment(lexicalAnalyzer);
        StmtList stmtList = new StmtList(env);
        stmtList.parse();
        stmtList.get();
    }

}
