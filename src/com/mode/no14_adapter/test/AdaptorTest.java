package com.mode.no14_adapter.test;

import com.mode.no14_adapter.code.Adapter;
import com.mode.no14_adapter.code.Target;

public class AdaptorTest {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
