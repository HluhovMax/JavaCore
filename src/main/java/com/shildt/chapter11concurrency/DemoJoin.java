package com.shildt.chapter11concurrency;

/**
 * Created by Max Hluhov on 26.10.2018.
 */
public class DemoJoin {
    public static void main(String[] args) {
        NewThread4 ob1 = new NewThread4("one");
        NewThread4 ob2 = new NewThread4("two");
        NewThread4 ob3 = new NewThread4("three");

        System.out.println("thread one run " + ob1.thread.isAlive());
        System.out.println("thread two run " + ob2.thread.isAlive());
        System.out.println("thread three run " + ob3.thread.isAlive());

        try {
            System.out.println("Waiting for threads to complete");
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("thread one run " + ob1.thread.isAlive());
        System.out.println("thread two run " + ob2.thread.isAlive());
        System.out.println("thread three run " + ob3.thread.isAlive());

        System.out.println("main thread is over.");
    }
}
