package com.shildt.chapter29_STREAM_api;

import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Created by Max Hluhov on 11.10.2018.
 */
public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(1.1);
        myList.add(3.6);
        myList.add(9.2);
        myList.add(4.7);
        myList.add(12.1);
        myList.add(5.0);

        System.out.print("Source myList: ");
        myList.stream().forEach((a) -> {
            System.out.print(a + " ");
        });
        System.out.println();

        IntStream intStream = myList.stream().mapToInt((a) -> (int) Math.ceil(a));
        System.out.print("Максимальные пределы: ");
        intStream.forEach((a)-> {
            System.out.print(a + " ");
        });
    }
}
