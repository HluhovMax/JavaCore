package com.shildt.collectionsframeworks.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Max Hluhov on 08.09.2018.
 */
public class HMDemo {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap<>();

        hashMap.put(1, "Max");
        hashMap.put(2, "Nastya");
        hashMap.put(3, "Lily");
        hashMap.put(4, "Mom");

        System.out.println(hashMap);

        Set set = hashMap.entrySet();

        for (Object element : set) {
            Map.Entry entry = (Map.Entry) element;
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("Modifier 1 name.");
        String name = (String) hashMap.get(1);
        name += " Hluhov";
        hashMap.put(1, name);
        set = hashMap.entrySet();
        for (Object element : set) {
            Map.Entry entry = (Map.Entry) element;
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
