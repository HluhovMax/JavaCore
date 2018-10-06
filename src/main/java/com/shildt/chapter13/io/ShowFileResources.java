package com.shildt.chapter13.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Max Hluhov on 06.10.2018.
 */
public class ShowFileResources {
    static File f = new File("src\\main\\java\\com\\shildt\\chapter13\\io\\newFile.txt");
    public static void main(String[] args) throws IOException {
        int i;
        try (FileInputStream fin = new FileInputStream(f)) {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода.");
        }
    }
}
