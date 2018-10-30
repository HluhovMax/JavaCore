package com.shildt.chapter28.semaphore;

import java.util.concurrent.Semaphore;

/**
 * Created by Max Hluhov on 30.10.2018.
 */
public class IncThread implements Runnable { // поток увеличивающий счетчик на единицу
    String name;
    Semaphore semaphore;

    IncThread(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {

        System.out.println("Запуск потока: " + name);
        try {

            System.out.println("Поток " + name + " ожидает разрешения");
            semaphore.acquire();
            System.out.println("Поток " + name + " получает разрешение");
            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + ": " + Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток " + name + " освобождает разрешение");
        semaphore.release();
    }
}
