package com.shildt.chapter07;

/**
 * Created by Max Hluhov on 27.08.2018.
 */
public class Test3 {
    int a, b;

    public Test3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void meth(Test3 ob) {
        ob.a *= 2;
        ob.b /= 2;
    }
}
