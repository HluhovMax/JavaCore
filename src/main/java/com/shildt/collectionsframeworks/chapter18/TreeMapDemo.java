package com.shildt.collectionsframeworks.chapter18;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Max Hluhov on 10.09.2018.
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap<>();

        treeMap.put("Max", new Double(7777.9));
        treeMap.put("Lilya", new Double(1007777.9));
        treeMap.put("Mom", new Double(74777.9));
        treeMap.put("Dad", new Double(797777.9));
        treeMap.put("Nastya", new Double(6667777.9));

        Set<Map.Entry<String, Double>> set = (Set<Map.Entry<String, Double>>) treeMap.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = (double) treeMap.get("Max");
        treeMap.put("Max", balance * 2);
        System.out.println(treeMap.get("Max"));
    }
}
