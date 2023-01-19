package com.fitin.patterns.b.Command.commands;

import com.fitin.patterns.b.Command.Command;
import com.fitin.patterns.b.Command.CommandType;
import com.fitin.patterns.b.Command.Robot;

public class RightCommand extends Command {

    public RightCommand(Robot robot) {
        super(robot);
    }

    @Override
    public String execute() {
        robot.currentPosition = CommandType.RIGHT;
        return "the robot turned to right";
    }

    @Override
    public String undoAct() {
        return "ups, the robot returned from right to last position";
    }

    @Override
    public String getType() {
        return CommandType.RIGHT.toString();
    }
}
