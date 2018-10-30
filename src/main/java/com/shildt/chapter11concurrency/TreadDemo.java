package com.shildt.chapter11concurrency;

/**
 * Created by Max Hluhov on 25.10.2018.
 */
public class TreadDemo {
    public static void main(String[] args) {
        new NewThread();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
    } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Главный поток завершен.");
    }
}
