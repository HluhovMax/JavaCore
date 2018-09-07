package com.shildt.collectionsframeworks.chapter18;

import java.util.LinkedHashSet;

/**
 * Created by Max Hluhov on 06.09.2018.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<>();

        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");

        System.out.println(hs);

    }
}
