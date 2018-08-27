package com.shildt.chapter06;

/**
 * Created by Max Hluhov on 26.08.2018.
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        System.out.println("Объем равен: " + mybox.volume());

        System.out.println("Объем равен: " + mybox2.volume());
    }
}
