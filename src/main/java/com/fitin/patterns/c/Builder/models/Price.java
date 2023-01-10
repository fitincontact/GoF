package com.fitin.patterns.c.Builder.models;

import com.fitin.patterns.c.Builder.builders.BuilderObject;

public class Price implements BuilderObject {
    private double cabbagePrice;
    private double cornPrice;
    private double celeryPrice;
    private double parsleyPrice;
    private double scarecrowPrice;

    public void setCabbagePrice(double cabbagePrice) {
        this.cabbagePrice = cabbagePrice;
    }

    public void setCornPrice(double cornPrice) {
        this.cornPrice = cornPrice;
    }

    public void setCeleryPrice(double celeryPrice) {
        this.celeryPrice = celeryPrice;
    }

    public void setParsleyPrice(double parsleyPrice) {
        this.parsleyPrice = parsleyPrice;
    }

    public void setScarecrowPrice(double scarecrowPrice) {
        this.scarecrowPrice = scarecrowPrice;
    }

    public double sum() {
        return cabbagePrice + cornPrice + celeryPrice + parsleyPrice + scarecrowPrice;
    }

    @Override
    public String toString() {
        return "Price{" + "cabbagePrice=" + cabbagePrice + ", cornPrice=" + cornPrice + ", celeryPrice=" + celeryPrice + ", parsleyPrice=" + parsleyPrice + ", scarecrowPrice=" + scarecrowPrice + ", SUM=" + sum() + '}';
    }
}
