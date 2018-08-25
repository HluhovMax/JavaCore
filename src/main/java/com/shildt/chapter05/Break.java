package com.shildt.chapter05;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first:{
            second:{
                third:
                {
                    System.out.println("Предшествует оператору break.");
                    if (t) break second;
                }
                System.out.println("NONONONONONONONONONONONONONON");
            }
            System.out.println("yesyesyesyesyesyesyesyesyesyesyesyesyesyesyesyesyes");
        }
    }
}
