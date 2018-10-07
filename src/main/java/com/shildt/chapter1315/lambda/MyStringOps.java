package com.shildt.chapter1315.lambda;

/**
 * Created by Max Hluhov on 07.10.2018.
 */
public class MyStringOps {
    /**
     * статичный метод
    static String strReverse(String string) {
        String result = "";
        for (int i = string.length()-1; i >=0 ; i--) {
            result+=string.charAt(i);
        }
        return result;
    }
     */
    // нестатический метод
    String strReverse(String string) {
        String result = "";
        for (int i = string.length()-1; i >=0 ; i--) {
            result+=string.charAt(i);
        }
        return result;
    }
}
