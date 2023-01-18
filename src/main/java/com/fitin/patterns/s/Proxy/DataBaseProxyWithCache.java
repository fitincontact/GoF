package com.fitin.patterns.s.Proxy;

import java.util.HashMap;
import java.util.Map;

public class DataBaseProxyWithCache {
    private final Map<RatePair, Double> rates = new HashMap<>();
    private final DataBase dataBase = new DataBase();

    public String getRate(RatePair rate) {
        var answer = rates.get(rate);
        if (answer == null) {
            answer = dataBase.getRate(rate);
            rates.put(rate, answer);
            return answer + " - form DB";
        }
        return answer + " - form cache";
    }
}
