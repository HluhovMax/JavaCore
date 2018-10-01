package com.shildt.exceptions;

/**
 * Created by Max Hluhov on 01.10.2018.
 */
public class Exc0 {
    static void subroutine() {
        int d = 0;
        try {
            int a = 42 / d;
            System.out.println(a);
            System.out.println("Это не выводится.");
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Деление на нуль.");
        }
        System.out.println("Действия выполняемые после оператора catch().");
    }
    public static void main(String[] args) {
        Exc0.subroutine();
        /**
         * java.lang.ArithmeticException: / by zero
         */
    }
}
