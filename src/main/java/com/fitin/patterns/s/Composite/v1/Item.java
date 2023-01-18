package com.fitin.patterns.s.Composite.v1;

public class Item implements Content {
    private final double price;
    private final double weight;

    public Item(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
