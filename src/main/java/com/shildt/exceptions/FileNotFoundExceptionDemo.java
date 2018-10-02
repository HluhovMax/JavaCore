package com.shildt.exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Max Hluhov on 01.10.2018.
 */
public class FileNotFoundExceptionDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Max Hluhov\\IdeaProjects\\JavaCore\\src\\main\\java\\com\\shildt\\exceptions\\nullfile");
        FileReader fileReader = new FileReader(file);

        char[] chars = new char[100];
        fileReader.read(chars);

        for (char c : chars) {
            System.out.print(c);
        }

        fileReader.close();
    }
}
