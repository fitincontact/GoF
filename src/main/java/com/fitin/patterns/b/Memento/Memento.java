package com.fitin.patterns.b.Memento;

public interface Memento<KEY> {
    void save(KEY key);

    void restore(KEY key);
}
