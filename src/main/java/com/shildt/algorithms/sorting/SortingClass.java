package com.shildt.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max Hluhov on 12.10.2018.
 */
public class SortingClass {

    public static int[] convertIntegers(List<Integer> integers) {
        int[] ret = new int[integers.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }

    // https://www.youtube.com/watch?v=lCDZ0IprFw4&list=PLj8W7XIvO93qVnnXxyeWmCSvMFqRBP4Jw&index=1
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        int j, key, temp;
        for (int i = 0; i < list.size(); i++) {
            key = list.get(i);
            j = i - 1;
            while (j >= 0 && key < list.get(j)) {
                temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
                j--;
            }
        }
        return list;
    }

    // https://www.youtube.com/watch?v=cqh8nQwuKNE&list=PLj8W7XIvO93qVnnXxyeWmCSvMFqRBP4Jw&index=2
    public static int[] selectionSort(int[] list) {
        int minValue, minIndex, temp = 0;
        for (int i = 0; i < list.length; i++) {
            minValue = list[i];
            minIndex = i;
            for (int j = i; j < list.length; j++) {
                if (list[j] < minValue) {
                    minValue = list[j];
                    minIndex = j;
                }
            }
            if (minValue < list[i]) {
                temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }
        return list;
    }

    // https://www.youtube.com/watch?v=F13_wsHDIG4&index=3&list=PLj8W7XIvO93qVnnXxyeWmCSvMFqRBP4Jw
    public static int[] bubbleSort(int[] list) {
        int temp = 0;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(88);
        list.add(14);
        list.add(89);

        /** INSERTION_SORTING */
        insertionSort(list);// using insertion sorting for list typo ArrayList.
        for (Integer el : list) {
            System.out.print(el + " ");
        }
        System.out.println();
        int[] arr = convertIntegers(list);// converting ArrayList to integers array.
        /** SELECTION_SORTING */
        selectionSort(arr);// using selection sorting for array.
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]");
        }
        System.out.println();
        /** BUBBLE_SORTING */
        arr = convertIntegers(list);
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]");
        }
        System.out.println();
    }
}
