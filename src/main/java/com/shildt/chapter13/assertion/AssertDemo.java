package com.shildt.chapter13.assertion;

/**
 * Created by Max Hluhov on 06.10.2018.
 */
public class AssertDemo {
    static int val = 3;

    static int getNum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;

        for (int i = 0; i < 10; i++) {
            n = getNum();

            assert n > 0;
            System.out.println("n eqls:" + n);
        }
    }
}
