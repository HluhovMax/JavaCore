package com.shildt.chapter28.cyclic_barrier;

/**
 * Created by Max Hluhov on 30.10.2018.
 */
public class BarAction implements Runnable{
    @Override
    public void run() {
        System.out.println("Барьер достигнут");
    }
}
