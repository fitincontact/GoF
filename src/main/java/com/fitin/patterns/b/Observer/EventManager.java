package com.fitin.patterns.b.Observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager implements Observer<File> {
    Map<EventType, List<EventListener>> listeners = new HashMap<>();

    public EventManager(EventType... operations) {
        for (EventType operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    @Override
    public void subscribe(EventType eventType, EventListener listener) {
        final var users = listeners.get(eventType);
        users.add(listener);
    }

    @Override
    public void unsubscribe(EventType eventType, EventListener listener) {
        final var users = listeners.get(eventType);
        users.remove(listener);
    }

    @Override
    public String notify(EventType eventType, File file) {
        final var users = listeners.get(eventType);
        final var result = new StringBuilder();
        for (EventListener listener : users) {
            result.append(listener.update(eventType, file));
        }
        return result.toString();
    }
}
