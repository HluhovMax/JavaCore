package com.shildt.chapter29_STREAM_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Max Hluhov on 11.10.2018.
 */
public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("Max", "555-55-55",
                "someemail1.gmail.com"));
        myList.add(new NamePhoneEmail("Lilya", "555-55-66",
                "someemail2.gmail.com"));
        myList.add(new NamePhoneEmail("Mom", "577-55-55",
                "someemail33.gmail.com"));

        Stream<NamePhone> nameAndPhone = myList.stream().map(a -> new NamePhone(a.name, a.phonenum));

        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());

        System.out.println("List: ");
        for (NamePhone np : npList) {
            System.out.println(np.name + ": " + np.phonenum);
        }

        nameAndPhone = myList.stream().map(a -> new NamePhone(a.name, a.phonenum));

        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());
        System.out.println("Set: ");
        for (NamePhone namePhone : npSet) {
            System.out.println(namePhone.name + ": " + namePhone.phonenum);
        }
    }
}
