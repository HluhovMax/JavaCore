package com.shildt.myCollection;

/**
 * Created by Max Hluhov on 28.09.2018.
 */
public class MyQue {
    private int[] collection;
    private int tail;

    public MyQue() {
        collection = new int[16];
    }

    public MyQue(int n) {
        collection = new int[n];
    }

    public void add(Integer value) {
        if (value == 0) throw new NullPointerException();
        int temp = value;
        System.out.println("Adding: " + temp + " to tail.");
        tail = collection.length - 1;
        collection[tail] = temp;
        show();
        newArray();
    }

    private int[] newArray() {
        int[] mass = new int[collection.length];
        for (int i = 1; i < collection.length; i++) {
            mass[i - 1] = collection[i];
        }
        collection = mass;
        return collection;
    }

    private void show() {
        for (int i = 0; i < collection.length; i++) {
            System.out.print("[" + collection[i] + "]");
        }
        System.out.println();
    }
}
