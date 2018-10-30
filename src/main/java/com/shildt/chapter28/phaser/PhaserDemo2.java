package com.shildt.chapter28.phaser;

/**
 * Created by Max Hluhov on 30.10.2018.
 */
public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser myPhaser = new MyPhaser(1, 4);

        System.out.println("Запуск потоков\n");

        new CustomThread(myPhaser, "A");
        new CustomThread(myPhaser, "B");
        new CustomThread(myPhaser, "C");

        while (!myPhaser.isTerminated()) myPhaser.arriveAndAwaitAdvance();
        System.out.println("OVER.");
    }
}
