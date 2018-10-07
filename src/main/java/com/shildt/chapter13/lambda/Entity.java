package com.shildt.chapter13.lambda;

/**
 * Created by Max Hluhov on 07.10.2018.
 */
public class Entity {
    private String name;
    private int age;

    public Entity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
