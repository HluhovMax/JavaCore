package com.shildt.collectionsframeworks.chapter18;

import java.util.Comparator;

/**
 * Created by Max Hluhov on 12.09.2018.
 */
public class CompThenByFirstName implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int i, j;

        return o1.compareToIgnoreCase(o2);
    }
}
