package com.shildt.chapter07;

/**
 * Created by Max Hluhov on 27.08.2018.
 */
public class CallByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();

        int a = 15, b = 20;

        System.out.println("a and b before calling: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("after: " + a + " " + b);
    }
}
