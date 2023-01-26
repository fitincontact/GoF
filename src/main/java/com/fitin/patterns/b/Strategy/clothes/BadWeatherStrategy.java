package com.fitin.patterns.b.Strategy.clothes;

import com.fitin.patterns.b.Strategy.Strategy;

public class BadWeatherStrategy implements Strategy {
    @Override
    public String calculate() {
        return "Put on a jacket, don't forgot about an umbrella!";
    }
}
