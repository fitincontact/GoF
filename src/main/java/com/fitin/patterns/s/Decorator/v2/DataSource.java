package com.fitin.patterns.s.Decorator.v2;

public interface DataSource {
    void writeData(String data);

    String readData();
}
