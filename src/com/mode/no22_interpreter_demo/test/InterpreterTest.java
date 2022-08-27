package com.mode.no22_interpreter_demo.test;

import com.mode.no22_interpreter_demo.code.AndExpression;
import com.mode.no22_interpreter_demo.code.Expression;
import com.mode.no22_interpreter_demo.code.OrExpression;
import com.mode.no22_interpreter_demo.code.TerminalExpression;

public class InterpreterTest {
    public static void main(String[] args) {
        Expression abc = new TerminalExpression("abc");
        Expression def = new TerminalExpression("def");

        AndExpression andExpression = new AndExpression(abc, def);
        System.out.println(andExpression.interpret("annd"));
        System.out.println(andExpression.interpret("abcdef"));

        OrExpression orExpression = new OrExpression(abc, def);
        System.out.println(orExpression.interpret("defg"));

    }
}
