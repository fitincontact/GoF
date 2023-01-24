package com.fitin.patterns.b.Observer;

import java.io.File;

import static com.fitin.patterns.b.Observer.EventType.OPEN;
import static com.fitin.patterns.b.Observer.EventType.SAVE;

public class Editor {
    private final EventManager events;
    private File file;

    public Editor(EventManager events) {
        this.events = events;
    }

    public String openFile(String filePath) {
        this.file = new File(filePath);
        return events.notify(OPEN, file);
    }

    public String saveFile() throws Exception {
        if (this.file != null) {
            return events.notify(SAVE, file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}
