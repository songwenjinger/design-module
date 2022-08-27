package com.mode.no04_flyWeight_demo.code;

import com.mode.no03_abstractFactory_demo.demo.Shape;

public class Circle implements Shape {


    private int x;

    public Circle(int x) {
        this.x = x;
    }

    @Override
    public void draw() {
        System.out.println("画半径为" + x + "的圆");
    }
}
