package com.mode.no23_visitor_demo.test;

import com.mode.no23_visitor_demo.code.Computer;
import com.mode.no23_visitor_demo.code.ComputerPart;
import com.mode.no23_visitor_demo.code.ComputerPartDisplayVisitor;

public class VisitorTest {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
