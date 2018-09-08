package com.shildt.collectionsframeworks.chapter18;

import java.util.LinkedHashSet;

/**
 * Created by Max Hluhov on 08.09.2018.
 */
public class LiHSDemo {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("5");
        linkedHashSet.add("3");
        linkedHashSet.add("1");
        linkedHashSet.add("2");
        linkedHashSet.add("4");

        System.out.println(linkedHashSet);
    }
}
