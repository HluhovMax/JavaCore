package com.shildt.chapter1315.io;

import java.io.PrintWriter;

/**
 * Created by Max Hluhov on 06.10.2018.
 */
public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Это строка.");
        int i =-7;
        pw.println(i);
        double d = 4.5e-7;
        pw.println(d);
    }
}
