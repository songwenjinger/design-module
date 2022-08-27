package com.mode.no2_fatory_demo.code;

public class AddFactory implements Factory {

    @Override
    public Operation createFactory() {
        return new Add();
    }
}
