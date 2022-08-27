package com.mode.no05_template_demo.code;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("FootBall game initialize");
    }

    @Override
    void startPlay() {
        System.out.println("FootBall game startPlay");

    }

    @Override
    void endPlay() {
        System.out.println("FootBall game endPlay");
    }
}
