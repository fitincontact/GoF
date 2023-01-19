package com.fitin.patterns.b.Iterator;

public interface Iterator<ITEM> {
    boolean hasNext();

    ITEM getNext();

    void add(ITEM item);
}
