package com.fitin.patterns.b.ChainOfResponsibility.impl.handlers;

import com.fitin.patterns.b.ChainOfResponsibility.CoR.Handler;
import com.fitin.patterns.b.ChainOfResponsibility.impl.State;

public class ValidatorHandler implements Handler<State> {
    @Override
    public State run(State state) {
        var str = state.getStatus();
        state.setStatus(str + state.getValue() + " ValidatorHandler; ");
        return state;
    }
}
