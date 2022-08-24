package com.mode.no2_fatory.code;

public class SubFactory implements Factory {
    @Override
    public Operation createFactory() {
        return new Sub();
    }
}
