package com.fitin.patterns.s.Composite.v1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositeTest {
    @Test
    void test() {
        var mobile1 = new Item(55.10, 5);
        var powerSupply1 = new Item(5, 1);
        var mobile2 = new Item(100, 10);
        var powerSupply2 = new Item(15, 1);
        var headPhone = new Item(20, 2);

        var book1 = new Item(10.1, 5);
        var book2 = new Item(20.22, 6);
        var book3 = new Item(100.9, 7);
        var book4 = new Item(15.3, 8);

        var cup1 = new Item(1.1, 1);
        var cup2 = new Item(2.2, 2);
        var cup3 = new Item(3.3, 3);
        var cup4 = new Item(4.4, 4);
        //1
        //11                      12
        //111(m1+p1) 112(m2+p2)   121(b1+b2+b3+b4) 122(c1+c2+c3+c4)
        //           1121(h)
        var box1 = new Box(2.50, 100, 3);

        var box11 = new Box(1.20, 30, 2);
        var box111 = new Box(1.20, 10, 1);
        var box112 = new Box(1.20, 15, 1);
        var box1121 = new Box(1.20, 3, 0.5);

        var box12 = new Box(1.20, 40, 4);
        var box121 = new Box(1.20, 26, 3);
        var box122 = new Box(1.20, 10, 2);

        box111.add(mobile1);
        box111.add(powerSupply1);

        box1121.add(headPhone);
        box112.add(mobile2);
        box112.add(powerSupply2);
        box112.add(box1121);

        box11.add(box111);
        box11.add(box112);

        box121.add(book1);
        box121.add(book2);
        box121.add(book3);
        box121.add(book4);

        box122.add(cup1);
        box122.add(cup2);
        box122.add(cup3);
        box122.add(cup4);

        box12.add(box121);
        box12.add(box122);

        box1.add(box11);
        box1.add(box12);

        assertEquals(box1.getPrice(), 363.52);
        assertEquals(box1.getWeight(), 71.5);
    }
}
