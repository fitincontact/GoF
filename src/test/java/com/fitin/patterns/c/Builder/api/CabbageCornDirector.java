package com.fitin.patterns.c.Builder.api;

import com.fitin.patterns.c.Builder.builders.Builder;

/**
 * With constructor for default set
 */
public class CabbageCornDirector implements Director {
    private final int cabbageCount;
    private final int cornCount;

    public CabbageCornDirector(int cabbageCount, int cornCount) {
        this.cabbageCount = cabbageCount;
        this.cornCount = cornCount;
    }

    @Override
    public void apply(Builder builder) {
        builder.create();
        builder.setCabbages(cabbageCount);
        builder.setCorns(cornCount);
    }
}
