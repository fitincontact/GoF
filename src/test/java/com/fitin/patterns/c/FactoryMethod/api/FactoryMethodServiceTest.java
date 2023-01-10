package com.fitin.patterns.c.FactoryMethod.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactoryMethodServiceTest {
    FactoryMethodService service = new FactoryMethodService();

    @Test
    void win() {
        var dialog = service.initialize(ClientRequest.WIN);
        var button = dialog.render();
        Assertions.assertEquals(button.getNameButton(), "WindowsButton");
    }

    @Test
    void web() {
        var dialog = service.initialize(ClientRequest.WEB);
        var button = dialog.render();
        Assertions.assertEquals(button.getNameButton(), "HTMLButton");
    }
}
