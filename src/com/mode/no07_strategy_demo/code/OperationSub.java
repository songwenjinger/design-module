package com.mode.no07_strategy_demo.code;

public class OperationSub implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
