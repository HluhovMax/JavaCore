package com.shildt.collectionsframeworks.chapter18;

import java.util.ArrayList;

/**
 * Created by Max Hluhov on 07.09.2018.
 */
public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        System.out.print("Source output of al: ");
        for (int v : al) {
            System.out.print(v + " ");
        }
        System.out.println();

        int sum = 0;
        for (int v : al) {
            sum += v;
        }
        System.out.println("The sum: " + sum);
    }
}
