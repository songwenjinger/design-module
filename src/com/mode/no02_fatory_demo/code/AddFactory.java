package com.mode.no02_fatory_demo.code;

public class AddFactory implements Factory {

    @Override
    public Operation createFactory() {
        return new Add();
    }
}
