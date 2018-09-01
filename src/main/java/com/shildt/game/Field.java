package com.shildt.game;

/**
 * Created by Max Hluhov on 30.08.2018.
 */
public class Field {
     private char[] c = {'+', '+', '+', '+', '+', '+', '+', '+', '+'};// char array for every position in the game


    void showField() {// method for output three rows of array
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
    }// setter for set symbol by index to array

    void setC(int i, int j, int k, char symbol) {// setter for set same symbol for three indexes in array
        this.c[i] = symbol;
        this.c[j] = symbol;
        this.c[k] = symbol;
    }
}
