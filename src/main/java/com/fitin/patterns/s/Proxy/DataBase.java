package com.fitin.patterns.s.Proxy;

public class DataBase {
    public double getRate(RatePair rate) {
        return switch (rate) {
            case USD_EUR -> 0.94;
            case USD_AMD -> 395.76;
        };
    }
}
