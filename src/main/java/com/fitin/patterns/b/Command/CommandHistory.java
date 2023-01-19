package com.fitin.patterns.b.Command;

import java.util.Stack;

public class CommandHistory {
    private final Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    String getFullPath() {
        StringBuilder result = new StringBuilder();
        for (var i : history) {
            result.append(i.getType());
            result.append("; ");
        }
        return result.toString();
    }
}
