package com.shildt.chapter07;

/**
 * Created by Max Hluhov on 27.08.2018.
 */
public class Factorial {
    int fact(int n) {
        int result;

        if (n==1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
