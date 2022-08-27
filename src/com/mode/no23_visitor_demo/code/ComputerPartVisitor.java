package com.mode.no23_visitor_demo.code;

public interface ComputerPartVisitor {

    public void visit(KeyBoard keyBoard);

    public void visit(Monitor monitor);

    public void visit(Mouse mouse);

    public void visit(Computer computer);
}
