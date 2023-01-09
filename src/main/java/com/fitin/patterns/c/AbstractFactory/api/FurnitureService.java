package com.fitin.patterns.c.AbstractFactory.api;

import com.fitin.patterns.c.AbstractFactory.factory.FurnitureFactory;
import com.fitin.patterns.c.AbstractFactory.factory.ModernFurnitureFactory;
import com.fitin.patterns.c.AbstractFactory.factory.VictorianFurnitureFactory;

import java.util.HashMap;
import java.util.Map;

public class FurnitureService {
    private static final Map<ClientRequest, FurnitureFactory> factories = new HashMap<>();

    static {
        factories.put(ClientRequest.MODERN, new ModernFurnitureFactory());
        factories.put(ClientRequest.VICTORIAN, new VictorianFurnitureFactory());
    }

    public FurnitureSet createFurnitureSet(ClientRequest clientRequest) {
        var factory = factories.get(clientRequest);
        return new FurnitureSet(factory.createChair(), factory.createSofa(), factory.createTable());
    }
}
