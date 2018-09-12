package com.shildt.collectionsframeworks.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Max Hluhov on 10.09.2018.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap<>();

        hashMap.put("Max", new Double(7777.9));
        hashMap.put("Lilya", new Double(1007777.9));
        hashMap.put("Mom", new Double(74777.9));
        hashMap.put("Dad", new Double(797777.9));
        hashMap.put("Nastya", new Double(6667777.9));

        Set<Map.Entry<String, Double>> set = (Set<Map.Entry<String, Double>>) hashMap.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = (double) hashMap.get("Max");
        hashMap.put("Max", balance * 2);
        System.out.println(hashMap.get("Max"));
    }
}
