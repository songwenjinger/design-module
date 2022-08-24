package com.mode.no3_abstractFactory.code;

import com.mode.no3_abstractFactory.code.AbstractFactory;
import com.mode.no3_abstractFactory.code.ColorFactory;
import com.mode.no3_abstractFactory.code.ShapeFactory;

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
