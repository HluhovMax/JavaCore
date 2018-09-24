package com.shildt.myCollection;

/**
 * Created by Max Hluhov on 23.09.2018.
 */
public class MyCollectionClassDemo {
    public static void main(String[] args) {
        Coll coll = new Coll(5);
        coll.showSize();
        //coll.add(0, 2);
        System.out.println(coll.add(3, 7));
        //coll.addWithIncrement(2);
        //coll.addWithIncrement(2);
        
        MyCollectionClass collectionClass = new MyCollectionClass(5);
        collectionClass.addWithIncrement(1, 5);
    }
}
