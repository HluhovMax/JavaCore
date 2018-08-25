package com.shildt.chapter04;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0Xffffffe;

        for (i = 0; i < 4; i++) {
            num <<= 1;
            System.out.println(num);
        }
    }
}
