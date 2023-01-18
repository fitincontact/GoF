package com.fitin.patterns.s.Proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProxyTest {
    @Test
    void test() {
        var proxy = new DataBaseProxyWithCache();
        assertEquals(
                "395.76 - form DB",
                proxy.getRate(RatePair.USD_AMD)
        );
        assertEquals(
                "395.76 - form cache",
                proxy.getRate(RatePair.USD_AMD)
        );
        assertEquals(
                "395.76 - form cache",
                proxy.getRate(RatePair.USD_AMD)
        );

        assertEquals(
                "0.94 - form DB",
                proxy.getRate(RatePair.USD_EUR)
        );
        assertEquals(
                "0.94 - form cache",
                proxy.getRate(RatePair.USD_EUR)
        );

        assertEquals(
                "0.94 - form cache",
                proxy.getRate(RatePair.USD_EUR)
        );
    }
}
