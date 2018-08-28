package com.shildt.chapter07;

/**
 * Created by Max Hluhov on 28.08.2018.
 */
public class AccessTest {
    public static void main(String[] args) {
        Test5 ob = new Test5();

        ob.a = 10;
        ob.b = 20;

        ob.setc(100);
        System.out.println("a, b, c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
