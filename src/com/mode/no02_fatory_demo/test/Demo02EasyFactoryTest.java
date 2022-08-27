package com.mode.no02_fatory_demo.test;

import java.util.Objects;

/**
 * 简单工厂模式
 */
public class Demo02EasyFactoryTest {
    public abstract class Operation {
        private Integer a;
        private Integer b;
        public Integer getA() {
            return a;
        }

        public void setA(Integer a) {
            this.a = a;
        }

        public Integer getB() {
            return b;
        }

        public void setB(Integer b) {
            this.b = b;
        }

        public abstract Integer getOperate();
    }

    public class AddOperation extends Operation {
        @Override
        public Integer getOperate() {
            return getA() + getB();
        }
    }

    public class SubOperation extends Operation {
        @Override
        public Integer getOperate() {
            return getA() - getB();
        }
    }

    public Operation createOperation(String s) {
        if (Objects.equals(s, "add")) {
            return new AddOperation();
        } else {
            return new SubOperation();
        }
    }

    public static void main(String[] args) {
        Demo02EasyFactoryTest factory=new Demo02EasyFactoryTest();

        Operation add = factory.createOperation("add");
        add.setA(1);
        add.setB(3);
        System.out.println(add.getOperate());

    }
}
