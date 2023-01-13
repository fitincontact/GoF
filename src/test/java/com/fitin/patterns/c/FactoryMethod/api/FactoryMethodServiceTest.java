package com.fitin.patterns.c.FactoryMethod.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryMethodServiceTest {
    FactoryMethodService service = new FactoryMethodService();

    @Test
    void win() {
        var dialog = service.initialize(ClientRequest.WIN);
        var button = dialog.render();
        assertEquals(button.getNameButton(), "WindowsButton");
    }

    @Test
    void web() {
        var dialog = service.initialize(ClientRequest.WEB);
        var button = dialog.render();
        assertEquals(button.getNameButton(), "HTMLButton");
    }
}
