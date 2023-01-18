package com.fitin.patterns.b.ChainOfResponsibility.impl;

import com.fitin.patterns.b.ChainOfResponsibility.CoR.CoR;
import com.fitin.patterns.b.ChainOfResponsibility.impl.handlers.ProcessorHandler;
import com.fitin.patterns.b.ChainOfResponsibility.impl.handlers.RespondentHandler;
import com.fitin.patterns.b.ChainOfResponsibility.impl.handlers.ValidatorHandler;

public class ServiceCoR {
    private final ValidatorHandler validator = new ValidatorHandler();
    private final ProcessorHandler processor = new ProcessorHandler();
    private final RespondentHandler respondent = new RespondentHandler();

    public String process(Double value) {
        var cor = new CoR<>(new State(value));

        var answer = cor
                .run(validator)
                .run(processor)
                .run(respondent)
                .getState();

        return answer.getStatus();
    }
}
