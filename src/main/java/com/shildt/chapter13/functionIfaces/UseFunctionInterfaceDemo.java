package com.shildt.chapter13.functionIfaces;

import java.util.function.Function;

/**
 * Created by Max Hluhov on 07.10.2018.
 */
public class UseFunctionInterfaceDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println(factorial.apply(3));
        System.out.println(factorial.apply(5));
    }
}
