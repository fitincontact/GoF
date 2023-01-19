package com.fitin.patterns.b.Command.commands;

import com.fitin.patterns.b.Command.Command;
import com.fitin.patterns.b.Command.CommandType;
import com.fitin.patterns.b.Command.Robot;

public class BackCommand extends Command {

    public BackCommand(Robot robot) {
        super(robot);
    }

    @Override
    public String execute() {
        robot.currentPosition = CommandType.BACK;
        return "the robot stepped to back";
    }

    @Override
    public String undoAct() {
        return "ups, the robot wend forward";
    }

    @Override
    public String getType() {
        return CommandType.BACK.toString();
    }
}
