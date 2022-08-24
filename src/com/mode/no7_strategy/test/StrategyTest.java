package com.mode.no7_strategy.test;

import com.mode.no7_strategy.code.Context;
import com.mode.no7_strategy.code.OperationAdd;
import com.mode.no7_strategy.code.OperationSub;

public class StrategyTest {

    public static void main(String[] args) {
        Context context1 = new Context(new OperationAdd());
        System.out.println(context1.executeStrategy(1, 2));

        Context context2 = new Context(new OperationSub());
        System.out.println(context2.executeStrategy(1, 2));


    }
}
