package com.shildt.chapter03;

/**
 * Created by Max Hluhov on 23.08.2018.
 */
public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b eqls " + b);

        b = true;
        System.out.println("b eqls " + b);

        if (b) System.out.println("this code is true");
        b = false;
        if (b) System.out.println("this code arent compile");

        System.out.println("10>9 eqls" + (10 > 9));
    }
}
