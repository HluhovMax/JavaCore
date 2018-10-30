package com.shildt.chapter28.semaphore.producer_consumer;

/**
 * Created by Max Hluhov on 30.10.2018.
 */
public class ProdCons {
    public static void main(String[] args) {
        Q q = new Q();
        new Consumer(q);
        new Producer(q);
    }
}
