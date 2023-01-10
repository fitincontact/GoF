package com.fitin.patterns.c.Builder.builders;

public interface Builder {
    void create();

    void setCabbages(int count);

    void setCorns(int count);

    void setCeleries(int count);

    void setParsleys(int count);

    void isScarecrow(boolean is);
}
