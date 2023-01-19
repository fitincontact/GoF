package com.fitin.patterns.b.Interpreter;

public class MultipleAddition implements MultipleAct {
    private float result = 0;

    public MultipleAddition(float... numbers) {
        float result = 0;
        for (var f : numbers) {
            result = result + f;
        }
        this.result = result;
    }

    public MultipleAddition(MultipleAct... acts) {
        float result = 0;
        for (var a : acts) {
            result = result + a.getResult();
        }
        this.result = result;
    }

    @Override
    public float getResult() {
        return result;
    }
}
