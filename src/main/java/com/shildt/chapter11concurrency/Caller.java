package com.shildt.chapter11concurrency;

/**
 * Created by Max Hluhov on 26.10.2018.
 */
public class Caller implements Runnable {
    String msg;
    CallMe target;
    Thread thread;

    public Caller(CallMe target, String s) {
        this.target = target;
        msg = s;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
