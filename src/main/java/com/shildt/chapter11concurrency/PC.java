package com.shildt.chapter11concurrency;

/**
 * Created by Max Hluhov on 26.10.2018.
 */
public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("To stop enter Ctrl-C.");
    }
}
