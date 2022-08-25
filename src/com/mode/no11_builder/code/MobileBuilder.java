package com.mode.no11_builder.code;

public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("摩拜-碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("摩拜-真皮");
    }
}
