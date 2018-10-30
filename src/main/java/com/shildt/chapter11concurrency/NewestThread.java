package com.shildt.chapter11concurrency;

/**
 * Created by Max Hluhov on 25.10.2018.
 */
public class NewestThread extends Thread {

    public NewestThread() {
        super("Demo thread");
        System.out.println("subthread: " + this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("subthread: " + n);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("subthread is over.");
    }
}
