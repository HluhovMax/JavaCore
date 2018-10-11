package com.shildt.chapter29_STREAM_api;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Max Hluhov on 11.10.2018.
 */
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("Исходный список: " + myList);

        Stream<Integer> stream = myList.stream();

        Optional<Integer> minVal = stream.min(Integer::compare);
        if (minVal.isPresent()) System.out.println("Minimal val: " + minVal.get());

        stream = myList.stream();
        Optional<Integer> maxVal = stream.max(Integer::compare);
        if (maxVal.isPresent()) System.out.println("Maximum val: " + maxVal.get());

        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.print("Sorted stream: ");
        sortedStream.forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> oddVals =
                myList.stream().sorted().filter(n -> (n % 2) == 1);
        System.out.print("Нечетные значения: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();

        oddVals = myList.stream().filter(n -> (n % 2) == 1)
                .filter(n -> n > 5);
        System.out.print("Нечетные значения больше 5: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
