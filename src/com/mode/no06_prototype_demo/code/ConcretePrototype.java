package com.mode.no06_prototype_demo.code;

public class ConcretePrototype extends Prototype{


    public ConcretePrototype(String name, Integer age) {
        super(name, age);
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("ConcretePrototype-clone方法");
        return super.clone();
    }
}
