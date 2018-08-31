package com.shildt.game;

/**
 * Created by Max Hluhov on 30.08.2018.
 */
public class Field {
    char[] c = {'+', '+', '+', '+', '+', '+', '+', '+', '+'};


    void showField() {
        for (int i = 0; i < 3; i++) {
            char row = c[i];
            System.out.print(row);
        }
        System.out.println();
        for (int i = 3; i < 6; i++) {
            char row = c[i];
            System.out.print(row);
        }
        System.out.println();
        for (int i = 6; i < 9; i++) {
            char row = c[i];
            System.out.print(row);
        }
        System.out.println();
    }
}
