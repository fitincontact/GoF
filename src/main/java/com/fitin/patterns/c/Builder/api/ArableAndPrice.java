package com.fitin.patterns.c.Builder.api;

import com.fitin.patterns.c.Builder.models.Price;
import com.fitin.patterns.c.Builder.models.arable.Arable;

public class ArableAndPrice {
    private final Arable arable;
    private final Price price;

    public ArableAndPrice(Arable arable, Price price) {
        this.arable = arable;
        this.price = price;
    }

    public Arable getArable() {
        return arable;
    }

    public Price getPrice() {
        return price;
    }
}
