package com.shildt.chapter05;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class StringSwitch {
    public static void main(String[] args) {
        String str = "two";
        switch (str) {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("none of that");
                break;
        }
    }
}
