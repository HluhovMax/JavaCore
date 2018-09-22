package com.shildt.collectionsframeworks.chapter18;

import java.util.Vector;

/**
 * Created by Max Hluhov on 12.09.2018.
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3, 2);
        System.out.println("Begin size of v: " + v.size());
        System.out.println("Begin capacity of v: " + v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println("capacity after adding 4 elements: " + v.capacity());
    }
}
