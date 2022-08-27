package com.mode.no16_composite_demo.code;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    public Composite(String name) {
        super(name);
    }

    private List<Component> children = new ArrayList<>();

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display() {
        System.out.println("非叶子节点---" + name);
        for (Component child : children) {
            child.display();
        }
    }
}
