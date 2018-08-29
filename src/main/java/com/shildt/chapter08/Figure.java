package com.shildt.chapter08;

/**
 * Created by Max Hluhov on 29.08.2018.
 */
public abstract class Figure {
    double dim1;
    double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();
}
