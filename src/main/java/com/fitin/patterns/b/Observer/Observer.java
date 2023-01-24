package com.fitin.patterns.b.Observer;

public interface Observer<OBJ> {
    void subscribe(EventType eventType, EventListener listener);

    void unsubscribe(EventType eventType, EventListener listener);

    String notify(EventType eventType, OBJ obj);
}
