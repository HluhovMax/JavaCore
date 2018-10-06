package com.shildt.chapter13.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Max Hluhov on 06.10.2018.
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fis;

        if (args.length != 1) {
            System.out.println("Использование файла: newFile.txt");
            return;
        }
        // попытка открыть файл
        try {
            fis = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть файл.");
            return;
        }

        try {
            do {
                i = fis.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла.");
        }
        try {
            fis.close();
        } catch (IOException e) {
            System.out.println("Ошибка закрытия файла.");
        }

    }
}
