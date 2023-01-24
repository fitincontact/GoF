package com.fitin.patterns.b.Observer;

import org.junit.jupiter.api.Test;

import static com.fitin.patterns.b.Observer.EventType.OPEN;
import static com.fitin.patterns.b.Observer.EventType.SAVE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverTest {
    EventManager eventManager = new EventManager(SAVE, OPEN);
    Editor editor = new Editor(eventManager);
    EventListener logOpenListener = new LogOpenListener("/path/to/log/file.txt");
    EventListener emailNotificationListenerAdmin = new EmailNotificationListener("admin@example.com");
    EventListener emailNotificationListenerUser = new EmailNotificationListener("user@example.com");

    @Test
    void test() {
        eventManager.subscribe(OPEN, logOpenListener);
        eventManager.subscribe(SAVE, emailNotificationListenerAdmin);

        var open = "";
        var save = "";

        try {
            open = editor.openFile("test.txt");
            save = editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals("Save to log /path/to/log/file.txt: Someone has performed OPEN operation with the following file: test.txt", open);
        assertEquals("Email to admin@example.com: Someone has performed SAVE operation with the following file: test.txt", save);

        eventManager.subscribe(SAVE, emailNotificationListenerUser);

        try {
            save = editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals("Email to admin@example.com: Someone has performed SAVE operation with the following file: test.txtEmail to user@example.com: Someone has performed SAVE operation with the following file: test.txt", save);

        eventManager.unsubscribe(SAVE, emailNotificationListenerAdmin);
        eventManager.unsubscribe(SAVE, emailNotificationListenerUser);

        try {
            save = editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals("", save);
    }
}
