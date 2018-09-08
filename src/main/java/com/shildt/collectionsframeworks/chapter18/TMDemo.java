package com.shildt.collectionsframeworks.chapter18;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Max Hluhov on 08.09.2018.
 */
public class TMDemo {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap<>();

        treeMap.put(3, "Max");
        treeMap.put(1, "Lily");
        treeMap.put(4, "Nastya");
        treeMap.put(6, "Mom");
        treeMap.put(2, "Dad");
        treeMap.put(5, "Lera");

        System.out.println("Initial treemap content:");

        Set set = treeMap.entrySet();
        for (Object o : set) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }


        String name = (String) treeMap.get(3);
        name += "Changed";

        treeMap.put(3, name);

        set = treeMap.entrySet();

        for (Object o : set) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
