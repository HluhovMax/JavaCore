package com.shildt.chapter07;

/**
 * Created by Max Hluhov on 28.08.2018.
 */
public class PassArray {
    static void vaTest( int... v) {
        System.out.print("vaTest(int...)" + v.length + " Содержимое: ");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static void vaTest( boolean... v) {
        System.out.print("vaTest(boolean...)" + v.length + " Содержимое: ");

        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Содержимое: ");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest("Проверка: ", 1, 2, 3);
        vaTest(true, false, false);
    }
}
