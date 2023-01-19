package com.fitin.patterns.b.Command;

import com.fitin.patterns.b.Command.commands.BackCommand;
import com.fitin.patterns.b.Command.commands.ForwardCommand;
import com.fitin.patterns.b.Command.commands.LeftCommand;
import com.fitin.patterns.b.Command.commands.RightCommand;

public class Robot {
    public final CommandHistory history = new CommandHistory();
    public CommandType currentPosition;

    public String forward() {
        return new ForwardCommand(this).execute();
    }

    public String back() {
        return new BackCommand(this).execute();
    }

    public String left() {
        return new LeftCommand(this).execute();
    }

    public String right() {
        return new RightCommand(this).execute();
    }

    public String undo() {
        if (history.isEmpty()) return "history is empty";

        Command command = history.pop();
        if (command != null) {
            return command.undo();
        }
        return "!";
    }

    public String getLastCommand() {
        return currentPosition.toString();
    }

    public String getFullPath() {
        return history.getFullPath();
    }
}
