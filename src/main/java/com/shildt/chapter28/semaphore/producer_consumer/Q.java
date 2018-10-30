package com.shildt.chapter28.semaphore.producer_consumer;

import java.util.concurrent.Semaphore;

/**
 * Created by Max Hluhov on 30.10.2018.
 */
public class Q {
    int n;

    static Semaphore semaphoreConsumer = new Semaphore(0);
    static Semaphore semaphoreProducer = new Semaphore(1);

    void get() {

        try {
            semaphoreConsumer.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Получено " + n);
        semaphoreProducer.release();
    }

    void put(int n) {
        try {
            semaphoreProducer.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.n = n;
        System.out.println("Отправлено " + n);
        semaphoreConsumer.release();
    }
}
