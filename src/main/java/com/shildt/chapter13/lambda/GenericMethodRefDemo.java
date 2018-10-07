package com.shildt.chapter13.lambda;

/**
 * Created by Max Hluhov on 07.10.2018.
 */
public class GenericMethodRefDemo {
    static <T> int myOp(Function<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 5, 3, 1, 2};
        String[] strs = {"Один", "Пять", "Три", "Один", "Два",};
        int count;

        count = myOp(MyArrayOps::<Integer>countMatching, vals, 1);
        System.out.println("Массив vals содержит " + count + " числа 1");

        count = myOp(MyArrayOps::<String>countMatching, strs, "Один");
        System.out.println("Массив strs содержит " + count + " числа Один");

    }
}
