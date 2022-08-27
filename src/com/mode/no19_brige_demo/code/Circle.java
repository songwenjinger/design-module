package com.mode.no19_brige_demo.code;

public class Circle extends Shape{


    public Circle(DrawApI drawApI, int x, int y, int radius) {
        super(drawApI, x, y, radius);
    }

    @Override
    public void draw() {
        drawApI.drawCircle(radius,x,y);
    }
}
