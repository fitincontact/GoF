package com.fitin.patterns.b.Command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandTest {
    @Test
    void test() {
        Robot robot = new Robot();
        robot.forward();
        robot.forward();
        robot.left();
        robot.right();
        var lastCommand = robot.getLastCommand();
        var fullPath = robot.getFullPath();

        assertEquals("RIGHT", lastCommand);
        assertEquals("FORWARD; FORWARD; LEFT; RIGHT; ", fullPath);

        robot.undo();
        fullPath = robot.getFullPath();
        assertEquals("FORWARD; FORWARD; LEFT; ", fullPath);
    }
}
