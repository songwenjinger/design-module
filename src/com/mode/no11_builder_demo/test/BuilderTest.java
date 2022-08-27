package com.mode.no11_builder_demo.test;

import com.mode.no11_builder_demo.code.Bike;
import com.mode.no11_builder_demo.code.Director;
import com.mode.no11_builder_demo.code.OfoBuilder;

public class BuilderTest {

    public static void main(String[] args) {
        Director director=new Director(new OfoBuilder());
        Bike ofoBuilder = director.construct();
        System.out.println(ofoBuilder.getFrame());
        System.out.println(ofoBuilder.getSeat());
    }
}
