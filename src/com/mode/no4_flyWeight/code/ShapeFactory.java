package com.mode.no4_flyWeight.code;

import java.util.HashMap;

public class ShapeFactory {

    private static  HashMap<Integer, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(Integer x) {
        if (circleMap.get(x) == null) {
            Circle circle = new Circle(x);
            circleMap.put(x, circle);
            return circle;
        } else {
            return circleMap.get(x);
        }
    }
}
