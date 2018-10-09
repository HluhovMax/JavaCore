package com.shildt.chapter20.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Max Hluhov on 09.10.2018.
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\shildt\\chapter20\\io\\FileReaderDemo.java");
        try (FileReader fr =
                     new FileReader(file)) {
            int c;
            while ((c = fr.read())!=-1) System.out.print((char) c);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
