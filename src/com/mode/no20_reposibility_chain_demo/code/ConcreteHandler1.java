package com.mode.no20_reposibility_chain_demo.code;

public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (0 <= request && request < 10) {
            System.out.println(this.getClass().getName() + "处理了 request=" + request + "这个请求");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
