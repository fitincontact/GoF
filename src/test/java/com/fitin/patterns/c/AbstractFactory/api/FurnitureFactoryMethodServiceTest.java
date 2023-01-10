package com.fitin.patterns.c.AbstractFactory.api;

import com.fitin.patterns.c.AbstractFactory.models.chair.ModernChair;
import com.fitin.patterns.c.AbstractFactory.models.chair.VictorianChair;
import com.fitin.patterns.c.AbstractFactory.models.sofa.ModernSofa;
import com.fitin.patterns.c.AbstractFactory.models.sofa.VictorianSofa;
import com.fitin.patterns.c.AbstractFactory.models.table.ModernTable;
import com.fitin.patterns.c.AbstractFactory.models.table.VictorianTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FurnitureFactoryMethodServiceTest {
    final FurnitureService service = new FurnitureService();

    @Test
    void createModern() {
        var set = service.createFurnitureSet(ClientRequest.MODERN);
        Assertions.assertSame(set.getChair().getClass(), ModernChair.class);
        Assertions.assertSame(set.getSofa().getClass(), ModernSofa.class);
        Assertions.assertSame(set.getTable().getClass(), ModernTable.class);
    }

    @Test
    void createVictorian() {
        var set = service.createFurnitureSet(ClientRequest.VICTORIAN);
        Assertions.assertSame(set.getChair().getClass(), VictorianChair.class);
        Assertions.assertSame(set.getSofa().getClass(), VictorianSofa.class);
        Assertions.assertSame(set.getTable().getClass(), VictorianTable.class);
    }
}
