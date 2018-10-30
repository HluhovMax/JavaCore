package com.shildt.chapter11concurrency;

/**
 * Created by Max Hluhov on 26.10.2018.
 */
public class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Поставщик").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}
