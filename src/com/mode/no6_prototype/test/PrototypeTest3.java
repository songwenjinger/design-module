package com.mode.no6_prototype.test;

import com.mode.no6_prototype.code.ConcretePrototype;
import com.mode.no6_prototype.code.Prototype;
import com.mode.no6_prototype.code2.Prototype2;
import com.mode.no6_prototype.code2.Work;
import com.mode.no6_prototype.code3.Prototype3;
import com.mode.no6_prototype.code3.Work3;

/**
 *
 */
public class PrototypeTest3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Work3 work = new Work3("网易", 88);
        Prototype3 x1 = new Prototype3("小王", 23, work);
        Prototype3 x2 =  x1.clone();
        x2.setWork("百度", 100);

        Prototype3 x3 = x1.clone();
        x3.setWork("哔哩哔哩", 1000);

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
