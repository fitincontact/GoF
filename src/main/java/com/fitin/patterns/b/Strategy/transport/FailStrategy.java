package com.fitin.patterns.b.Strategy.transport;

import com.fitin.patterns.b.Strategy.Strategy;

public class FailStrategy implements Strategy {
    @Override
    public String calculate() {
        return "Your job is so far or any thing. Maybe go to a Park?";
    }
}
