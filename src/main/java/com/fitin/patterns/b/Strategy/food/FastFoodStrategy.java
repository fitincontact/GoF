package com.fitin.patterns.b.Strategy.food;

import com.fitin.patterns.b.Strategy.Strategy;

public class FastFoodStrategy implements Strategy {
    @Override
    public String calculate() {
        return "Take a coffee.";
    }
}
