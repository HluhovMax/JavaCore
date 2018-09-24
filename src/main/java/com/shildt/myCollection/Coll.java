package com.shildt.myCollection;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Max Hluhov on 24.09.2018.
 */
public class Coll implements Iterable {
    private int[] values;
    private static final int DEFAULT_CAPACITY = 10;

    Coll() {
        values = new int[DEFAULT_CAPACITY];
    }

    Coll(int size) {
        values = new int[size];
    }

    public int[] add(int index, int value) {
            values[index] = value;
        return values;
    }

    public void addWithIncrement(Integer value) {
        for (int i = 0; i < values.length; i++) {
            values[0] = value;
            System.out.print(values[i] + " ");
            values[1] += value;
        }
       /* for (Integer el : values) {
            el += value;
            System.out.print("[" + el + "]");
        }*/
    }


    public void showSize() {
        System.out.println("Size of values: " + values.length);
    }



    @Override
    public String toString() {
        return "CollAL{" +
                "values=" + Arrays.toString(values) +
                '}';
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}

