package com.mode.no13_state_demo.test;

import com.mode.no13_state_demo.code.Context;
import com.mode.no13_state_demo.code.StartState;

public class StateDemo {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new StartState());
        context.request();
        context.request();
        context.request();
        context.request();
    }
}
