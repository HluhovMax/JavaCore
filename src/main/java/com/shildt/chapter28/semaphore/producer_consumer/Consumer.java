package com.shildt.chapter28.semaphore.producer_consumer;

/**
 * Created by Max Hluhov on 30.10.2018.
 */
public class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            q.get();
        }
    }
}
