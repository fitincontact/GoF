package com.fitin.patterns.c.Builder.api;

import com.fitin.patterns.c.Builder.builders.Builder;

public interface Director {
    void apply(Builder builder);
}
