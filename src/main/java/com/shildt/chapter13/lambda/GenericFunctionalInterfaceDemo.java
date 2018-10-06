package com.shildt.chapter13.lambda;

/**
 * Created by Max Hluhov on 06.10.2018.
 */
public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = str -> {
            String result = "";

            for (int j = str.length() - 1; j >= 0; j--) {
                result += str.charAt(j);
            }
            return result;
        };

        System.out.println("Лямбда обращается на: " + reverse.func("Лямбда"));
        System.out.println("Выражение обращается на: " + reverse.func("Выражение"));

        SomeFunc<Integer> factorial = n ->{
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
