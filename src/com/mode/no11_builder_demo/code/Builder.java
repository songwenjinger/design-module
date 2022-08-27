package com.mode.no11_builder_demo.code;

public  abstract class Builder {

    protected Bike bike=new Bike();

    public abstract void buildFrame();
    public abstract void  buildSeat();

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }
}
