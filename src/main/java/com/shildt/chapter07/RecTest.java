package com.shildt.chapter07;

/**
 * Created by Max Hluhov on 27.08.2018.
 */
public class RecTest {
    int [] values;

    public RecTest(int i) {
        this.values = new int[i];
    }

    void printArray(int i) {
        if (i==0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "]" + values[i - 1]);
    }
}
