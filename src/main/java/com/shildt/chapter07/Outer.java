package com.shildt.chapter07;

/**
 * Created by Max Hluhov on 28.08.2018.
 */
public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        int y = 10;
        void display() {
            System.out.println("вывод переменной outer_x: " + outer_x);
        }
    }

    void showy() {
        Inner inner = new Inner();
         System.out.println(inner.y);
    }
}
