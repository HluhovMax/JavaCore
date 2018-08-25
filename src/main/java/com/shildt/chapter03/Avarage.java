package com.shildt.chapter03;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class Avarage {
    public static void main(String[] args) {
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        for (int i = 0; i < 5; i++) {
            result += nums[i];
            System.out.println("The average eqls: " + result / 5);
        }
    }
}
