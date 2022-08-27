package com.mode.no3_abstractFactory_demo.demo;

import java.util.Objects;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String s) {
        return null;
    }


    @Override
    public Color getColor(String s) {
        if (Objects.equals(s, "red")) {
            return new Red();
        } else if (Objects.equals(s, "green")) {
            return new Green();
        }
        return null;
    }
}
