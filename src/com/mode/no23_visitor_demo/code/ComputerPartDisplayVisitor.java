package com.mode.no23_visitor_demo.code;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("display visit keyBoard...");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("display visit monitor...");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("display visit mouse...");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("display visit computer...");
    }
}
