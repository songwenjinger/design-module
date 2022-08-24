package com.mode.no3_abstractFactory.test;

import com.mode.no2_fatory.code.Factory;
import com.mode.no3_abstractFactory.code.AbstractFactory;
import com.mode.no3_abstractFactory.code.Color;
import com.mode.no3_abstractFactory.code.FactoryProducer;
import com.mode.no3_abstractFactory.code.Shape;

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
