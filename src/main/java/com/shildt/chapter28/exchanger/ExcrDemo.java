package com.shildt.chapter28.exchanger;

import java.util.concurrent.Exchanger;

/**
 * Created by Max Hluhov on 30.10.2018.
 */
public class ExcrDemo {
    public static void main(String[] args) {
        Exchanger<String> stringExchanger = new Exchanger<>();
        new UseString(stringExchanger);
        new MakeString(stringExchanger);
    }
}
