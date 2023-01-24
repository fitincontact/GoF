package com.fitin.patterns.b.Observer;

import java.io.File;

public class LogOpenListener implements EventListener {
    private final File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public String update(EventType eventType, File file) {
        return "Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName();
    }
}
