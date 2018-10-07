package com.shildt.chapter13.lambda;

/**
 * Created by Max Hluhov on 07.10.2018.
 */
public class ConstructorRefDemo {
    public static void main(String[] args) {
        My my = MyClass::new;

        MyClass myClass = my.func(100);
        System.out.println("Значение val в объекте myClass равно " + myClass.getVal());
    }
}
