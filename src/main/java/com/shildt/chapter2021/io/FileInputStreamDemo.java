package com.shildt.chapter2021.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Max Hluhov on 08.10.2018.
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        try (FileInputStream f = new FileInputStream("C:\\Users\\Max Hluhov\\IdeaProjects\\JavaCore\\src\\main\\java\\com\\shildt\\chapter2021\\io\\FileInputStreamDemo.java")) {
            System.out.println("Общее количество доступных байт: " + (size = f.available()));
            int n = size / 40;
            System.out.println("Первые " + n + " байтов почитанных методом read()");
            for (int i = 0; i < n; i++) {
                System.out.print(f.read());
            }
            System.out.println("\n все еще доступно: " + f.available());
            System.out.println("чтение следующих " + n + " байтов по очереди методом read(b[])");
            byte b[] = new byte[n];
            if (f.read(b) != n) {
                System.err.println("Нельзя прочитать " + n + " байтов");
            }
            System.out.println(new String(b, 0, n));
            System.out.println("\nВсе еще доступно: " + (size = f.available()));
            System.out.println("Пропустить байты методом skip()");
            f.skip(size / 2);
            System.out.println("\nВсе еще доступно: " + (size = f.available()));
            System.out.println("Чтение " + n + " байтов размещаемых в конце массива");
            if (f.read(b, n / 2, n / 2) != n / 2) {
                System.err.println("Нельзя прочитать " + n + " байтов");
            }
            System.out.println(new String(b, 0, b.length));
            System.out.println("\n все еще доступно: " + f.available());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода" + e);
        }
    }
}
