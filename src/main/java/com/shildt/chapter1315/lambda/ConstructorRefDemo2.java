package com.shildt.chapter1315.lambda;

/**
 * Created by Max Hluhov on 07.10.2018.
 */
public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFunct<Integer> funct = MyClazz<Integer>::new;

        MyClazz<Integer> clazz = funct.func(100);

        System.out.println(clazz.getVal());
    }
}
