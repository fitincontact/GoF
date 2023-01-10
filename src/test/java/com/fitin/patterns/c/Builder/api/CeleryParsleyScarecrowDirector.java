package com.fitin.patterns.c.Builder.api;

import com.fitin.patterns.c.Builder.builders.Builder;

/**
 * with default values
 */
public class CeleryParsleyScarecrowDirector implements Director {
    @Override
    public void apply(Builder builder) {
        builder.create();
        builder.setCeleries(12);
        builder.setParsleys(122);
        builder.isScarecrow(true);
    }
}
