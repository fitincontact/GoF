package com.fitin.patterns.s.Decorator.v1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessengerTest {
    @Test
    void messageACB() {
        var message = "Hello World!";

        var multiMessenger = new Messenger_A(
                new Messenger_C(
                        new Messenger_B(
                                new MessengerDefault()
                        )
                )
        );
        var status = multiMessenger.send(message);

        assertEquals("MessengerDefault: Messenger_B: Messenger_C: Messenger_A: Hello World!", status);
    }

    @Test
    void messageCA() {
        var message = "Hello World!";

        var multiMessenger = new Messenger_C(
                new Messenger_A(
                        new MessengerDefault()
                )
        );
        var status = multiMessenger.send(message);

        assertEquals("MessengerDefault: Messenger_A: Messenger_C: Hello World!", status);
    }
}
