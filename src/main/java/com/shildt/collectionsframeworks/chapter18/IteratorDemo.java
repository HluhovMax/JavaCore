package com.shildt.collectionsframeworks.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by Max Hluhov on 06.09.2018.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        System.out.print("Source code of al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String el = itr.next();
            System.out.print(el + " ");
        }
        System.out.println();

        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            String el = litr.next();
            litr.set(el + "+");
        }

        System.out.print("Changed content array list al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            String el = itr.next();
            System.out.print(el + " ");
        }
        System.out.println();

        System.out.print("Changed list redirection: ");
        while (litr.hasPrevious()) {
            String el = litr.previous();
            System.out.println(el+" ");
        }
        System.out.println();
    }
}
