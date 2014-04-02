package primitive.node.impl.stmt;

import java.util.ArrayList;

import primitive.env.Enviroment;
import primitive.lexical.LexicalAnalyzer;
import primitive.lexical.LexicalType;
import primitive.lexical.LexicalUnit;
import primitive.node.Node;
import primitive.node.impl.terminal.ADD;
import primitive.node.impl.terminal.IN;
import primitive.node.impl.terminal.LEFT;
import primitive.node.impl.terminal.MEMDUMP;
import primitive.node.impl.terminal.OUT;
import primitive.node.impl.terminal.RIGHT;
import primitive.node.impl.terminal.SUB;

public class StmtList implements Node {
    private Enviroment env;
    private ArrayList<Node> list;

    public StmtList(Enviroment env) {
        this.env = env;
        this.list = new ArrayList<Node>();
    }

    @Override
    public char get() {
        for (Node node : list) {
            node.get();
        }
        return 0;
    }

    @Override
    public boolean parse() {
        LexicalAnalyzer lex = env.getLexicalAnalyzer();
        LexicalUnit unit;
        LexicalType type;
        Node node = null;
        while (true) {
            unit = lex.get();
            type = unit.getType();
            if (type == LexicalType.END) {
                break;
            }
            switch (type) {
            case LOOP:
                node = new Loop(env);
                break;
            case JUMP:
                lex.unget(unit);
                return true;
            case ADD:
                node = new ADD(env);
                break;
            case SUB:
                node = new SUB(env);
                break;
            case OUT:
                node = new OUT(env);
                break;
            case IN:
                node = new IN(env);
                break;
            case LEFT:
                node = new LEFT(env);
                break;
            case RIGHT:
                node = new RIGHT(env);
                break;
            case MEMDUMP:
                node = new MEMDUMP(env);
                break;
            case NOP:
                continue;
            default:
                node = null;
            }
            if (node != null && node.parse())
                list.add(node);
            else
                return false;
        }
        return true;
    }

}
