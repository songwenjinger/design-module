package com.mode.no20_reposibility_chain_demo.test;

import com.mode.no20_reposibility_chain_demo.code.ConcreteHandler1;
import com.mode.no20_reposibility_chain_demo.code.ConcreteHandler2;
import com.mode.no20_reposibility_chain_demo.code.ConcreteHandler3;
import com.mode.no20_reposibility_chain_demo.code.Handler;

public class ChainTest {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        int[] request = new int[]{1, 2, 7, 8, 12, 166, 13, 40, 60, 13, 28};

        for (int i : request) {
            handler1.handleRequest(i);
        }
    }

}
