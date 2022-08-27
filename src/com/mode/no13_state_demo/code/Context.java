package com.mode.no13_state_demo.code;

public class Context {
    public Context() {
    }

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        System.out.println("当前工作状态" + state.getClass().getName());
        state.doAction(this);
    }

}
