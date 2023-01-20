package com.fitin.patterns.b.Intermediary;

class Producer implements Runnable {
    private static int count = 1;
    // 2. Producers are coupled only to the Mediator
    private final Mediator mediator;
    private final int id;

    public Producer(Mediator mediator) {
        this.mediator = mediator;
        count = count + 1;
        id = count;
    }

    @Override
    public void run() {
        while (true) {
            var message = (int) (Math.random() * 100);
            mediator.storeMessage(message);
            System.out.print("p" + id + " stores message:" + message + "; ");
        }
    }
}
