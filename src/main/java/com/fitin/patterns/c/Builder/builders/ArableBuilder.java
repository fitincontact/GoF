package com.fitin.patterns.c.Builder.builders;

import com.fitin.patterns.c.Builder.models.arable.Scarecrow;
import com.fitin.patterns.c.Builder.models.arable.*;

import java.util.ArrayList;

public class ArableBuilder implements Builder {
    private Arable arable;

    @Override
    public void create() {
        arable = new Arable();
    }

    @Override
    public void setCabbages(int count) {
        var list = new ArrayList<Cabbage>();
        for (int i = 0; i < count; i++) {
            list.add(new Cabbage());
        }
        arable.setCabbages(list);
    }

    @Override
    public void setCorns(int count) {
        var list = new ArrayList<Corn>();
        for (int i = 0; i < count; i++) {
            list.add(new Corn());
        }
        arable.setCorns(list);
    }

    @Override
    public void setCeleries(int count) {
        var list = new ArrayList<Celery>();
        for (int i = 0; i < count; i++) {
            list.add(new Celery());
        }
        arable.setCeleries(list);
    }

    @Override
    public void setParsleys(int count) {
        var list = new ArrayList<Parsley>();
        for (int i = 0; i < count; i++) {
            list.add(new Parsley());
        }
        arable.setParsleys(list);
    }

    @Override
    public void isScarecrow(boolean is) {
        if (is) {
            arable.setScarecrow(new Scarecrow());
        } else {
            arable.setScarecrow(null);
        }
    }

    public Arable getResult() {
        return arable;
    }
}
