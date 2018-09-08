package com.shildt.collectionsframeworks.chapter18;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max Hluhov on 08.09.2018.
 */
public class ALDemo {
    public static void main(String[] args) {
        List arrayList = new ArrayList<>();

        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third");
        arrayList.add("fourth");
        arrayList.add("fifth");

        System.out.println(arrayList.size());
        System.out.println(arrayList);

        arrayList.remove("second");
        arrayList.remove(2);

        System.out.println(arrayList.size());
        System.out.println(arrayList);
    }
}
