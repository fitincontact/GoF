package com.fitin.patterns.s.Adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeightTest {

    @Test
    void convert() {
        var poundWeight = new PoundWeight(10);

        var kilogramWeight = new PoundToKilogramAdapter(poundWeight);

        assertEquals(kilogramWeight.getWeight(), 4.5);
    }
}
