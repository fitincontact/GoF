package com.fitin.patterns.b.Strategy.transport;

import com.fitin.patterns.b.Strategy.Strategy;

public class BusStrategy implements Strategy {
    @Override
    public String calculate() {
        return "Take a bus!";
    }
}
