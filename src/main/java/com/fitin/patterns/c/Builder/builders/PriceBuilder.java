package com.fitin.patterns.c.Builder.builders;

import com.fitin.patterns.c.Builder.models.Price;

public class PriceBuilder implements Builder {
    private Price price;

    @Override
    public void create() {
        price = new Price();
    }

    @Override
    public void setCabbages(int count) {
        price.setCabbagePrice(count * 10.11);
    }

    @Override
    public void setCorns(int count) {
        price.setCornPrice(count * 20.22);
    }

    @Override
    public void setCeleries(int count) {
        price.setCeleryPrice(count * 30.33);
    }

    @Override
    public void setParsleys(int count) {
        price.setParsleyPrice(count * 40.44);
    }

    @Override
    public void isScarecrow(boolean is) {
        if (is) {
            price.setScarecrowPrice(1000.99);
        }
    }

    public Price getResult() {
        return price;
    }
}
