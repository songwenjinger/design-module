package com.mode.no4_flyWeight.code;

import com.mode.no3_abstractFactory.code.Shape;

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
