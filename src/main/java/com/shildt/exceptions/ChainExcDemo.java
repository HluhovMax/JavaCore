package com.shildt.exceptions;

/**
 * Created by Max Hluhov on 03.10.2018.
 */
public class ChainExcDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("Top level");

        e.initCause(new ArithmeticException("причина"));

        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Перехвачено исключение: " + e);

            System.out.println("Первопричина: " + e.getCause());
        }
    }
}
