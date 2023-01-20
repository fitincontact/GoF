package com.fitin.patterns.b.Memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MementoTest {
    @Test
    void test() {
        var SAVING_SLOT_1 = "1";
        var STATE1 = "data1; data2; data3; ";

        var SAVING_SLOT_2 = "2";
        var STATE2 = "data1; data2; data3; data10; data11; data12; ";

        var str = new StringAdding();

        str.addRow("data1");
        str.addRow("data2");
        str.addRow("data3");
        assertEquals(STATE1, str.getRow());

        str.save(SAVING_SLOT_1);

        str.addRow("data10");
        str.addRow("data11");
        str.addRow("data12");
        assertEquals(STATE2, str.getRow());

        str.save(SAVING_SLOT_2);

        str.deleteRow();
        assertEquals("", str.getRow());

        str.restore(SAVING_SLOT_2);
        assertEquals(STATE2, str.getRow());

        str.restore(SAVING_SLOT_1);
        assertEquals(STATE1, str.getRow());
    }
}
