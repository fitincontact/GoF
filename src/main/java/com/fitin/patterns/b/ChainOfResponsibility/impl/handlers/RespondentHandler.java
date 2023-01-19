package com.fitin.patterns.b.ChainOfResponsibility.impl.handlers;

import com.fitin.patterns.b.ChainOfResponsibility.CoR.Handler;
import com.fitin.patterns.b.ChainOfResponsibility.impl.State;

public class RespondentHandler implements Handler<State> {
    @Override
    public void run(State state) {
        var str = state.getStatus();
        state.setStatus(str + " RespondentHandler; ");
    }
}
