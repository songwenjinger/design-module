package com.mode.no14_adapter_demo.code;

public class Adapter extends Target {
    private Adaptee adaptee=new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
