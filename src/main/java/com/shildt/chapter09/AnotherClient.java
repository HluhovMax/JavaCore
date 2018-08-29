package com.shildt.chapter09;

/**
 * Created by Max Hluhov on 29.08.2018.
 */
public class AnotherClient implements CallBack {
    @Override
    public void callback(int param) {
        System.out.println("From AnotherClient");
        System.out.println("p в квадрате равно " + (param * param));
    }
}
