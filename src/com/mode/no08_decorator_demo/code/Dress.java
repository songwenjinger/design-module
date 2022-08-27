package com.mode.no08_decorator_demo.code;

public class Dress extends Finery {

    @Override
    public void show() {
        System.out.printf("裙子" + " ");
        super.show();
    }
}
