package com.fitin.patterns.s.Adapter;

public class PoundToKilogramAdapter implements WeightAdapter {
    private final Weight weight;

    public PoundToKilogramAdapter(Weight weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return convert();
    }

    private double convert() {
        return weight.getWeight() * 0.45;
    }
}
