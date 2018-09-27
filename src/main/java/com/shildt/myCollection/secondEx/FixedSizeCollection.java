package com.shildt.myCollection.secondEx;

/**
 * Created by Max Hluhov on 27.09.2018.
 */
public class FixedSizeCollection {
    private int[] collection;
    FixedSizeCollection() {
        collection = new int[16];
    }

    FixedSizeCollection(int capacityOfCollection) {
        collection = new int[capacityOfCollection];
    }

    public void add(int value) {
        for (int i = 0; i < collection.length; i++) {
            collection[collection.length - 1] = value;
            System.out.print("[" + collection[i] + "]");
        }
        System.out.println();
        if (collection[collection.length - 1] != 0) {
            for (int i = 0; i <collection.length ; i++) {
                replaceMoveLeft(collection, value);
            }
        }
    }

    private void  replaceMoveLeft(int[] array, int value) {
        /**
         * 1) сделать метод универсальным, т.е value убираем с текущей позиции,
         * а не с последнего индекса.
         */
        for (int i = 0; i < array.length; i++) {
            if (i == array[array.length - 1]) {
                array[(array.length - 1) - 1] = value;
                array[array.length - 1] = 0;
            }
            binaryReplacing(array, value);
        }
    }

    private void binaryReplacing(int[] array, int value) {
        for (int i = 0; i < array[value]; i++) {
            if (i == array[value]) {
                array[value - 1] = value;
                array[value] = 0;
            }
        }
    }

    public void showCollection() {
        for (int i = 0; i < collection.length; i++) {
            System.out.print("[" + collection[i] + "]");
        }
        System.out.println();
    }
}
