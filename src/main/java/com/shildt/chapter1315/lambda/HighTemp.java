package com.shildt.chapter1315.lambda;

/**
 * Created by Max Hluhov on 07.10.2018.
 */
public class HighTemp {
    private int hTemp;

    public HighTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    boolean sameTemp(HighTemp object) {
        return hTemp == object.hTemp;
    }

    boolean lessThanTemp(HighTemp object) {
        return hTemp < object.hTemp;
    }


}
