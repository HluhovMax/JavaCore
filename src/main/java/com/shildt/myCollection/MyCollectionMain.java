package com.shildt.myCollection;

/**
 * Created by Max Hluhov on 24.09.2018.
 */
public class MyCollectionMain {
    public static void main(String[] args) {
        MyCollection<Integer> collection = new MyCollection<>();
        collection.add(6);
        collection.add(7);
        collection.add(8);
        collection.add(45);
        collection.add(78);
        collection.add(23);
        collection.add(-5);

        System.out.println("size: " + collection.size());
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

    }
}
