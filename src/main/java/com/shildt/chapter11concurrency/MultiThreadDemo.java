package com.shildt.chapter11concurrency;

/**
 * Created by Max Hluhov on 25.10.2018.
 */
public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread3("First");
        new NewThread3("Second");
        new NewThread3("Third");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Main thread is over.");
    }
}
