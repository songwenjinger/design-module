package com.mode.no23_visitor_demo.code;

public interface ComputerPart {
    public void accept(ComputerPartVisitor visitor);
}
