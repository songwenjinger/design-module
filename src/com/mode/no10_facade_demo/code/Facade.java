package com.mode.no10_facade_demo.code;

import com.mode.no02_fatory_demo.code.Sub;

public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA() {
        System.out.println("外观类的A方法:");
        one.methodOne();
        three.methodThree();
        four.methodFour();
    }

    public void methodB() {
        System.out.println("外观类的B方法:");
        two.methodTwo();
        three.methodThree();
    }
}
