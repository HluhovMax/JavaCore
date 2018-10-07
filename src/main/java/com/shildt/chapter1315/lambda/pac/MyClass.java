package com.shildt.chapter1315.lambda.pac;

/**
 * Created by Max Hluhov on 07.10.2018.
 */
public class MyClass<T> {
    private T val;

    public MyClass(T val) {
        this.val = val;
    }

    public MyClass() {
        val = null;
    }

    public T getVal() {
        return val;
    }
}
