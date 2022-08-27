package com.mode.no02_fatory_demo.code;

public class SubFactory implements Factory {

    @Override
    public Operation createFactory() {
        return new Sub();
    }
}
