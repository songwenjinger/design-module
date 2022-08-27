package com.mode.no19_command_demo.code;

public class Invoker {

    private Command command;


    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
