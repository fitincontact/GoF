package com.fitin.patterns.c.AbstractFactory.factory;

import com.fitin.patterns.c.AbstractFactory.models.chair.IChair;
import com.fitin.patterns.c.AbstractFactory.models.sofa.ISofa;
import com.fitin.patterns.c.AbstractFactory.models.table.ITable;

public interface FurnitureFactory {
    IChair createChair();

    ISofa createSofa();

    ITable createTable();
}
