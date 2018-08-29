package com.shildt.chapter09;

/**
 * Created by Max Hluhov on 29.08.2018.
 */
public class Client implements CallBack {
    @Override
    public void callback(int param) {
        System.out.println("Метод callback() вызываемый со значением " + param);
    }

    void nonIFaceMeth() {
        System.out.println("nonIFaceMeth");
    }
}
