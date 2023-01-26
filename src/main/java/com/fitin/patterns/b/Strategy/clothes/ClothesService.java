package com.fitin.patterns.b.Strategy.clothes;

import com.fitin.patterns.b.Strategy.Strategy;

import java.util.Set;

public class ClothesService {
    private final GoodWeatherStrategy goodWeatherStrategy = new GoodWeatherStrategy();
    private final BadWeatherStrategy badWeatherStrategy = new BadWeatherStrategy();

    private boolean isGoodWeather() {
        return Math.random() < 0.5;
    }

    public Set<Strategy> getStrategies() {
        if (isGoodWeather()) {
            return Set.of(goodWeatherStrategy);
        } else {
            return Set.of(badWeatherStrategy);
        }
    }
}
