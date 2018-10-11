package com.shildt.chapter2021.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by Max Hluhov on 11.10.2018.
 */
public class PathDemo {
    public static void main(String[] args) {
        Path filepath = Paths.get("src\\main\\java\\com\\shildt\\chapter20\\NIO\\examples\\test.txt");
        System.out.println("Name: " + filepath.getName(1));
        System.out.println("Path to file: " + filepath);
        System.out.println("Absolute path: " + filepath.toAbsolutePath());

        System.out.println("Parent catalog: " + filepath.getParent());
        if (Files.exists(filepath)) System.out.println("File exist");
        else System.out.println("file not exist");

        try {
            if (Files.isHidden(filepath)) System.out.println("file is hidden");
            else System.out.println("file isn't hidden");
        } catch (IOException e) {
            System.out.println(e);
        }

        if (Files.isWritable(filepath)) System.out.println("writable");
        if (Files.isReadable(filepath)) System.out.println("readable");

        try {
            BasicFileAttributes attributes = Files.readAttributes(filepath, BasicFileAttributes.class);

            if (attributes.isDirectory()) System.out.println("catalog");
            else System.out.println("not catalog");

            if (attributes.isRegularFile()) System.out.println("simple regular file");
            else System.out.println("not regular file");

            if (attributes.isSymbolicLink()) System.out.println("symbolic link");
            else System.out.println("not symbolic link");

            System.out.println("last modification: " + attributes.lastModifiedTime());
            System.out.println("file size: " + attributes.size());
        } catch (IOException e) {
            System.out.println(e);
        }
     }
}
