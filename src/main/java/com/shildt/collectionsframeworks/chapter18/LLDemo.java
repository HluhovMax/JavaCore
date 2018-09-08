package com.shildt.collectionsframeworks.chapter18;

import java.util.LinkedList;

/**
 * Created by Max Hluhov on 08.09.2018.
 */
public class LLDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<>();

        linkedList.add("second");
        linkedList.add("third");
        linkedList.add("fourth");

        linkedList.addFirst("first");
        linkedList.addLast("fifth");

        linkedList.add(1, "one and half");
        System.out.println(linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove("one and half");

        linkedList.set(0, "changed" + linkedList.get(0));
        System.out.println(linkedList);
    }
}
