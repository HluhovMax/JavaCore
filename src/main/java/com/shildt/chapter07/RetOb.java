package com.shildt.chapter07;

/**
 * Created by Max Hluhov on 27.08.2018.
 */
public class RetOb {
    public static void main(String[] args) {
        Test4 ob = new Test4(2);
        Test4 ob2;

        ob2 = ob.incByTen();
        System.out.println("ob.a: " + ob.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incByTen();//Здесь!!!!
        System.out.println("После второго увеличения значения: "+ob2.a);
    }
}
