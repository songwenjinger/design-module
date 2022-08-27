package com.mode.no06_prototype_demo.test;

import com.mode.no06_prototype_demo.code.ConcretePrototype;
import com.mode.no06_prototype_demo.code.Prototype;

/**
 *
 */
public class PrototypeTest1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype c1=new ConcretePrototype("gaga",20);
        Prototype c2=(Prototype)  ((ConcretePrototype) c1).clone();
        Prototype c3=(Prototype)  ((ConcretePrototype) c1).clone();
        System.out.println(c1.getAge());
        System.out.println(c2.getAge());
        System.out.println(c2==c3);
    }
}
