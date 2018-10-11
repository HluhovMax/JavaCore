package com.shildt.chapter29_STREAM_api;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by Max Hluhov on 11.10.2018.
 */
public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("Max", "555-55-55", "someemail1.gmail.com"));
        myList.add(new NamePhoneEmail("Lilya", "555-55-66", "someemail2.gmail.com"));
        myList.add(new NamePhoneEmail("Mom", "577-55-55", "someemail33.gmail.com"));

        System.out.println("Исходные элементы: ");
        myList.stream().forEach((a)-> {
            System.out.println(a.name + " " + a.phonenum + " " + a.email);
        });
        System.out.println();

        Stream<NamePhone> nameAndPhone = myList.stream().map((a) -> new NamePhone(a.name, a.phonenum));

        System.out.println("Список имен и номеров телефонов: ");
        nameAndPhone.forEach((a)-> {
            System.out.println(a.name + " " + a.phonenum);
        });
    }
}
