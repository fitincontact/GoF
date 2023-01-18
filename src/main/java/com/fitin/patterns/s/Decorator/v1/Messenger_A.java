package com.fitin.patterns.s.Decorator.v1;

public class Messenger_A extends MessengerProcessor {
    public Messenger_A(Messenger source) {
        super(source);
    }

    @Override
    public String send(String data) {
        return super.send(process(data));
    }

    private String process(String stringData) {
        return "Messenger_A: " + stringData;
    }
}
