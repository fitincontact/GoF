package com.fitin.patterns.c.Prototype;

public class Circle extends Shape {
    private final int radius;

    public Circle(int x, int y, Color color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public Circle clone() {
        return new Circle(this.getX(), this.getY(), this.getColor(), this.radius);
    }

    public int getRadius() {
        return radius;
    }
}
