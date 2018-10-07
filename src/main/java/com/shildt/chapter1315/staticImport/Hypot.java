package com.shildt.chapter1315.staticImport;

import static java.lang.Math.*;
/**
 * Created by Max Hluhov on 06.10.2018.
 */
public class Hypot {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;

        side1 = 3.0;
        side2 = 4.0;

        hypot = sqrt(pow(side1, 2) + pow(side2, 2));

        System.out.println(hypot);
    }
}
