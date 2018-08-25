package com.shildt.chapter03;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class LifeTime {
    public static void main(String[] args) {
        for (int x = 0; x < 3; x++) {
            int y = -1;

            System.out.println("y eqls: " + y);

            y = 100;
            System.out.println("now y eqls: " + y);
        }
    }
}
