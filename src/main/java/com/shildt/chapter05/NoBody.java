package com.shildt.chapter05;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class NoBody {
    public static void main(String[] args) {
        int i, j;

        i = 100;
        j = 200;
        while (++i < --j) {
        }
        System.out.println(i);
    }
}
