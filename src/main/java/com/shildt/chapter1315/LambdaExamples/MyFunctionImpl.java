package com.shildt.chapter1315.LambdaExamples;

/**
 * Created by Max Hluhov on 14.10.2018.
 */
public class MyFunctionImpl {
    public static void main(String[] args) {
        MyFunction function = () -> 123.24;

        System.out.println(function.getValue());

        function = () -> Math.random() * 100;
        System.out.println(function.getValue());
        System.out.println(function.getValue());
    }
}
