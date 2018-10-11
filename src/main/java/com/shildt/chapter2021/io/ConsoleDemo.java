package com.shildt.chapter2021.io;

import java.io.Console;

/**
 * Created by Max Hluhov on 09.10.2018.
 */
public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console console;
        console = System.console();
        if (console==null) return;
        str = console.readLine("Введите строку: ");
        console.printf("Введенная вами строка: %s\n", str);
    }
}
