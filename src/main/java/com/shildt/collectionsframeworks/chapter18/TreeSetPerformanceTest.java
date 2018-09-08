package com.shildt.collectionsframeworks.chapter18;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by Max Hluhov on 08.09.2018.
 */
public class TreeSetPerformanceTest {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        TreeSet treeSet = new TreeSet<>();

        System.out.println("Filling our structures...");

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
            treeSet.add(i);
        }

        System.out.println("Trying to receive 999,999 element in arrayList");
        long start = System.nanoTime();
        list.get(999999);
        long end = System.nanoTime();

        long timeElapsed = end - start;
        System.out.println(timeElapsed);


    }
}
