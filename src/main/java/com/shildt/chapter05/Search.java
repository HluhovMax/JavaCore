package com.shildt.chapter05;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class Search {
    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4,};
        int val = 5;
        boolean find = false;

        for (int x : nums) {
            if (x == val) {
                find = true;
                break;
            }
        }
        if (find) System.out.println("Value is found!!!");
    }
}
