package com.mode.no13_state_demo.code;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("in start state-----");
        context.setState(new StopState());
    }

    public String toString() {
        return "start state";
    }
}
