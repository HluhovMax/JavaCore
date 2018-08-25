package com.shildt.chapter05;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class Sample {
    public static void main(String[] args) {
        int a, b;

        b = 4;

        for (a = 1; a < b; a++) {
            System.out.println("a ="+a);
            System.out.println("b ="+b);
            b--;
        }
    }
}
