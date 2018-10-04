package com.shildt.exceptions;

/**
 * Created by Max Hluhov on 03.10.2018.
 */
public class MyException extends Exception {
    private int detail;

    MyException(int detail) {
        this.detail = detail;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}
