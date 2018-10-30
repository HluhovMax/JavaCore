package com.shildt.chapter28.exchanger;

import java.util.concurrent.Exchanger;

/**
 * Created by Max Hluhov on 30.10.2018.
 */
public class UseString implements Runnable {
    Exchanger<String> stringExchanger;
    String string;

    UseString(Exchanger<String> stringExchanger) {
        this.stringExchanger = stringExchanger;
        new Thread(this).start();
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                string = stringExchanger.exchange(new String());
                System.out.println("Получено: " + string);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
