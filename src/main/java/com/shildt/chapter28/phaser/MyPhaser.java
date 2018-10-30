package com.shildt.chapter28.phaser;

import java.util.concurrent.Phaser;

/**
 * Created by Max Hluhov on 30.10.2018.
 */
public class MyPhaser extends Phaser {
    int numPhases;

    public MyPhaser(int parties, int numPhases) {
        super(parties);
        this.numPhases = numPhases - 1;
    }

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        System.out.println("Фаза " + phase + " завершена.\n");
        if (phase==numPhases||registeredParties==0) return true;
        return false;
    }
}
