package com.fitin.patterns.c.AbstractFactory.factory;

import com.fitin.patterns.c.AbstractFactory.models.chair.VictorianChair;
import com.fitin.patterns.c.AbstractFactory.models.sofa.ISofa;
import com.fitin.patterns.c.AbstractFactory.models.sofa.VictorianSofa;
import com.fitin.patterns.c.AbstractFactory.models.table.ITable;
import com.fitin.patterns.c.AbstractFactory.models.table.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {
    public VictorianChair createChair() {
        return new VictorianChair();
    }

    @Override
    public ITable createTable() {
        return new VictorianTable();
    }

    @Override
    public ISofa createSofa() {
        return new VictorianSofa();
    }
}
