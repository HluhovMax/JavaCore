package com.shildt.chapter07;

/**
 * Created by Max Hluhov on 27.08.2018.
 */
public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println("Peзyльтaт вызова ob.test(123.25} : " + result);
    }
}
