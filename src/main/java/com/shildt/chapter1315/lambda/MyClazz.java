package com.shildt.chapter1315.lambda;

/**
 * Created by Max Hluhov on 07.10.2018.
 */
public class MyClazz<T> {
    private T val;

    public MyClazz(T val) {
        this.val = val;
    }

    public MyClazz() {
        val = null;
    }

    public T getVal() {
        return val;
    }
}
