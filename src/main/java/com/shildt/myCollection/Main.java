package com.shildt.myCollection;

/**
 * Created by Max Hluhov on 28.09.2018.
 */
public class Main {
    public static void main(String[] args) {
        MyQue myQue = new MyQue(9);

        myQue.random();
        myQue.sort();
        myQue.add(66);
        myQue.add(88);
        myQue.findByValueInSortedArray(66);
    }
}
