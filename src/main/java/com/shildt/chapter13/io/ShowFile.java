package com.shildt.chapter13.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Max Hluhov on 06.10.2018.
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("src\\main\\java\\com\\shildt\\chapter13\\io\\newFile.txt");
            do {
                i = fis.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }finally {
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла.");
            }
        }


    }
}
