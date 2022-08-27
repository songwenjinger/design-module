package com.mode.no11_builder_demo.code;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct()
    {
        builder.buildFrame();
        builder.buildSeat();
        return builder.getBike();
    }
}
