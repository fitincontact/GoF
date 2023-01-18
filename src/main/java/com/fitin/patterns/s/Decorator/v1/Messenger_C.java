package com.fitin.patterns.s.Decorator.v1;

public class Messenger_C extends MessengerProcessor {
    public Messenger_C(Messenger source) {
        super(source);
    }

    @Override
    public String send(String data) {
        return super.send(process(data));
    }

    private String process(String data) {
        return "Messenger_C: " + data;
    }
}
