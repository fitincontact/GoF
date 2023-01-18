package com.fitin.patterns.s.Composite.v1;

import java.util.ArrayList;
import java.util.List;

public class Box implements Content, Pack {
    private final double price;
    private final double volume;
    private final double weight;
    private final List<Content> contents = new ArrayList<>();

    public Box(double price, double volume, double weight) {
        this.price = price;
        this.volume = volume;
        this.weight = weight;
    }

    public void add(Content content) {
        double weight = getWeight();
        if (volume - weight >= 0) {
            contents.add(content);
        } else {
            throw new RuntimeException("content is too big!");
        }
    }

    @Override
    public double getPrice() {
        return contents.stream().mapToDouble(Content::getPrice).sum() + this.price;
    }

    @Override
    public double getWeight() {
        return contents.stream().mapToDouble(Content::getWeight).sum() + this.weight;
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
