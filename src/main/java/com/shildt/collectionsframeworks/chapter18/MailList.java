package com.shildt.collectionsframeworks.chapter18;

import java.util.LinkedList;

/**
 * Created by Max Hluhov on 07.09.2018.
 */
public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<>();

        ml.add(new Address("John", "John", "John", "John", 12345));
        ml.add(new Address("SAra", "SAra", "SAra", "SAra", 23415));
        ml.add(new Address("Paul", "Paul", "Paul", "Paul", 99999));

        for (Address element : ml) {
            System.out.println(element + "\n");
        }
        System.out.println();
    }
}
