package com.shildt.chapter11concurrency;

/**
 * Created by Max Hluhov on 25.10.2018.
 */
public class NewThread3 implements Runnable {
    private String name;
    private Thread thread;

    public NewThread3(String name) {
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("New thread: " + thread);
        thread.start();
    }
    
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(name + " is over.");
    }
}
