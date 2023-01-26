package com.fitin.patterns.b.TemplateMethodTest;

public class ModelSecond extends BuildHouse {
    @Override
    String buildRoof() {
        return "Roof type #2.";
    }

    @Override
    String buildWindows() {
        return "Windows type #2.";
    }

    @Override
    String buildFloor() {
        return "Floor type #2.";
    }
}
