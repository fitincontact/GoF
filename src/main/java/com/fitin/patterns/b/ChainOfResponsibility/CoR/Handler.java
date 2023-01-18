package com.fitin.patterns.b.ChainOfResponsibility.CoR;

public interface Handler<STATE> {
    STATE run(STATE state);
}
