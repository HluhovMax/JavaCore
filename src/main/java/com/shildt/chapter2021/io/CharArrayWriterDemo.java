package com.shildt.chapter2021.io;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Max Hluhov on 09.10.2018.
 */
public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = "Эти данные должны быть введены в массив";
        char[] buff = new char[s.length()];
        s.getChars(0, s.length(), buff, 0);
        try {
            f.write(buff);
        } catch (IOException e) {
            System.out.println("Ошибка записи в буффер.");
            return;
        }

        System.out.println("buffer as a string: " + f.toString());
        System.out.println("to array");
        char c[] = f.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println("\n to input stream typo file writer");
        File file = new File("src\\main\\java\\com\\shildt\\chapter2021\\io\\files\\file3.txt");
        try (FileWriter fw = new FileWriter(file)) {
            f.writeTo(fw);
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Установка в исходное состояние.");
        f.reset();

        for (int i = 0; i < 3; i++) {
            f.write('X');
        }
        System.out.println(f.toString());
    }
}
