package com.shildt.chapter07;

/**
 * Created by Max Hluhov on 28.08.2018.
 */
public class StringDemo {
    public static void main(String[] args) {
        String strOb1 = "first string";
        String strOb2 = "second string";
        String strOb3 = strOb1;
        System.out.println(strOb1.length());
        System.out.println(strOb2.charAt(3));
        System.out.println(strOb3.equals(strOb2));
    }
}
