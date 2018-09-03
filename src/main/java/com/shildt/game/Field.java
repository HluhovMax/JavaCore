package com.shildt.game;

/**
 * Created by Max Hluhov on 30.08.2018.
 */
public class Field {
      char[] c ;// char array for every position in the game


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

    void setSymbolToArrayByIndex(int i, char symbol) {
        this.c[i] = symbol;
    }// setter for set symbol by index to array

    void setSymbolByIndex(int i, int j, int k, char symbol) {// setter for set same symbol for three indexes in array
        this.c[i] = symbol;
        this.c[j] = symbol;
        this.c[k] = symbol;
    }
}
