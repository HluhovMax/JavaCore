package com.shildt.chapter13.lambda;

/**
 * Created by Max Hluhov on 06.10.2018.
 */
public class LambdaAsArgumentsDemo {
    static String stringOp(SomeFunc<String> ss, String s) {
        return ss.func(s);
    }

    public static void main(String[] args) {
        String instr = "лямбда выражения повышают";
        String out;

        System.out.println("Исходная строка " + instr);

        out = stringOp((str) -> str.toUpperCase(), instr);

        System.out.println("In upper case: " + out);

        out = stringOp((str) -> {
            String result = "";
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != ' ') result += str.charAt(j);
            }
            return result;
        },instr);

        System.out.println("With deleting spaces: " + out);
    }
}
