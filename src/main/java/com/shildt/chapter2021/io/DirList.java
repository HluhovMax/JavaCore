package com.shildt.chapter2021.io;

import java.io.File;

/**
 * Created by Max Hluhov on 07.10.2018.
 */
public class DirList {
    public static void main(String[] args) {
        String dirName = "src\\main\\java\\com\\shildt\\chapter2021\\io";
        File f1 = new File(dirName);
        if (f1.isDirectory()) {
            System.out.println("Catalog " + dirName);
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirName + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " Is catalog.");
                } else {
                    System.out.println(s[i] + " Is file.");
                }
            }
        } else {
            System.out.println(dirName + " do not a catalog");
        }
    }
}
