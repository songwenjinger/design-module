package com.mode.no16_composite_module.code;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("叶子节点不能再增加分支和树叶了...");
    }

    @Override
    public void remove(Component c) {
        System.out.println("叶子节点没有可以删除的了...");
    }

    @Override
    public void display() {
        System.out.println("叶子节点" + name);
    }
}
