package com.shildt.chapter11concurrency;

/**
 * Created by Max Hluhov on 27.10.2018.
 */
public class NewThread5 implements Runnable {
    String name;
    Thread thread;
    boolean suspendFlag;

    NewThread5(String name) {
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("new Thread: " + thread);
        suspendFlag = false;
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int n = 15; n > 0; n--) {
                System.out.println(name + ": " + n);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(name + " is over");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}
