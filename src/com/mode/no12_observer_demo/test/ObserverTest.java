package com.mode.no12_observer_demo.test;

import com.mode.no12_observer_demo.code.BinaryObserver;
import com.mode.no12_observer_demo.code.HexaObserver;
import com.mode.no12_observer_demo.code.OctalObserver;
import com.mode.no12_observer_demo.code.Subject;

public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new Subject();
        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);
        subject.setState(1);
    }





}
