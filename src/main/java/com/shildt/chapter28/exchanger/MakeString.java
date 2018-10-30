package com.shildt.chapter28.exchanger;

import java.util.concurrent.Exchanger;

/**
 * Created by Max Hluhov on 30.10.2018.
 */
public class MakeString implements Runnable {
    Exchanger<String> stringExchanger;
    String string;

    MakeString(Exchanger<String> stringExchanger) {
        this.stringExchanger = stringExchanger;
        string = new String();
        new Thread(this).start();
    }

    @Override
    public void run() {
        char c = 'A';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                string += (char)c++;
            }
            try {
                string = stringExchanger.exchange(string);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
