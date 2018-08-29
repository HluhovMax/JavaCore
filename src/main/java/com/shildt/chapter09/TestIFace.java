package com.shildt.chapter09;

/**
 * Created by Max Hluhov on 29.08.2018.
 */
public class TestIFace {
    public static void main(String[] args) {
        CallBack c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob;

        c.callback(42);
    }
}
