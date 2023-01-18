package com.fitin.patterns.b.ChainOfResponsibility.CoR;

public class CoR<STATE> {
    private final STATE state;

    public CoR(STATE state) {
        this.state = state;
    }

    public CoR<STATE> run(Handler<STATE> handler) {
        handler.run(state);
        return this;
    }

    public STATE getState() {
        return state;
    }
}
