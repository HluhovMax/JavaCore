package com.shildt.collectionsframeworks.chapter18;

import java.util.HashMap;
import java.util.Set;
import java.util.SortedSet;

/**
 * Created by Max Hluhov on 22.09.2018.
 */
public class MapDemo {
    public static void main(String[] args) {
        Human human;
        HashMap hashMap = new HashMap<>();

        hashMap.put('m', new Human("Max", "Hl", 20, 99.5));
        hashMap.put('l', new Human("Lilya", "Ku", 20, 56));
        hashMap.put('d', new Human("Dima", "Ku", 21, 70));

        System.out.println(hashMap.size());

        Set set = (SortedSet) hashMap.entrySet();

        for (Object s : set) {
            System.out.println(s);
        }
        System.out.println();
    }
}
