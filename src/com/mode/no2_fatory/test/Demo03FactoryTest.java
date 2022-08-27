package com.mode.no2_fatory.test;

import com.mode.no2_fatory.code.AddFactory;
import com.mode.no2_fatory.code.Factory;
import com.mode.no2_fatory.code.Operation;
import com.mode.no2_fatory.code.SubFactory;

import java.lang.reflect.InvocationTargetException;

public class Demo03FactoryTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<AddFactory> addFactoryClass = AddFactory.class;
        Class<SubFactory> subFactoryClass = SubFactory.class;
        Factory addFactory = addFactoryClass.getDeclaredConstructor().newInstance();
        Factory subFactory = subFactoryClass.getDeclaredConstructor().newInstance();
        Operation addOperation = addFactory.createFactory();
        Operation subOperation = subFactory.createFactory();
        Integer result1 = addOperation.getResult(1, 3);
        Integer result2 = subOperation.getResult(1, 3);
        System.out.println("add:" + result1);
        System.out.println("sub:" + result2);



    }


}
