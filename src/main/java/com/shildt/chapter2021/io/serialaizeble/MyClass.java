package com.shildt.chapter2021.io.serialaizeble;

import java.io.Serializable;

/**
 * Created by Max Hluhov on 09.10.2018.
 */
public class MyClass implements Serializable {
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "s='" + s + '\'' +
                ", i=" + i +
                ", d=" + d +
                '}';
    }
}
