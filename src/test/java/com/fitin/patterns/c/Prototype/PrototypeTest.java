package com.fitin.patterns.c.Prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrototypeTest {
    @Test
    void rectangleTest() {
        var rectangle = new Rectangle(1, 11, Color.BLACK, 222, 3333);
        var rectangleCopy = rectangle.clone();
        Assertions.assertEquals(rectangle.getX(), rectangleCopy.getX());
        Assertions.assertEquals(rectangle.getY(), rectangleCopy.getY());
        Assertions.assertEquals(rectangle.getColor(), rectangleCopy.getColor());
        Assertions.assertEquals(rectangle.getWidth(), rectangleCopy.getWidth());
        Assertions.assertEquals(rectangle.getHeight(), rectangleCopy.getHeight());
    }

    @Test
    void circleTest() {
        var circle = new Circle(1, 11, Color.WHITE, 222);
        var circleCopy = circle.clone();
        Assertions.assertEquals(circle.getX(), circleCopy.getX());
        Assertions.assertEquals(circle.getY(), circleCopy.getY());
        Assertions.assertEquals(circle.getColor(), circleCopy.getColor());
        Assertions.assertEquals(circle.getRadius(), circleCopy.getRadius());
    }
}
