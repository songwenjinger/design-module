package com.mode.no15_memo_demo.code;

import com.mode.no13_state_demo.code.State;

public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void show() {
        System.out.println("originator-state:" + state);
    }
}
