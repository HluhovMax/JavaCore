package com.shildt.chapter1315.lambda;

/**
 * Created by Max Hluhov on 07.10.2018.
 * захват переменной.
 */
public class VarCapture {
    public static void main(String[] args) {
        int num = 10;

        MyFunc lambda = n -> {
            int v = num + n;
            return v;
        };

        // n = 9; приведет к ошибке, т.к нельзя выдоизменять захваченую переменную

        System.out.println(lambda.func(2));
    }
}
