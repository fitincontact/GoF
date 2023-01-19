package com.fitin.patterns.b.Command.commands;

import com.fitin.patterns.b.Command.Command;
import com.fitin.patterns.b.Command.CommandType;
import com.fitin.patterns.b.Command.Robot;

public class LeftCommand extends Command {

    public LeftCommand(Robot robot) {
        super(robot);
    }

    @Override
    public String execute() {
        robot.currentPosition = CommandType.LEFT;
        return "the happy robot turned to left";
    }

    @Override
    public String undoAct() {
        return "ups, the robot returned from left to last position";
    }

    @Override
    public String getType() {
        return CommandType.LEFT.toString();
    }
}
