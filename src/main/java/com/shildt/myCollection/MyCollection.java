package com.shildt.myCollection;

/**
 * Created by Max Hluhov on 24.09.2018.
 */

import java.util.Arrays;

/**
 * добавить методы на нахожденеие
 * нахождения элемента по значению.
 *
 */
public class MyCollection {
    private final int INIT_SIZE = 16;
    private int [] array = new int[INIT_SIZE];
    private int pointer = 0;
    private int max = 0;

    public void add(Integer item) {// method for adding element to collection
        if (item != null) {// checking for null
            if (pointer == array.length - 1) {
                resize();
            }
            array[pointer++] = item;
        }
    }

    public int get(int index) {// method for taking element from collection by index
        return  array[index];
    }

    public void remove(int index) {// method to deleting element from collection by index
        for (int i = index; i < pointer; i++) {
            array[i] = array[i + 1];
        }
        array[pointer] = 0;
        pointer--;
    }

    private void resize() {// method to make collection bigger
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    public void findMin() {
        Arrays.sort(array);
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= array[0]) {
                min = array[i];
            }
        }
        System.out.println("minimum value in array: " + "[" + min + "]");
    }

    public void findMax() {
        Arrays.sort(array);
        max = array[array.length - 1];
        System.out.println("maximum value in array: " + "[" + max + "]");
    }

    public void findAverage() {
        int average = 0;
        if (array.length > 0) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            average = sum / array.length;
        }
        System.out.println("average value of array: " + average);
    }

    public void findByValue(int value) {
//        boolean contains = IntStream.of(array).anyMatch(x -> x == value);
//        System.out.println(contains);
        Arrays.sort(array);
       int index = Arrays.binarySearch(array, value);
       System.out.println(index);
    }


    public int size() {// to take current capacity from collection
        return pointer;
    }

}
