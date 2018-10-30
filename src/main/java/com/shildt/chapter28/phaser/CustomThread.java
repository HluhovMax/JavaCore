package com.shildt.chapter28.phaser;

import java.util.concurrent.Phaser;

/**
 * Created by Max Hluhov on 30.10.2018.
 */
public class CustomThread implements Runnable {
    Phaser phaser;
    String name;

    CustomThread(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!phaser.isTerminated()) {
            System.out.println("поток " + name
                    + " начинает фазу "
                    + phaser.getPhase());
            phaser.arriveAndAwaitAdvance();

            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
