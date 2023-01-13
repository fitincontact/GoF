package com.fitin.patterns.s.Adapter;

public class PoundWeight implements Weight {
    private final double weight;

    public PoundWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
