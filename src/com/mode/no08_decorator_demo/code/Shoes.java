package com.mode.no08_decorator_demo.code;

public class Shoes extends Finery {

    @Override
    public void show() {
        System.out.printf("鞋子" + " ");
        super.show();
    }
}
