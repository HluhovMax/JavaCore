package com.shildt.chapter10;

/**
 * Created by Max Hluhov on 05.09.2018.
 */
public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Перехват исключений общего класса Exception.");
        }
    }
}
