package com.fitin.patterns.s.Decorator.v1;

public class Messenger_B extends MessengerProcessor {

    public Messenger_B(Messenger source) {
        super(source);
    }

    @Override
    public String send(String data) {
        return super.send(process(data));
    }

    private String process(String data) {
        return "Messenger_B: " + data;
    }
}
