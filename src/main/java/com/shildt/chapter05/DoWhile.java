package com.shildt.chapter05;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("takt " + n);
        } while (--n > 0);
    }
}
