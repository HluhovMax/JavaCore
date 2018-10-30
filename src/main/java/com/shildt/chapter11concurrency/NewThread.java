package com.shildt.chapter11concurrency;

/**
 * Created by Max Hluhov on 25.10.2018.
 */
public class NewThread implements Runnable {
    Thread t;

    public NewThread() {
        t = new Thread(this, "Демонстрационный поток создан.");
        System.out.println("Дочерний поток создан: " + t);
        t.start();
    }
    @Override
    public void run() {
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Дочерний поток: " + n);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Дочерний поток завершен.");
    }
}
