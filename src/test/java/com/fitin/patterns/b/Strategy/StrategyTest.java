package com.fitin.patterns.b.Strategy;

import org.junit.jupiter.api.Test;

public class StrategyTest {

    static PathToWorkService service = new PathToWorkService();

    @Test
    void test() {
        var result = service.calculate(9, 1, 30);
        System.out.println(result);

        result = service.calculate(20, 1, 30);
        System.out.println(result);

        result = service.calculate(20, 10, 30);
        System.out.println(result);
    }
}
