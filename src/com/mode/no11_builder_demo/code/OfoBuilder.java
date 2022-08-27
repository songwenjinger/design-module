package com.mode.no11_builder_demo.code;

public class OfoBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("ofo-铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("ofo-橡胶");
    }
}
