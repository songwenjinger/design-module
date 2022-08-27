package com.mode.no6_prototype.code3;

import com.mode.no6_prototype.code2.Prototype2;

public class Prototype3 implements Cloneable{
    private String name;
    private int age;
    private  Work3 work;

    public Prototype3(String name, int age, Work3 work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Work3 getWork() {
        return work;
    }

    public void setWork(String name,Integer salary) {
        work.company = name;
        work.salary=salary;
    }

    @Override
    public Prototype3 clone() throws CloneNotSupportedException {
        Prototype3 prototype3=(Prototype3) super.clone();
        prototype3.work=(Work3) prototype3.getWork().clone();
        return prototype3;
    }

    @Override
    public String toString() {
        return "Prototype3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work=" + work +
                '}';
    }
}
