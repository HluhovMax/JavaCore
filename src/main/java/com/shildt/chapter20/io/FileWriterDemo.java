package com.shildt.chapter20.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Max Hluhov on 09.10.2018.
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n" +
                "\" +\n" +
                "                \" to come to the aid of their country\\n\" +\n" +
                "                \" and pay their due taxes.";
        char[] buffer = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);
        File file1 = new File("src\\main\\java\\com\\shildt\\chapter20\\io\\files\\file1.txt");
        File file2 = new File("src\\main\\java\\com\\shildt\\chapter20\\io\\files\\file2.txt");
        File file3 = new File("src\\main\\java\\com\\shildt\\chapter20\\io\\files\\file3.txt");
        try (FileWriter f0 = new FileWriter(file1);
             FileWriter f1 = new FileWriter(file2);
             FileWriter f2 = new FileWriter(file3)) {

            for (int i = 0; i < buffer.length; i += 2) {
                f0.write(buffer[i]);
            }
            f1.write(buffer);
            f2.write(buffer, buffer.length - buffer.length / 4, buffer.length / 4);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
