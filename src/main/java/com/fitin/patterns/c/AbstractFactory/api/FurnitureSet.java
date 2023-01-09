package com.fitin.patterns.c.AbstractFactory.api;

import com.fitin.patterns.c.AbstractFactory.models.chair.IChair;
import com.fitin.patterns.c.AbstractFactory.models.sofa.ISofa;
import com.fitin.patterns.c.AbstractFactory.models.table.ITable;

public class FurnitureSet {
    private final IChair chair;
    private final ISofa sofa;
    private final ITable table;

    public FurnitureSet(
            IChair chair,
            ISofa sofa,
            ITable table
    ) {
        this.chair = chair;
        this.sofa = sofa;
        this.table = table;
    }

    public IChair getChair() {
        return chair;
    }

    public ISofa getSofa() {
        return sofa;
    }

    public ITable getTable() {
        return table;
    }
}
