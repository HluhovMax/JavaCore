package com.shildt.chapter09;

/**
 * Created by Max Hluhov on 29.08.2018.
 */
public interface IntStack {
    void push(int item);

    int pop();

    default void clear(){
        System.out.println("Метод clear() не реализован.");
    }
}
