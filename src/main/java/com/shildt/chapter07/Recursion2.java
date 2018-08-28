package com.shildt.chapter07;

/**
 * Created by Max Hluhov on 27.08.2018.
 */
public class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);

        for (int i = 0; i <10 ; i++) {
            ob.values[i] = i+1;
        }

        ob.printArray(10);
    }
}
