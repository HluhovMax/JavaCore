package com.shildt.chapter20.io;

import java.io.ByteArrayInputStream;

/**
 * Created by Max Hluhov on 08.10.2018.
 */
public class ByteArrayInputStreamdDemo {
    public static void main(String[] args) {
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        byte b[] = tmp.getBytes();

        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3);
    }
}
