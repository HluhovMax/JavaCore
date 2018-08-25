package com.shildt.chapter05;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class Nested {
    public static void main(String[] args) {
        int i, j;

        for (i = 0; i < 10; i++) {
            for (j = i; j < 10; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
