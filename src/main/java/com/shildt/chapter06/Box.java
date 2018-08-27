package com.shildt.chapter06;

/**
 * Created by Max Hluhov on 26.08.2018.
 */
public class Box {
    double widht;
    double height;
    double depth;

    Box(double w, double h, double d) {
        widht =w;
        height =h;
        depth =d;
    }

    double volume() {
        return widht*height*depth;
    }
}
