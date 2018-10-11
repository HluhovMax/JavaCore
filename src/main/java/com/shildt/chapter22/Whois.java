package com.shildt.chapter22;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

/**
 * Created by Max Hluhov on 11.10.2018.
 */
public class Whois {
    public static void main(String[] args) throws Exception{
        int c;
        Socket s = new Socket("http://www.internic.net", 43);

        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        String str = "MHProfessional.com";
        byte[] buffer = str.getBytes();
        out.write(buffer);
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
        s.close();
    }
}
