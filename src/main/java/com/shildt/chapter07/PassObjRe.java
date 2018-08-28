package com.shildt.chapter07;

/**
 * Created by Max Hluhov on 27.08.2018.
 */
public class PassObjRe {
    public static void main(String[] args) {
        Test3 ob = new Test3(15, 20);
        System.out.println("a and b before: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("after: " + ob.a + " " + ob.b);
    }
}
