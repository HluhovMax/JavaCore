package com.shildt.chapter2021.NIO;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Max Hluhov on 11.10.2018.
 */
public class NIOStreamWrite {
    public static void main(String[] args) {
        try (OutputStream fout =
                     new BufferedOutputStream(
                             Files.newOutputStream(
                                     Paths.get("src\\main\\java\\com\\shildt\\chapter2021\\NIO\\testTarg.txt")))) {
            for (int i = 0; i < 26; i++) {
                fout.write((byte) ('A' + i));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
