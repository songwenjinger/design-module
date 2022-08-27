package com.mode.no12_observer_demo.code;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary--update-state:" + subject.getState());
    }
}
