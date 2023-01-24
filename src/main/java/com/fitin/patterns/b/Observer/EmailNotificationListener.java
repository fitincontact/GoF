package com.fitin.patterns.b.Observer;

import java.io.File;

public class EmailNotificationListener implements EventListener {
    private final String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public String update(EventType eventType, File file) {
        return "Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName();
    }
}
