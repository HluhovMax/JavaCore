package com.shildt.exceptions;

/**
 * Created by Max Hluhov on 01.10.2018.
 */
public class MultipleCatches {
    public static void main(String[] args) {
        int a, b = 0;
        int[] c;

        try {
            a = args.length;
            b = 42 / a;
            c = new int[]{1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("После выполнения блока try/catch.");
    }
}
