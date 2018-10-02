package com.shildt.exceptions;

import java.util.Arrays;

/**
 * Created by Max Hluhov on 01.10.2018.
 */
public class FinallyDemo {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        try {
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }finally {
            System.out.println("|==========================================|");
            System.out.println(Arrays.toString(array));
            System.out.println("|==========================================|");
        }
    }
}
