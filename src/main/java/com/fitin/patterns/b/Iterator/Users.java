package com.fitin.patterns.b.Iterator;

public class Users implements Iterator<User> {
    private int size = 0;
    private int currentIndex = 0;
    private User[] users = new User[0];

    @Override
    public boolean hasNext() {
        return currentIndex < size;
    }

    @Override
    public User getNext() {
        currentIndex = currentIndex + 1;
        return users[currentIndex - 1];
    }

    public void add(User user) {
        size = size + 1;
        var newUsers = new User[size];

        if (size > 1) {
            for (int i = 0; i < size - 1; i++) {
                newUsers[i] = users[i];
            }
        }

        newUsers[size - 1] = user;
        users = newUsers;
    }
}
