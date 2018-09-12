package com.shildt.collectionsframeworks.chapter18;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Max Hluhov on 10.09.2018.
 */
public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap<>(new TComp());

        treeMap.put("Max Hl", new Double(7777.77));
        treeMap.put("Lilya Kuts", new Double(77.77));
        treeMap.put("Mom Kova", new Double(1237777.77));
        treeMap.put("Dad Da", new Double(75777.77));
        treeMap.put("Nasty Na", new Double(7777.77));

        Set<Map.Entry> set = treeMap.entrySet();

        for (Map.Entry me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = (double) treeMap.get("Max Hl");
        double LiB = (double) treeMap.get("Lilya Kuts");
        treeMap.put("Max Hl", balance * LiB);
        System.out.println("New Max Hl balance: " + treeMap.get("Max Hl"));
    }
}
