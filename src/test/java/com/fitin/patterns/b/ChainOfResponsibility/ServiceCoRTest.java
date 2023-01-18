package com.fitin.patterns.b.ChainOfResponsibility;

import com.fitin.patterns.b.ChainOfResponsibility.impl.ServiceCoR;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceCoRTest {
    @Test
    void test() {
        var service = new ServiceCoR();

        var status = service.process(11.1);

        assertEquals(status, "11.1 ValidatorHandler;  ProcessorHandler;  RespondentHandler; ");
    }
}
