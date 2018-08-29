package com.shildt.chapter08;

/**
 * Created by Max Hluhov on 29.08.2018.
 */
public class FindAreas {
    public static void main(String[] args) {
        //Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figureRef;

        figureRef = r;
        System.out.println(figureRef.area());

        figureRef = t;
        System.out.println(figureRef.area());


        }
}
