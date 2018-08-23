package com.shildt.chapter01;

/**
 * Created by Max Hluhov on 23.08.2018.
 */
public class BlockTest {
    public static void main(String[] args) {
        int x, y;

        y = 20;

        for (x = 0; x < 10; x++) {
            System.out.println("Value of x: " + x);
            System.out.println("Value of y: " + y);
            y -= 2;
        }
    }
}
