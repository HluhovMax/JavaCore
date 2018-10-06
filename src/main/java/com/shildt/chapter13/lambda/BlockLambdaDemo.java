package com.shildt.chapter13.lambda;

/**
 * Created by Max Hluhov on 06.10.2018.
 */
public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = n ->{
            int result = 1;

            for (int i = 1; i <=n ; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("factorial 3 eqls: " + factorial.func(3));
        System.out.println("factorial 5 eqls: " + factorial.func(5));
    }
}
