package com.fitin.patterns.b.Strategy.food;

import com.fitin.patterns.b.Strategy.Strategy;

import java.util.Set;

public class FoodService {
    private final FastFoodStrategy fastFoodStrategy = new FastFoodStrategy();
    private final Integer money;
    private final Integer time;

    public FoodService(Integer money, Integer time) {
        this.money = money;
        this.time = time;
    }

    public Set<Strategy> getStrategies() {
        if (money >= 4 && time >= 5) {
            return Set.of(fastFoodStrategy);
        }
        return Set.of();
    }
}
