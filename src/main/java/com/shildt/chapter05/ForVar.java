package com.shildt.chapter05;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done=false;

        i = 0;
        for (; !done; ) {
            System.out.println("i eqls: " + i);
            if (i==10)done= true;
            i++;
        }
    }
}
