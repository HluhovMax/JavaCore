package com.shildt.chapter13.lambda;

/**
 * Created by Max Hluhov on 07.10.2018.
 */
public class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (vals[i]==v) count++;
        }
        return count;
    }
}
