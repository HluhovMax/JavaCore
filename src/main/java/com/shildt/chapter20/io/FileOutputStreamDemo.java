package com.shildt.chapter20.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Max Hluhov on 08.10.2018.
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n" +
                " to come to the aid of their country\n" +
                " and pay their due taxes.";
        byte[] buf = source.getBytes();
        File file1 = new File("src\\main\\java\\com\\shildt\\chapter20\\io\\file1.txt");
        File file2 = new File("src\\main\\java\\com\\shildt\\chapter20\\io\\file2.txt");
        File file3 = new File("src\\main\\java\\com\\shildt\\chapter20\\io\\file3.txt");
        try (FileOutputStream f0 = new FileOutputStream(file1);
             FileOutputStream f1 = new FileOutputStream(file2);
             FileOutputStream f2 = new FileOutputStream(file3)) {
            for (int i = 0; i < buf.length; i += 2) {
                f0.write(buf[i]);
            }
            f1.write(buf);
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);
        }catch(IOException e){
            System.out.println("Произошла ошибка ввода-вывода.");
        }
    }
}
