package com.fitin.patterns.c.Prototype;

public class Rectangle extends Shape {
    private final int width;
    private final int height;

    public Rectangle(int x, int y, Color color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this.getX(), this.getY(), this.getColor(), this.width, this.height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
