package com.fitin.patterns.c.Prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrototypeTest {
    @Test
    void rectangleTest() {
        var rectangle = new Rectangle(1, 11, Color.BLACK, 222, 3333);
        var rectangleCopy = rectangle.clone();
        assertEquals(rectangle.getX(), rectangleCopy.getX());
        assertEquals(rectangle.getY(), rectangleCopy.getY());
        assertEquals(rectangle.getColor(), rectangleCopy.getColor());
        assertEquals(rectangle.getWidth(), rectangleCopy.getWidth());
        assertEquals(rectangle.getHeight(), rectangleCopy.getHeight());
    }

    @Test
    void circleTest() {
        var circle = new Circle(1, 11, Color.WHITE, 222);
        var circleCopy = circle.clone();
        assertEquals(circle.getX(), circleCopy.getX());
        assertEquals(circle.getY(), circleCopy.getY());
        assertEquals(circle.getColor(), circleCopy.getColor());
        assertEquals(circle.getRadius(), circleCopy.getRadius());
    }
}
