package com.shildt.chapter05;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x : nums) {
            System.out.println("Value eqls: " + x);
            sum += x;
        }
        System.out.println("Sum eqls: " + sum);
    }
}
