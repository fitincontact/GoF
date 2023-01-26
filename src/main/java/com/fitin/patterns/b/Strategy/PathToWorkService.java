package com.fitin.patterns.b.Strategy;

import com.fitin.patterns.b.Strategy.clothes.ClothesService;
import com.fitin.patterns.b.Strategy.food.FoodService;
import com.fitin.patterns.b.Strategy.transport.TransportService;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PathToWorkService {
    private final Set<Strategy> strategies = new HashSet<>();

    /**
     * Service calculate details your way from a home to a job
     *
     * @param length length between your home and your job (kilometers)
     * @param money  how money do you want on this way? (euro)
     * @param time   how much time are you willing to spend on it? (minutes)
     * @return best way to get to work
     */
    public String calculate(int length, Integer money, Integer time) {
        strategies.clear();

        strategies.addAll(new ClothesService().getStrategies());
        strategies.addAll(new TransportService(length, money, time).getStrategies());
        strategies.addAll(new FoodService(money, time).getStrategies());

        return exec(strategies);
    }

    private String exec(Set<Strategy> strategies) {
        return strategies
                .stream()
                .map(Strategy::calculate)
                .collect(Collectors.joining(" "));
    }
}
