package com.shildt.chapter28.phaser;

import java.util.concurrent.Phaser;

/**
 * Created by Max Hluhov on 30.10.2018.
 */
public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int currentPhase;

        System.out.println("Запуск потоков");

        new MyThread(phaser, "A");
        new MyThread(phaser, "B");
        new MyThread(phaser, "C");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + currentPhase + " завершена");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + currentPhase + " завершена");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + currentPhase + " завершена");

        phaser.arriveAndDeregister();

        if (phaser.isTerminated()) System.out.println("Синхронизатор фаз завершен");
    }
}
