package com.shildt.chapter1315.lambda2_jenkov;

/**
 * Created by Max Hluhov on 12.10.2018.
 */
public class Exsample {
    public static void main(String[] args) {
        MyFunction function = (n,n1) -> {
            System.out.println(n+"+"+n1);
            return n+n1;
        };
        System.out.println(function.apply("hello", "Lilia"));

        MyFunction myFunction = function;
        System.out.println(myFunction.apply("tes1", "test2"));
    }
}
