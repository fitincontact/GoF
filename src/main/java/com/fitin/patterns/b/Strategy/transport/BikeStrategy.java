package com.fitin.patterns.b.Strategy.transport;

import com.fitin.patterns.b.Strategy.Strategy;

public class BikeStrategy implements Strategy {
    @Override
    public String calculate() {
        return "Go to job by bike!";
    }
}
