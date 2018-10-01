package com.shildt.exceptions;

import java.util.Random;

/**
 * Created by Max Hluhov on 01.10.2018.
 */
public class HandleError {
    static void exc() {
        int a, b, c = 0;

        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println(e);
                a = 0;
            }
            System.out.println("a: " + a);
            System.out.println("|===================|");
        }
    }
    public static void main(String[] args) {
        HandleError.exc();
    }
}
