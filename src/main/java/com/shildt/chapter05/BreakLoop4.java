package com.shildt.chapter05;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class BreakLoop4 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j==10) break outer;
                System.out.print(j + " ");
            }
            System.out.println("NONONONNOONNONONONONONONONO ");
        }
        System.out.println("Loops are ended.");
    }
}
