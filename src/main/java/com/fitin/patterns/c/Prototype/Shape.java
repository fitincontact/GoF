package com.fitin.patterns.c.Prototype;

public abstract class Shape {
    private final int x;
    private final int y;
    private final Color color;

    public abstract Shape clone();

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }
}
