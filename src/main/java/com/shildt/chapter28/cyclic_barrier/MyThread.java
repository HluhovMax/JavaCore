package com.shildt.chapter28.cyclic_barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by Max Hluhov on 30.10.2018.
 */
public class MyThread implements Runnable {
    CyclicBarrier cyclicBarrier;
    String name;

    MyThread(CyclicBarrier cyclicBarrier, String name) {
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {

        System.out.println(name);
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
