package com.mode.no03_abstractFactory_demo.demo;

import java.util.Objects;

public class FactoryProducer {

    public FactoryProducer() {
    }


    public static AbstractFactory getFactory(String choice) {
        if (Objects.equals(choice, "shape")) {
            return new ShapeFactory();

        } else if (Objects.equals(choice, "color")) {
            return new ColorFactory();
        }
        return null;
    }
}
