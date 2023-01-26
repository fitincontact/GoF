package com.fitin.patterns.b.TemplateMethodTest;

public class ModelThird extends BuildHouse {
    @Override
    public String buildRooms() {
        return "One hundred rooms.";
    }

    @Override
    String buildRoof() {
        return "Roof type #3.";
    }

    @Override
    String buildWindows() {
        return "Windows type #3.";
    }

    @Override
    String buildFloor() {
        return "Floor type #3.";
    }
}
