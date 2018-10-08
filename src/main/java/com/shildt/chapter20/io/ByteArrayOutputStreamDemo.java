package com.shildt.chapter20.io;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Max Hluhov on 08.10.2018.
 */
public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "Эти данные должны быть введены в массив.";
        byte[] buff = s.getBytes();

        try {
            f.write(buff);
        } catch (IOException e) {
            System.out.println("Ошибка записи в буффер.");
            return;
        }
        System.out.println("Буффер в ввиде символьной строки.");
        System.out.println(f.toString());
        System.out.println("В массив");
        byte[] b = f.toByteArray();
        for (int i = 0; i < b.length; i++) {
            System.out.print((char) b[i]);
        }
        System.out.println("\nПоток вывода типа OutputStream.");
        File file = new File("src\\main\\java\\com\\shildt\\chapter20\\io\\file4.txt");
        try (FileOutputStream f2 = new FileOutputStream(file)) {
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
            return;
        }
        System.out.println("Установка в исходное состояние.");
        f.reset();

        for (int i = 0; i < 3; i++) {
            f.write('X');
        }
        System.out.println(f.toString());
    }
}
