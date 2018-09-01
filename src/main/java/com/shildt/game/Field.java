package com.shildt.game;

/**
 * Created by Max Hluhov on 30.08.2018.
 */
public class Field {
     private char[] c = {'+', '+', '+', '+', '+', '+', '+', '+', '+'};


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

    void setC(int i, char symbol) {
        this.c[i] = symbol;
    }

    void setC(int i, int j, int k, char symbol) {
        this.c[i] = symbol;
        this.c[j] = symbol;
        this.c[k] = symbol;
    }
}
