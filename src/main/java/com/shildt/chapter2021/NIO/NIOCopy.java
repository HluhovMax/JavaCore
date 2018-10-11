package com.shildt.chapter2021.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by Max Hluhov on 09.10.2018.
 */
public class NIOCopy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Применение: откуда и куда копировать");
            return;
        }
        try {
            Path source = Paths.get("src\\main\\java\\com\\shildt\\chapter2021\\NIO\\test.txt");
            Path target = Paths.get("src\\main\\java\\com\\shildt\\chapter2021\\NIO\\testTarg.txt");

            Files.copy(source, target,
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
