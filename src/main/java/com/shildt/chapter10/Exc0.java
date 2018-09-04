package com.shildt.chapter10;

/**
 * Created by Max Hluhov on 04.09.2018.
 */
public class Exc0 {
    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("This will not be displayed.");
        } catch (ArithmeticException e) {
            System.out.println("Dividing by zero.");
        }
        System.out.println("After catch()");
    }
}
