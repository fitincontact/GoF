package com.fitin.patterns.b.Intermediary;

import java.util.ArrayList;
import java.util.Scanner;

public class IntermediaryTest {

    public static void main(String[] args) {
        var producerAndCustomerList = new ArrayList<Thread>();

        var mediator = new Mediator();

        producerAndCustomerList.add(new Thread(new Producer(mediator)));
        producerAndCustomerList.add(new Thread(new Producer(mediator)));

        producerAndCustomerList.add(new Thread(new Consumer(mediator)));
        producerAndCustomerList.add(new Thread(new Consumer(mediator)));
        producerAndCustomerList.add(new Thread(new Consumer(mediator)));
        producerAndCustomerList.add(new Thread(new Consumer(mediator)));

        for (Thread thread : producerAndCustomerList) {
            thread.start();
        }
        boolean stop = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press ENTER for exit");
        var exit = "";//scanner.nextLine();

        while (!stop) {
            if (exit.equals("")) {
                stop = true;
                for (Thread thread : producerAndCustomerList) {
                    //noinspection deprecation
                    thread.stop();
                }
            }
        }
    }
}
