package com.shildt.chapter13.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Max Hluhov on 06.10.2018.
 * текстовый редактор
 */
public class TinyEdit {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = new String[100];
        System.out.println("enter lines of text");
        System.out.println("enter 'stop' for ending.");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if(str[i].equals("stop")) break;
        }
        for (int i = 0; i < 100; i++) {
            if(str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
    }
}
