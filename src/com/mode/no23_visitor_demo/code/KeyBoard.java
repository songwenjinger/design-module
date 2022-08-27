package com.mode.no23_visitor_demo.code;

public class KeyBoard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
