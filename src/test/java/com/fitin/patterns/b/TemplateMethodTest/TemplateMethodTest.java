package com.fitin.patterns.b.TemplateMethodTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemplateMethodTest {
    @Test
    void test() {
        BuildHouse house1 = new ModelFirst();
        BuildHouse house2 = new ModelSecond();
        BuildHouse house3 = new ModelThird();

        assertEquals("Floor type #1. Windows type #1. Two rooms. Roof type #1.", house1.build());
        assertEquals("Floor type #2. Windows type #2. Two rooms. Roof type #2.", house2.build());
        assertEquals("Floor type #3. Windows type #3. One hundred rooms. Roof type #3", house3.build());
    }
}
