package com.shildt.myCollection;

/**
 * Created by Max Hluhov on 24.09.2018.
 */

/**
 * добавить методы на нахожденеие минимального значения, максимального значения,
 * среднего арифметического, нахождения элемента по значению.
 *
 */
public class MyCollection<T> {
    private final int INIT_SIZE = 16;
    private Integer [] array = new Integer[INIT_SIZE];
    private int pointer = 0;

    public void add(Integer item) {// method for adding element to collection
        if (item != null) {// checking for null
            if (pointer == array.length - 1) {
                resize();
            }
            array[pointer++] = item;
        }
    }

    public T get(int index) {// method for taking element from collection by index
        return (T) array[index];
    }

    public void remove(int index) {// method to deleting element from collection by index
        for (int i = index; i < pointer; i++) {
            array[i] = array[i + 1];
        }
        array[pointer] = null;
        pointer--;
    }

    private void resize() {// method to make collection bigger
        Integer[] newArray = new Integer[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }



    public int size() {// to take current capacity from collection
        return pointer;
    }

}
