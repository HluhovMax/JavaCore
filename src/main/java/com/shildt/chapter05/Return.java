package com.shildt.chapter05;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("Before comeback.");

        if (t) return;

        System.out.println("ERRORE");
    }
}
