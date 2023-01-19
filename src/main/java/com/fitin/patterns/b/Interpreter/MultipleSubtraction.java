package com.fitin.patterns.b.Interpreter;

public class MultipleSubtraction implements MultipleAct {
    private float result = 0;

    public MultipleSubtraction(float... numbers) {
        float result = 0;
        for (var f : numbers) {
            result = result - f;
        }
        this.result = result;
    }

    public MultipleSubtraction(MultipleAct... acts) {
        float result = 0;
        for (var a : acts) {
            result = result - a.getResult();
        }
        this.result = result;
    }

    @Override
    public float getResult() {
        return result;
    }
}
