package com.shildt.chapter29_STREAM_api;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

/**
 * Created by Max Hluhov on 11.10.2018.
 */
public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");

        Stream<String> stream = myList.stream();

        Spliterator<String> spliterator = stream.spliterator();

        Spliterator<String> spliterator1 = spliterator.trySplit();

        if (spliterator1 != null) {
            spliterator1.forEachRemaining(n -> System.out.println(n));
        }

        spliterator.forEachRemaining(n -> System.out.println(n));
    }
}
