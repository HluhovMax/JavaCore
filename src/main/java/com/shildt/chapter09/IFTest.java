package com.shildt.chapter09;

/**
 * Created by Max Hluhov on 29.08.2018.
 */
public class IFTest {
    public static void main(String[] args) {
        IntStack mystack;
        FixedStack fixedStack = new FixedStack(8);
        DynStack dynStack = new DynStack(5);

        mystack = dynStack;
        for (int i = 0; i <12 ; i++) {
            mystack.push(i);
        }

        mystack = fixedStack;
        for (int i = 0; i < 8; i++) {
            mystack.push(i);
        }

        mystack = dynStack;
        for (int i = 0; i < 12; i++) {
            mystack.pop();
        }
        mystack = fixedStack;
        for (int i = 0; i < 8; i++) {
            mystack.pop();
        }
    }
}
