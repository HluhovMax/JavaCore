package com.shildt.chapter2021.io;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Created by Max Hluhov on 08.10.2018.
 */
public class BufferdInputStreamDemo {
    public static void main(String[] args) {
        String s = "Это знак авторского права &copy;" +
                ", а &copy нет.\n";
        byte[] buff = s.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buff);
        int c;
        boolean marked = false;

        try (BufferedInputStream f = new BufferedInputStream(in)) {
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!marked) {
                            f.mark(32);
                            marked = true;
                        } else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if (marked) {
                            marked = false;
                            System.out.print("(c)");
                        }else System.out.print((char) c);
                        break;
                    case ' ':
                        if (marked) {
                            marked = false;
                            f.reset();
                            System.out.print("&");
                        }else System.out.print((char) c);
                        break;
                    default:
                        if (!marked) {
                            System.out.println((char)c);
                        }
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
