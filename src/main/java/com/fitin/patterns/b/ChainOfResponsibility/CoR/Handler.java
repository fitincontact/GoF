package com.fitin.patterns.b.ChainOfResponsibility.CoR;

public interface Handler<STATE> {
    void run(STATE state);
}
