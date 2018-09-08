package com.shildt.collectionsframeworks.chapter18;

/**
 * Created by Max Hluhov on 07.09.2018.
 */
public class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private int code;

    public Address(String name, String street, String city, String state, int code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
