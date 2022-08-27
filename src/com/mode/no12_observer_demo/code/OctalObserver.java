package com.mode.no12_observer_demo.code;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal--update-state:" + subject.getState());
    }
}
