package com.shildt.chapter05;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i%2==0) continue;
            System.out.println("");
        }
    }
}
