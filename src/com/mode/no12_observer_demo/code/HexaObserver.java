package com.mode.no12_observer_demo.code;

import com.mode.no02_fatory_demo.code.Sub;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa--update-state:" + subject.getState());
    }
}
