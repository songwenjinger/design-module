package com.mode.no18_brige_demo.code;

public class GreenCircle implements DrawApI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("drawing circle color: green,radius:" + radius
                + " x:" + x + ", y:" + y);
    }
}
