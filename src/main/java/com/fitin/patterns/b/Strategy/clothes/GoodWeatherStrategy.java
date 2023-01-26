package com.fitin.patterns.b.Strategy.clothes;

import com.fitin.patterns.b.Strategy.Strategy;

public class GoodWeatherStrategy implements Strategy {
    @Override
    public String calculate() {
        return "Put on a shirt.";
    }
}
