package com.shildt.chapter28.semaphore;

import java.util.concurrent.Semaphore;

/**
 * Created by Max Hluhov on 30.10.2018.
 */
public class SemDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        new IncThread(semaphore, "A");
        new DecThread(semaphore, "B");
    }
}
