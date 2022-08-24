package com.mode.no2_fatory.code;

public class AddFactory implements Factory {
    @Override
    public Operation createFactory() {
        return new Add();
    }
}
