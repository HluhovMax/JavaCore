package com.shildt.myCollection;

import java.util.Arrays;
import java.util.Scanner;

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

    public void sort() {
        Arrays.sort(collection, 0, collection.length);
        show();
    }

    public void getByIndex() {
        System.out.println("|===========================|");
        System.out.print("current collection: ");
        show();
        System.out.println("Please enter the search index: ");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        for (int i = 0; i < collection.length; i++) {
            if (collection[sc] == collection[i]) {
                System.out.println();
                System.out.println("finding value: [" + collection[i] + "]");
            }
        }
    }

    public void findByValueInSortedArray(int value) {
        sort();
        int index = Arrays.binarySearch(collection, value);
        System.out.println("index of the sought value: " + index);
    }

    public void random() {
        for (int i = 0; i < collection.length - 1; i++) {
            int k = (int) (Math.random() * 100);
            collection[i] = k;
        }
        show();
    }

    private void show() {
        for (int i = 0; i < collection.length; i++) {
            System.out.print("[" + collection[i] + "]");
        }
        System.out.println();
    }
}
