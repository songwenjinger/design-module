package com.mode.no7_strategy.code;

public class OperationSub implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
