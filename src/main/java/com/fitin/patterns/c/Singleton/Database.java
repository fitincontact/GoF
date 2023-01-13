package com.fitin.patterns.c.Singleton;

public class Database {
    private static String config;
    private static Database instance;

    private Database() {
    }

    public static void setDatabase(String config) {
        if (instance == null) {
            instance = new Database();
            Database.config = config;
        }
    }

    public static Database getDatabase() {
        return instance;
    }

    public static String getConfig() {
        return config;
    }
}
