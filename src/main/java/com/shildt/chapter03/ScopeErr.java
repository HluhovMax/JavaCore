package com.shildt.chapter03;

/**
 * Created by Max Hluhov on 25.08.2018.
 */
public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {
            //int bar = 2;
        }
    }
}
