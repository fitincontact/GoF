package com.fitin.patterns.c.AbstractFactory.factory;

import com.fitin.patterns.c.AbstractFactory.models.chair.ModernChair;
import com.fitin.patterns.c.AbstractFactory.models.sofa.ModernSofa;
import com.fitin.patterns.c.AbstractFactory.models.table.ModernTable;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public ModernChair createChair() {
        return new ModernChair();
    }

    @Override
    public ModernTable createTable() {
        return new ModernTable();
    }

    @Override
    public ModernSofa createSofa() {
        return new ModernSofa();
    }
}
