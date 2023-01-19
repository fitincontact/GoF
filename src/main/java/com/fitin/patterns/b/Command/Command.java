package com.fitin.patterns.b.Command;

public abstract class Command {
    public Robot robot;
    private CommandType backup;

    protected Command(Robot robot) {
        this.robot = robot;
        backup();
        addToHistory();
    }

    private void backup() {
        backup = robot.currentPosition;
    }

    private void addToHistory() {
        robot.history.push(this);
    }

    public String undo() {
        robot.currentPosition = backup;
        return undoAct();
    }

    public abstract String execute();

    public abstract String undoAct();

    public abstract String getType();
}
