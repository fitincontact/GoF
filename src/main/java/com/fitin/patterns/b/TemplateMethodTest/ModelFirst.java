package com.fitin.patterns.b.TemplateMethodTest;

public class ModelFirst extends BuildHouse {
    @Override
    String buildRoof() {
        return "Roof type #1.";
    }

    @Override
    String buildWindows() {
        return "Windows type #1.";
    }

    @Override
    String buildFloor() {
        return "Floor type #1.";
    }
}
