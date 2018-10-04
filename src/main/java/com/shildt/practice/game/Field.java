package com.shildt.practice.game;

/**
 * Created by Max Hluhov on 30.08.2018.
 */
public class Field {
    private char[] c;// char array for every position in the game


    Field() {
        this.c = new char[]{'+', '+', '+', '+', '+', '+', '+', '+', '+'};
    }


    void showField() {// method for output three rows of array
        for (int i = 1; i <10; i++) {
            System.out.print(c[i - 1]);
            if (i % 3 == 0) {
                System.out.println();
            }
        }
    }

    public boolean showIndexOfArray(int i,char symbol) {
        for (int j = 0; j < c.length - 1; j++) {
            if ((j == i) && (c[j] == symbol)) {
                return true;
            }
        }
        return true;
    }
    void setSymbolToArrayByIndex(int i, char symbol) {
        this.c[i] = symbol;
    }// setter for set symbol by index to array
}
