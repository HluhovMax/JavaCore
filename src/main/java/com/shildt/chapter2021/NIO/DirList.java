package com.shildt.chapter2021.NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by Max Hluhov on 11.10.2018.
 */
public class DirList {
    public static void main(String[] args) {
        String dirname = "src\\main\\java\\com\\shildt\\chapter2021";

        try (DirectoryStream<Path> directoryStream =
                     Files.newDirectoryStream(Paths.get(dirname))) {
            System.out.println("Catalog: " + dirname);
            for (Path entry : directoryStream) {
                BasicFileAttributes attributes =
                        Files.readAttributes(entry, BasicFileAttributes.class);
                if (attributes.isDirectory()) System.out.print("<DIR>");
                else System.out.print("  ");
                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e1) {
            System.out.println(e1);
        } catch (NotDirectoryException e1) {
            System.out.println(e1);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
