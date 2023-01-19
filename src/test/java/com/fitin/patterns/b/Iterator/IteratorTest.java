package com.fitin.patterns.b.Iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IteratorTest {
    @Test
    void test() {
        var user1 = new User("qq@qq.qq");
        var user2 = new User("aa@aa.aa");
        var user3 = new User("ee@ee.ee");
        var user4 = new User("ss@ss.ss");
        var user5 = new User("dd@dd.dd");

        var users = new Users();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        StringBuilder result = new StringBuilder();
        while (users.hasNext()) {
            result.append(users.getNext().email()).append("; ");
        }

        assertEquals("qq@qq.qq; aa@aa.aa; ee@ee.ee; ss@ss.ss; dd@dd.dd; ", result.toString());
    }
}
