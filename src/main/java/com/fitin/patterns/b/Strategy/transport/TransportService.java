package com.fitin.patterns.b.Strategy.transport;

import com.fitin.patterns.b.Strategy.Strategy;

import java.util.Set;

public class TransportService {
    private final BikeStrategy bikeStrategy = new BikeStrategy();
    private final BusStrategy busStrategy = new BusStrategy();
    private final FailStrategy failStrategy = new FailStrategy();

    private final int length;
    private final Integer money;
    private final Integer time;

    public TransportService(int length, Integer money, Integer time) {
        this.length = length;
        this.money = money;
        this.time = time;
    }

    public Set<Strategy> getStrategies() {
        final Integer ticketPrice = 5;
        final Integer bikeTime = 20;
        final Integer busTime = 30;
        if (length <= 10 && time >= bikeTime) {
            return Set.of(bikeStrategy);
        } else if (length > 10 && time >= busTime && money >= ticketPrice) {
            return Set.of(busStrategy);
        } else {
            return Set.of(failStrategy);
        }
    }
}
