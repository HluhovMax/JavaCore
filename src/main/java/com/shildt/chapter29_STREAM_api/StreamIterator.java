package com.shildt.chapter29_STREAM_api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * Created by Max Hluhov on 13.10.2018.
 */
public class StreamIterator {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("TV");
        myList.add("Laptop");
        myList.add("Desk");
        myList.add("Lamp");
        myList.add("Router");
        myList.add("SmartPhone");

        Stream<String> stream = myList.stream();
        Iterator<String> itr = stream.iterator();
        while (itr.hasNext()) System.out.println(itr.next());
    }
}
