package com.shildt.chapter11concurrency;

/**
 * Created by Max Hluhov on 26.10.2018.
 */
public class Synch {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller ob1 = new Caller(target, " Welcome");
        Caller ob2 = new Caller(target, " world");
        Caller ob3 = new Caller(target, " to synchronized");


        try {
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
