package com.mode.no6_prototype.code2;

public class Prototype2 implements Cloneable {
    private String name;
    private Integer age;

    private Work work;

    public Prototype2(String name, Integer age, Work work) {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(String name,int salary) {
        work.company=name;
        work.salary=salary;
    }

    @Override
    public String toString() {
        return "Prototype2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work=" + work +
                '}';
    }

    @Override
    public Prototype2 clone() throws CloneNotSupportedException {
        System.out.println("prototype2的clone方法");
        return (Prototype2) super.clone();
    }
}
