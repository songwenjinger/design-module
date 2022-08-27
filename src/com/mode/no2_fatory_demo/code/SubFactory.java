package com.mode.no2_fatory_demo.code;

public class SubFactory implements Factory {

    @Override
    public Operation createFactory() {
        return new Sub();
    }
}
