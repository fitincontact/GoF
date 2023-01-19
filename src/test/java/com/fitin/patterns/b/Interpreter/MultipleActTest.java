package com.fitin.patterns.b.Interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipleActTest {
    @Test
    void test() {
        var ma = new MultipleAddition(5, 3, 1);
        var ms = new MultipleSubtraction(100, 200, 300);
        var result = new MultipleAddition(ma, ms);

        assertEquals(-591.0, result.getResult());
        assertEquals(0, new MultipleAddition(new MultipleAddition(500, 90, 1), result).getResult());
        assertEquals(-6000.0, new MultipleAddition(ms, ms, ms, ms, ms, ms, ms, ms, ms, ms).getResult());
    }
}
