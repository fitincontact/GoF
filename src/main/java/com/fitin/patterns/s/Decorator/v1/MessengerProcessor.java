package com.fitin.patterns.s.Decorator.v1;

public class MessengerProcessor implements Messenger {
    private final Messenger messenger;

    MessengerProcessor(Messenger source) {
        this.messenger = source;
    }

    @Override
    public String send(String data) {
        return messenger.send(data);
    }
}
