package com.fitin.patterns.c.Singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {
    @Test
    void singleton() {
        var dbNotSet = Database.getDatabase();
        assertNull(dbNotSet);
        assertNull(Database.getConfig());

        Database.setDatabase("config123");
        var db1 = Database.getDatabase();
        assertNotNull(db1);

        var db2 = Database.getDatabase();
        assertEquals(db1, db2);
        assertEquals(db1.getConfig(), "config123");
        assertEquals(db1.getConfig(), db2.getConfig());
    }
}
