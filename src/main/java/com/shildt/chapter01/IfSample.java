package com.shildt.chapter01;

/**
 * Created by Max Hluhov on 23.08.2018.
 */
public class IfSample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        if (x < y) {
            System.out.println("X<Y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("now X==Y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("X>Y");
        }
        if (x == y) {
            System.out.println("you will see nothing");
        }
    }
}
