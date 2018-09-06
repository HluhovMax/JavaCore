package com.shildt.collectionsframeworks.chapter18;

import java.util.ArrayList;

/**
 * Created by Max Hluhov on 05.09.2018.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        // create array list
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Begin size array list al: " + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Size al: " + al.size());
        System.out.println("Содержимое: " + al);

        al.remove("F");
        al.remove(2);
        System.out.println("Size al: " + al.size());
        System.out.println("Содержимое: " + al);

        al.ensureCapacity(1000000);
        System.out.println(al.size());
        System.out.println(al);
    }
}
