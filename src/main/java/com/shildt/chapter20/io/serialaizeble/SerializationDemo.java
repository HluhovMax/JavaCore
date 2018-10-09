package com.shildt.chapter20.io.serialaizeble;

import java.io.*;

/**
 * Created by Max Hluhov on 09.10.2018.
 */
public class SerializationDemo {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\shildt\\chapter20\\io\\serialaizeble\\serial");
        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(new FileOutputStream(file))) {
            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);
            objectOutputStream.writeObject(object1);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (ObjectInputStream objectInputStream =
                     new ObjectInputStream(new FileInputStream(file))) {
            MyClass object2 = (MyClass) objectInputStream.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
    }
}
