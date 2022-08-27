package com.mode.no21_mediator_demo.test;

import com.mode.no21_mediator_demo.code.ConcreteColleague1;
import com.mode.no21_mediator_demo.code.ConcreteColleague2;
import com.mode.no21_mediator_demo.code.ConcreteMediator;
import com.mode.no21_mediator_demo.code.Mediator;


public class MediatorTest {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);


        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);
        colleague1.send("吃饭了吗");
        colleague2.send("还没吃，准备去了");
    }
}
