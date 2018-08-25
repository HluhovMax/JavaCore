package com.shildt.chapter05;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : nums) {
            System.out.println("Value eqls: " + x);
            sum += x;
            if (x==5)break;
        }
        System.out.println("Sum of 5 first eqls: " + sum);
    }
}
