package com.mode.no08_decorator_demo.test;

import com.mode.no08_decorator_demo.code.Dress;
import com.mode.no08_decorator_demo.code.Person;
import com.mode.no08_decorator_demo.code.Shoes;
import com.mode.no08_decorator_demo.code.TShirts;

public class DecoratorTest {

    public static void main(String[] args) {
        Person p = new Person("小明");
        TShirts tShirts = new TShirts();
        Dress dress = new Dress();
        Shoes shoes = new Shoes();
        tShirts.setPerson(p);
        dress.setPerson(p);
        shoes.setPerson(p);
        System.out.println("第一种打扮:");
        tShirts.show();

        System.out.println("第二种打扮:");
        dress.show();

        System.out.println("第三种打扮:");
        shoes.show();

    }
}
