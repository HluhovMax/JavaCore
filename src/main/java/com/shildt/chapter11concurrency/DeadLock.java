package com.shildt.chapter11concurrency;

/**
 * Created by Max Hluhov on 27.10.2018.
 */
public class DeadLock implements Runnable {
    A a = new A();
    B b = new B();

    public DeadLock() {
        Thread.currentThread().setName("Main thread.");
        Thread t = new Thread(this, "Соперничающий поток.");
        t.start();
        a.foo(b);
        System.out.println("Назад в главный поток.");
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("Назад в другой поток");
    }

    public static void main(String[] args) {
        new DeadLock();
    }
}
