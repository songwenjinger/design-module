package com.mode.no19_brige_demo.test;

import com.mode.no19_brige_demo.code.Circle;
import com.mode.no19_brige_demo.code.GreenCircle;
import com.mode.no19_brige_demo.code.RedCircle;
import com.mode.no19_brige_demo.code.Shape;

public class BridgeTest {

    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 10, 10, 1000);
        Shape greenCircle = new Circle(new GreenCircle(), 2, 2, 30);

        redCircle.draw();
        greenCircle.draw();
    }
}
