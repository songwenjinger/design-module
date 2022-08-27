package com.mode.no06_prototype_demo.test;

import com.mode.no06_prototype_demo.code2.Prototype2;
import com.mode.no06_prototype_demo.code2.Work;

/**
 * 浅复制，work的引用被修改
 */
public class PrototypeTest2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Work work = new Work("网易", 88);
        Prototype2 x1 = new Prototype2("小王", 23, work);
        Prototype2 x2 = x1.clone();
        x2.setWork("百度", 100);

        Prototype2 x3 = x1.clone();
        x3.setWork("哔哩哔哩", 1000);

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
