package com.mode.no04_flyWeight_demo.test;

import com.mode.no04_flyWeight_demo.code.Circle;
import com.mode.no04_flyWeight_demo.code.ShapeFactory;

public class FlyWeightTest {

    public static void main(String[] args) {

        for (int i = 1; i < 20; i++) {
            Circle circle = ShapeFactory.getCircle(i);
            circle.draw();
        }

        for (int i = 1; i < 20; i++) {
            Circle circle = ShapeFactory.getCircle(i);
            circle.draw();
        }

        System.out.println(ShapeFactory.getCircle(1)==ShapeFactory.getCircle(1));
    }
}
