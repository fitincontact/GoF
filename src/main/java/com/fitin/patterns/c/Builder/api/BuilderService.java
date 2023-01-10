package com.fitin.patterns.c.Builder.api;

import com.fitin.patterns.c.Builder.builders.ArableBuilder;
import com.fitin.patterns.c.Builder.builders.PriceBuilder;

public class BuilderService {
    public ArableAndPrice aplly(Director director) {
        ArableBuilder arableBuilder = new ArableBuilder();
        director.apply(arableBuilder);
        var arable = arableBuilder.getResult();

        PriceBuilder priceBuilder = new PriceBuilder();
        director.apply(priceBuilder);
        var price = priceBuilder.getResult();

        return new ArableAndPrice(arable, price);
    }
}
