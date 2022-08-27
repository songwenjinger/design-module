package com.mode.no19_brige_demo.code;

public abstract class Shape {

    protected int x, y, radius;
    protected DrawApI drawApI;

    public Shape(DrawApI drawApI, int x, int y, int radius) {
        this.drawApI = drawApI;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public abstract void draw();
}
