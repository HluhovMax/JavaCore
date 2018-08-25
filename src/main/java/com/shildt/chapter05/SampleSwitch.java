package com.shildt.chapter05;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i eqls 0");
                    break;
                case 1:
                    System.out.println("i eqls 1");
                    break;
                case 2:
                    System.out.println("i eqls 2");
                    break;
                case 3:
                    System.out.println("i eqls 3");
                    break;
                default:
                    System.out.println("i more than 3");
                    break;
            }
        }
    }
}
