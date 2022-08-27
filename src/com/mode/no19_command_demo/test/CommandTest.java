package com.mode.no19_command_demo.test;

import com.mode.no19_command_demo.code.Command;
import com.mode.no19_command_demo.code.ConcreteCommand;
import com.mode.no19_command_demo.code.Invoker;
import com.mode.no19_command_demo.code.Receiver;

public class CommandTest {

    public static void main(String[] args) {
        Receiver r = new Receiver();
        Command command = new ConcreteCommand(r);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
