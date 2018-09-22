package com.shildt.collectionsframeworks.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by Max Hluhov on 12.09.2018.
 */
public class AlgorithmsDemo {
    public static void main(String[] args) {
         LinkedList<Integer> linkedList = new LinkedList<>();

         linkedList.add(-8);
         linkedList.add(20);
         linkedList.add(-20);
         linkedList.add(8);

         Comparator r = Collections.reverseOrder();

         Collections.sort(linkedList, r);

         for (int i : linkedList) {
         System.out.print(i + " ");
         }
         System.out.println();

         Collections.shuffle(linkedList);

         for (int i : linkedList) {
         System.out.print(i + " ");
         }
         System.out.println();
         System.out.println(Collections.min(linkedList));
         System.out.println(Collections.max(linkedList));

    }
}
