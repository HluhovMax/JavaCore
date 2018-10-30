package com.shildt.chapter11concurrency;

/**
 * Created by Max Hluhov on 27.10.2018.
 */
public class SuspendResume {
    public static void main(String[] args) {
        NewThread5 ob1 = new NewThread5("ONE");
        NewThread5 ob2 = new NewThread5("TWO");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Приостановка потока ONE");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Возобновление потока ONE");
            Thread.sleep(1000);
            ob2.mysuspend();
            System.out.println("Приостановка потока TWO");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Возобновление потока TWO");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Ожидание завершение потоков");
            ob1.thread.join();
            ob2.thread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Главный поток завершен.");
    }
}
