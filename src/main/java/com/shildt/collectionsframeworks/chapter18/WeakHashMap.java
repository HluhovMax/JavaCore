package com.shildt.collectionsframeworks.chapter18;

import java.util.Map;

/**
 * Created by Max Hluhov on 08.09.2018.
 */
public class WeakHashMap {
    private static Map map;
    public static void main(String[] args) {
        map = new java.util.WeakHashMap<>();
        map.put(new Integer(1), "Proselyte");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (map.containsKey(1)) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread is waiting...");
                    System.gc();
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("Application is waiting...");
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
