package com.shildt.chapter28.phaser;

import java.util.concurrent.Phaser;

/**
 * Created by Max Hluhov on 30.10.2018.
 */
public class MyThread implements Runnable {
    Phaser phaser;
    String name;

    MyThread(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {

        System.out.println("Поток " + name + " начинает первую фазу");
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Поток " + name + " начинает вторую фазу");
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Поток " + name + " начинает третью фазу");
        phaser.arriveAndAwaitAdvance();

        phaser.arriveAndDeregister();
    }
}

