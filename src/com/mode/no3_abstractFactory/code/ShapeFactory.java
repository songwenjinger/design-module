package com.mode.no3_abstractFactory.code;

import java.util.Objects;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String s) {
        if (Objects.equals(s, "circle")) {
            return new CircleShape();
        } else if (Objects.equals(s, "square")) {
            return new SquareShape();
        }
        return null;
    }

    @Override
    public Color getColor(String s) {
        return null;
    }
}
