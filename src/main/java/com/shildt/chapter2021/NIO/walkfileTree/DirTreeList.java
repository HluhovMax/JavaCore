package com.shildt.chapter2021.NIO.walkfileTree;

import com.shildt.chapter2021.MyProjectDirectoryClass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Max Hluhov on 11.10.2018.
 */
public class DirTreeList {
    public static void main(String[] args) {
        String dirname = MyProjectDirectoryClass.dirPath + "\\NIO";
        System.out.println("tree begin from: " + dirname + "\n");

        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
