package com.fitin.patterns.b.TemplateMethodTest;

public abstract class BuildHouse {
    public String build() {
        var floor = buildFloor();
        var windows = buildWindows();
        var rooms = buildRooms();
        var roof = buildRoof();

        return floor + " " + windows + " " + rooms + " " + roof;
    }

    abstract String buildRoof();

    public String buildRooms() {
        return "Two rooms.";
    }

    abstract String buildWindows();

    abstract String buildFloor();
}
