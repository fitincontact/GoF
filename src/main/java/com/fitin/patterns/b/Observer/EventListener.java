package com.fitin.patterns.b.Observer;

import java.io.File;

public interface EventListener {
    String update(EventType eventType, File file);
}
