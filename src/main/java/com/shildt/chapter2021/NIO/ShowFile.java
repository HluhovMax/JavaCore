package com.shildt.chapter2021.NIO;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Max Hluhov on 09.10.2018.
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        try (InputStream inputStream =
                     Files.newInputStream(Paths.get("src\\main\\java\\com\\shildt\\chapter2021\\NIO\\test.txt"))) {
            do {
                i = inputStream.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
