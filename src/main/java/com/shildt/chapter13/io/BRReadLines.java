package com.shildt.chapter13.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Max Hluhov on 06.10.2018.
 */
public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        System.out.println("enter lines of text");
        System.out.println("enter 'stop' for ending.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));

    }
}
