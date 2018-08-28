package com.shildt.chapter07;

/**
 * Created by Max Hluhov on 27.08.2018.
 */
public class Test4 {
    int a;

    public Test4(int a) {
        this.a = a;
    }

    Test4 incByTen() {
        Test4 temp = new Test4(a + 10);
        return temp;
    }
}
