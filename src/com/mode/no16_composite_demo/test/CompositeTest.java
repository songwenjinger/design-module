package com.mode.no16_composite_demo.test;

import com.mode.no16_composite_demo.code.Composite;
import com.mode.no16_composite_demo.code.Leaf;

public class CompositeTest {

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("A"));
        root.add(new Leaf("B"));

        Composite comp1 = new Composite("composite x");
        comp1.add(new Leaf("leaf XA"));
        comp1.add(new Leaf("leaf XB"));
        root.add(comp1);

        Composite comp2 = new Composite("composite XY");
        comp2.add(new Leaf("leaf XXA"));
        comp2.add(new Leaf("leaf XXB"));
        root.add(comp2);


        root.display();
    }
}
