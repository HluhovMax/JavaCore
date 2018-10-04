package com.shildt.practice.myCollection;

/**
 * Created by Max Hluhov on 24.09.2018.
 */
public class MyCollectionMain {
    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();

        myCollection.addWithIncrement(2);
        myCollection.showMyCollection();
        myCollection.addWithIncrement(4);
        myCollection.showMyCollection();
        myCollection.removeWithDecrement(4);
        myCollection.showMyCollection();
    }
}
