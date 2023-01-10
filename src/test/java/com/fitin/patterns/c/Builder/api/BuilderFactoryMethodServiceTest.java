package com.fitin.patterns.c.Builder.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderFactoryMethodServiceTest {
    BuilderService service = new BuilderService();

    @Test
    void cabbageCornDirector() {
        var result1 = service.aplly(new CabbageCornDirector(123, 1));

        assertEquals(result1.getArable().toString(), "Arable{cabbageCount=123, cornCount=1, celeryCount=0, parsleyCount=0, scarecrow=0}");
        assertEquals(result1.getPrice().toString(), "Price{cabbagePrice=1243.53, cornPrice=20.22, celeryPrice=0.0, parsleyPrice=0.0, scarecrowPrice=0.0, SUM=1263.75}");

        var result2 = service.aplly(new CabbageCornDirector(3, 3));

        assertEquals(result2.getArable().toString(), "Arable{cabbageCount=3, cornCount=3, celeryCount=0, parsleyCount=0, scarecrow=0}");
        assertEquals(result2.getPrice().toString(), "Price{cabbagePrice=30.33, cornPrice=60.66, celeryPrice=0.0, parsleyPrice=0.0, scarecrowPrice=0.0, SUM=90.99}");
    }

    @Test
    void celeryParsleyScarecrowDirector() {
        var result = service.aplly(new CeleryParsleyScarecrowDirector());

        assertEquals(result.getArable().toString(), "Arable{cabbageCount=0, cornCount=0, celeryCount=12, parsleyCount=122, scarecrow=1}");
        assertEquals(result.getPrice().toString(), "Price{cabbagePrice=0.0, cornPrice=0.0, celeryPrice=363.96, parsleyPrice=4933.679999999999, scarecrowPrice=1000.99, SUM=6298.629999999999}");
    }
}
