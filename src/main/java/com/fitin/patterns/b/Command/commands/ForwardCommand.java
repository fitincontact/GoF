package com.fitin.patterns.b.Command.commands;

import com.fitin.patterns.b.Command.Command;
import com.fitin.patterns.b.Command.CommandType;
import com.fitin.patterns.b.Command.Robot;

public class ForwardCommand extends Command {
    public ForwardCommand(Robot robot) {
        super(robot);
    }

    @Override
    public String execute() {
        robot.currentPosition = CommandType.FORWARD;
        return "the robot walked to forward";
    }

    @Override
    public String undoAct() {
        return "ups, the robot walked to back";
    }

    @Override
    public String getType() {
        return CommandType.FORWARD.toString();
    }
}
