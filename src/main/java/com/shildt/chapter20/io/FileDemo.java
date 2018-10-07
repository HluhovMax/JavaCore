package com.shildt.chapter20.io;

import java.io.File;

/**
 * Created by Max Hluhov on 07.10.2018.
 */
public class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("src/main/java/com/shildt/chapter20/io/COPYRIGHT.txt");
        p(f1.getName());
        p(f1.getPath());
        p(f1.getAbsolutePath());
        p(f1.getParent());
        p(f1.exists() ? "exist" : "not exist");
        p(f1.canWrite() ? "доступен для записи" : "недоступен для записи");
        p(f1.canRead() ? "доступен для чтения" : "недоступен для чтения");
        p(f1.isDirectory() ? "catalog" : "not catalog");
        p("Last modifier: " + f1.lastModified());
        p("Capacity: " + f1.length() + " byte");
    }
}
