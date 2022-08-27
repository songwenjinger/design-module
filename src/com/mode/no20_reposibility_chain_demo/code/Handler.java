package com.mode.no20_reposibility_chain_demo.code;

public abstract class Handler {
    protected Handler successor;



    public abstract void handleRequest(int request);

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
