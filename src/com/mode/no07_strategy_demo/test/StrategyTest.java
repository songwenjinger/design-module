package com.mode.no07_strategy_demo.test;

import com.mode.no07_strategy_demo.code.Context;
import com.mode.no07_strategy_demo.code.OperationAdd;
import com.mode.no07_strategy_demo.code.OperationSub;

public class StrategyTest {

    public static void main(String[] args) {
        Context context1 = new Context(new OperationAdd());
        System.out.println(context1.executeStrategy(1, 2));

        Context context2 = new Context(new OperationSub());
        System.out.println(context2.executeStrategy(1, 2));


    }
}
