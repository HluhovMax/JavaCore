package com.shildt.myCollection;

/**
 * Created by Max Hluhov on 24.09.2018.
 */
public class MyCollectionMain {
    public static void main(String[] args) {
        MyCollection collection = new MyCollection(10);
        collection.add(6);
        collection.add(7);
        collection.add(8);
        collection.add(45);
        collection.add(78);
        collection.add(23);
        collection.add(-5);
        collection.add(98);
        collection.add(-58);
        collection.add(102);

       /* System.out.println("size: " + collection.size());
        for (int i = 0; i < collection.size(); i++) {
            System.out.print("[" + collection.get(i) + "]" + " ");
        }
        System.out.println();

        collection.remove(3);
        System.out.println("size: " + collection.size());
        for (int i = 0; i < collection.size(); i++) {
            System.out.print("[" + collection.get(i) + "]" + " ");
        }
        System.out.println();
        collection.add((int) 7.7);
        System.out.println("size: " + collection.size());
        for (int i = 0; i < collection.size(); i++) {
            System.out.print("[" + collection.get(i) + "]" + " ");
        }
        System.out.println();*/
        //collection.findMax();
//        collection.findMin();
//        collection.findAverage();
        //collection.findByValue(-5);
        //collection.findByValue(78);
        //

        MyCollection myCollection = new MyCollection(5);
        myCollection.add(8);
        myCollection.add(3);
        myCollection.add(1);
        myCollection.add(9);
        myCollection.add(7);
        myCollection.add(11);

        //myCollection.findMin();
        //myCollection.showArray();
        //
        myCollection.size();
    }
}
