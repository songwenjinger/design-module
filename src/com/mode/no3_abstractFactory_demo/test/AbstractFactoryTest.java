package com.mode.no3_abstractFactory_demo.test;

import com.mode.no3_abstractFactory_demo.demo.AbstractFactory;
import com.mode.no3_abstractFactory_demo.demo.Color;
import com.mode.no3_abstractFactory_demo.demo.FactoryProducer;
import com.mode.no3_abstractFactory_demo.demo.Shape;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory circle = FactoryProducer.getFactory("shape");
        Shape square = circle.getShape("square");
        square.draw();

        AbstractFactory color = FactoryProducer.getFactory("color");
        Color red = color.getColor("red");
        red.fill();
    }
}
