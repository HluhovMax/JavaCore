package com.shildt.chapter11concurrency;

/**
 * Created by Max Hluhov on 26.10.2018.
 */
public class NewThread4 implements Runnable {
    private String name;
    public Thread thread;

    public NewThread4(String name) {
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("New Thread: " + thread);
        thread.start();
    }
    // точка входа в поток исполения
    @Override
    public void run() {
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(name + ": " + n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        System.out.println(name + " is over.");
    }
}
