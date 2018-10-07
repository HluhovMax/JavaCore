package com.shildt.chapter1315.lambda.pac;

/**
 * Created by Max Hluhov on 07.10.2018.
 */
public class Main {
    static <R, T> R myClassFactory(MyFunc<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc<MyClass<Double>, Double> myClassCons = MyClass<Double>::new;
        MyClass<Double> doubleMyClass = myClassFactory(myClassCons, 100.1);

        System.out.println(doubleMyClass.getVal());


        MyFunc<MyClass2, String> myClass2StringMyFunc = MyClass2::new;

        MyClass2 myClass2 = myClassFactory(myClass2StringMyFunc, "Lambda");
        System.out.println(myClass2.getStr());
    }
}
