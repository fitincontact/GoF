package com.fitin.patterns.s.Decorator.v1;

public class MessengerDefault implements Messenger {
    public MessengerDefault() {
    }

    @Override
    public String send(String data) {
        return "MessengerDefault: " + data;
    }
}
