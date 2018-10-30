package com.shildt.chapter28.count_down_latch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Max Hluhov on 30.10.2018.
 */
public class MyThread implements Runnable {
    CountDownLatch countDownLatch;

    MyThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            countDownLatch.countDown();// обратный отсчет
        }
    }
}
