package com.shildt.myCollection;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Max Hluhov on 23.09.2018.
 */
public class MyCollectionClass implements Iterable{
    private int [] values;
    private static final int DEFAULT_CAPACITY = 10;

    MyCollectionClass() {
        values = new int[DEFAULT_CAPACITY];
    }

    MyCollectionClass(int capacity) {
        values = new int[capacity];
    }
    public void addWithIncrement(int index, int value) {
        rangeCheckForAdd(index);
            for (int i = 0; i < values.length; i++) {
                values[index] = value;
                System.out.print("[" + values[i] + "]");
            }
    }

    public void removeWithDecrement(int index) {

    }

    private void rangeCheckForAdd(int index) {
        if (index > values.length || index < 0) throw new IndexOutOfBoundsException();
    }


    @Override
    public String toString() {
        return "values=" + Arrays.toString(values);
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
