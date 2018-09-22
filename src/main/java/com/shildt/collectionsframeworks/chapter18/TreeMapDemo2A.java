package com.shildt.collectionsframeworks.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Max Hluhov on 12.09.2018.
 */
public class TreeMapDemo2A {
    public static void main(String[] args) {
        CompLastName compLastName = new CompLastName();
        Comparator<String> compLastThenFirst = compLastName.thenComparing(new CompThenByFirstName());

        TreeMap<String, Double> treeMap = new TreeMap<>(compLastThenFirst);

        treeMap.put("Max Hl", new Double(7777.77));
        treeMap.put("Lilya Kuts", new Double(77.77));
        treeMap.put("Mom Kova", new Double(1237777.77));
        treeMap.put("Dad Da", new Double(75777.77));
        treeMap.put("Nasty Na", new Double(7777.77));

        Set<Map.Entry<String, Double>> set = treeMap.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = treeMap.get("Max Hl");
        treeMap.put("Max Hl", balance * 2);
        System.out.println("New Max Hl balance: " + treeMap.get("Max Hl"));
    }
}
