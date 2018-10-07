package com.shildt.chapter1315.lambda;

import static java.lang.Math.random;

/**
 * Created by Max Hluhov on 06.10.2018.
 * лямбда выражение должно быть совместимо по типу
 * с абстрактным методом, для реализации которого
 * оно предназначено.
 */
public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber number;

        number = () -> 123.45;

        System.out.println("Fixed value: " + number.getValue());

        number = () -> random() * 100;

        System.out.println("random number: " + number.getValue());
        System.out.println("one more random number: " + number.getValue());
    }
}
