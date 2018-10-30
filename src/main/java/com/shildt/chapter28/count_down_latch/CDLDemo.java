package com.shildt.chapter28.count_down_latch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Max Hluhov on 30.10.2018.
 */
public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);

        System.out.println("Запуск потока исполнения");

        new MyThread(countDownLatch);

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Завершение потока");
    }
}
