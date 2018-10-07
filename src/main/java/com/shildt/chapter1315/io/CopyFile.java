package com.shildt.chapter1315.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Max Hluhov on 06.10.2018.
 */
public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        File f = new File("src\\main\\java\\com\\shildt\\chapter1315\\io\\newFileCopy.txt");
        try {
            fileInputStream = new FileInputStream("src\\main\\java\\com\\shildt\\chapter1315\\io\\newFile.txt");
            fileOutputStream = new FileOutputStream(f);

            do {
                i = fileInputStream.read();
                if (i != -1) fileOutputStream.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }finally {
            try {
                if (fileInputStream != null) fileInputStream.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла ввода.");
            }
            try {
                if (fileOutputStream != null) fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла вывода.");
            }
        }
    }
}
