package com.shildt.chapter05;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class Comma {
    public static void main(String[] args) {
        int a, b;

        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a ="+a);
            System.out.println("b ="+b);
        }
    }
}
