package com.shildt.chapter28.cyclic_barrier;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by Max Hluhov on 30.10.2018.
 */
public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new BarAction());

        System.out.println("Запуск потоков");

        new MyThread(cyclicBarrier, "A");
        new MyThread(cyclicBarrier, "B");
        new MyThread(cyclicBarrier, "C");
    }
}
