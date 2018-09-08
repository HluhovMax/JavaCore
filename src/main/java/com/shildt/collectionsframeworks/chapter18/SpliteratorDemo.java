package com.shildt.collectionsframeworks.chapter18;

import java.util.ArrayList;
import java.util.Spliterator;

/**
 * Created by Max Hluhov on 07.09.2018.
 */
public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        System.out.print("vals: ");
        Spliterator<Double> splilitr = vals.spliterator();
        while (splilitr.tryAdvance((n) -> System.out.println(n))) {
        }
        System.out.println();

        splilitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (splilitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n)))) {
        }

        System.out.print("Content of sqrs: ");
        splilitr = sqrs.spliterator();
        splilitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
