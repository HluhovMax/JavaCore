package com.shildt.chapter13.lambda;

/**
 * Created by Max Hluhov on 06.10.2018.
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest test = (n) -> (n % 2) == 0;

        if (test.test(10)) System.out.println("number 10 is even");
        if (!test.test(9)) System.out.println("number 9 is not even");

        NumericTest isNotNegative = (n) -> n >= 0;

        if (isNotNegative.test(1)) System.out.println("number 1 is not negative");
        if(!isNotNegative.test(-1)) System.out.println("number -1 is negative");

        NumericTest2 isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2)) System.out.println("num 2 is factorial 10");
        if (!isFactor.test(10, 3)) System.out.println("num 3 is not factorial 10");
    }
}
