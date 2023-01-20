package com.fitin.patterns.b.Intermediary;

class Consumer implements Runnable {
    private static int count = 1;
    // 3. Consumers are coupled only to the Mediator
    private final Mediator mediator;
    private final int id;

    public Consumer(Mediator mediator) {
        this.mediator = mediator;
        count = count + 1;
        id = count;
    }

    @Override
    public void run() {
        while (true) {
            System.out.print("c" + id + " get message: " + mediator.retrieveMessage() + "; ");
        }
    }
}
