package com.mode.no15_memo_demo.test;

import com.mode.no15_memo_demo.code.CareTaker;
import com.mode.no15_memo_demo.code.Originator;

public class MementoTest {
    public static void main(String[] args) {
        Originator originator = new Originator("on");
        originator.show();
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(originator.createMemento());
        originator.setState("off");
        originator.show();

        originator.setMemento(careTaker.getMemento());
        originator.show();


    }
}
