package com.shildt.chapter08;

/**
 * Created by Max Hluhov on 29.08.2018.
 */
public class Triangle extends Figure {
    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        System.out.println("В области трехугольника.");
        return dim1 * dim2 / 2;
    }
}
