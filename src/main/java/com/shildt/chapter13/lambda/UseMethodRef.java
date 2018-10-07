package com.shildt.chapter13.lambda;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Max Hluhov on 07.10.2018.
 */
public class UseMethodRef {
    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> al = new ArrayList<>();

        al.add(new MyClass(1));
        al.add(new MyClass(4));
        al.add(new MyClass(2));
        al.add(new MyClass(54));
        al.add(new MyClass(12));
        al.add(new MyClass(8));
        al.add(new MyClass(5));
        al.add(new MyClass(78));
        al.add(new MyClass(56));
        al.add(new MyClass(2));
        al.add(new MyClass(6));
        al.add(new MyClass(4));

        MyClass maxValue = Collections.max(al, UseMethodRef::compareMC);

        System.out.println("Максимальное значение равно " + maxValue.getVal());
    }
}
