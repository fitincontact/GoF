package com.fitin.patterns.b.Memento;

import java.util.HashMap;
import java.util.Map;

public class StringAddingMemento implements Memento<String> {
    private final StringAdding stringAdding;
    private final Map<String, String> store = new HashMap<>();

    public StringAddingMemento(StringAdding stringAdding) {
        this.stringAdding = stringAdding;
    }

    @Override
    public void save(String key) {
        store.put(key, stringAdding.getRow());
    }

    @Override
    public void restore(String key) {
        stringAdding.resetRow(store.get(key));
    }
}
