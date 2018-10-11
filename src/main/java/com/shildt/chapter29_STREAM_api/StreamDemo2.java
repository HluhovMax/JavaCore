package com.shildt.chapter29_STREAM_api;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Created by Max Hluhov on 11.10.2018.
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        Optional<Integer> productObj = myList.stream().reduce((a, b) -> a * b);
        if (productObj.isPresent()) System.out.println(productObj.get());

        int product = myList.stream().reduce(1, (a, b) -> a * b);
        System.out.println(product);
    }
}
