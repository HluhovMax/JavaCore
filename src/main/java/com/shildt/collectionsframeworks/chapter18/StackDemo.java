package com.shildt.collectionsframeworks.chapter18;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by Max Hluhov on 12.09.2018.
 */
public class StackDemo {
    static void showpush(Stack<Integer> st, int a) {
        st.push(a);
        System.out.println("push (" + a + ")");
        System.out.println("Stack: " + st);
    }

    static void showpop(Stack<Integer> stack) {
        System.out.print("pop-> ");
        Integer a = stack.pop();
        System.out.println(a);
        System.out.println("Stack: " + stack);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Stack: " + stack);
        showpush(stack, 42);
        showpush(stack, 66);
        showpush(stack, 99);
        showpop(stack);
        showpop(stack);
        showpop(stack);

        try {
            showpop(stack);
        } catch (EmptyStackException e) {
            System.out.println(e);
        }
    }
}
