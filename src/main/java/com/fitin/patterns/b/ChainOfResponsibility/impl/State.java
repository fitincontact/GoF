package com.fitin.patterns.b.ChainOfResponsibility.impl;

public class State {
    private final Double value;
    private String status = "";

    public State(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String error) {
        this.status = error;
    }
}
