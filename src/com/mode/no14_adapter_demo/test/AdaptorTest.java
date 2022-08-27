package com.mode.no14_adapter_demo.test;

import com.mode.no14_adapter_demo.code.Adapter;
import com.mode.no14_adapter_demo.code.Target;

public class AdaptorTest {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
