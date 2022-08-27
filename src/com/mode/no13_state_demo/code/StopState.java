package com.mode.no13_state_demo.code;

public class StopState implements State {
    public StopState() {
    }

    @Override
    public void doAction(Context context) {
        System.out.println("in stop state----");
        context.setState(new StartState());
    }

    public String toString() {
        return "stop state";
    }
}
