package com.shildt.collectionsframeworks.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Max Hluhov on 10.09.2018.
 */
public class CompDemo {
    public static void main(String[] args) {
        Comparator<String> comparator = (a, b) -> a.compareTo(b);
        TreeSet<String> treeSet = new TreeSet<>((a, b) -> b.compareTo(a));

        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("D");

        for (String el : treeSet) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
