package com.shildt.chapter29_STREAM_api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * Created by Max Hluhov on 11.10.2018.
 */
public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");

        Stream<String> stream = myList.stream();
        Iterator<String> itr = stream.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
