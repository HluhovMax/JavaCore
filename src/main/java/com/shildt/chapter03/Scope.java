package com.shildt.chapter03;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class Scope {
    public static void main(String[] args) {
        int x =10;

        if (x == 10) {
            int y = 20;

            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        System.out.println("x eqls " + x);
    }
}
