package com.shildt.chapter1315.lambda;

/**
 * Created by Max Hluhov on 07.10.2018.
 */
public class MethodRefDemo {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String in = "Лямбда улучшает.";
        String out;

        //out = stringOp(MyStringOps::strReverse, in);// в первый параметр уходит ссылка
        // на статический метод strReverse из класса MyStringOps.
        MyStringOps ops = new MyStringOps();
        out = stringOp(ops::strReverse, in);// а тут в первый параметр уходит ссылка на
        // нестатический метод, обращаясь к нему через экземпляр класса MyStringOps.
        System.out.println("Исходная строка " + in);
        System.out.println("Обращенная строка " + out);
    }
}
