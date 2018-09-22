package com.shildt.collectionsframeworks.chapter18;

import java.util.Arrays;

/**
 * Created by Max Hluhov on 12.09.2018.
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }
        System.out.print("Source array: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Sorted array: ");
        display(array);
        Arrays.fill(array, 2, 6, -1);
        System.out.print("Array after fill(): ");
        display(array);
        Arrays.sort(array);
        System.out.print("Array after second sort: ");
        display(array);
        System.out.print("Value -9 situated: ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }

    static void display(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
