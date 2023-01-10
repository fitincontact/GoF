package com.fitin.patterns.c.Builder.models.arable;

import com.fitin.patterns.c.Builder.builders.BuilderObject;

import java.util.ArrayList;
import java.util.List;

public class Arable implements BuilderObject {
    private List<Cabbage> cabbages = new ArrayList<>();
    private List<Corn> corns = new ArrayList<>();
    private List<Celery> celeries = new ArrayList<>();
    private List<Parsley> parsleys = new ArrayList<>();

    private Scarecrow scarecrow = null;

    public void setCabbages(List<Cabbage> cabbages) {
        this.cabbages = cabbages;
    }

    public void setCorns(List<Corn> corns) {
        this.corns = corns;
    }

    public void setCeleries(List<Celery> celeries) {
        this.celeries = celeries;
    }

    public void setParsleys(List<Parsley> parsleys) {
        this.parsleys = parsleys;
    }

    public void setScarecrow(Scarecrow scarecrow) {
        this.scarecrow = scarecrow;
    }

    private String scarecrowString() {
        return scarecrow == null ? "0" : "1";
    }

    @Override
    public String toString() {
        return "Arable{"
                + "cabbageCount=" + cabbages.size()
                + ", cornCount=" + corns.size()
                + ", celeryCount=" + celeries.size()
                + ", parsleyCount=" + parsleys.size()
                + ", scarecrow=" + scarecrowString() + '}';
    }
}
