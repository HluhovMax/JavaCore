package com.shildt.chapter08;

/**
 * Created by Max Hluhov on 28.08.2018.
 */
public class Box {
    private double width;
    private double heigth;
    private double depth;

    public Box(double width, double heigth, double depth) {
        this.width = width;
        this.heigth = heigth;
        this.depth = depth;
    }

    Box(Box ob) {
        width = ob.width;
        heigth = ob.heigth;
        depth = ob.depth;
    }

    Box() {
        width = -1;
        heigth = -1;
        depth = -1;
    }

    Box(double len) {
        width = heigth = depth = len;
    }

    double volume() {
        return width * heigth * depth;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", heigth=" + heigth +
                ", depth=" + depth +
                '}';
    }
}
