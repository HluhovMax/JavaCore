package com.shildt.chapter22;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * Created by Max Hluhov on 11.10.2018.
 */
public class UCDemo {
    public static void main(String[] args) throws Exception{
        int c;
        URL hp = new URL("http://www.internic.com");
        URLConnection connection = hp.openConnection();
        long date = connection.getDate();
        if (date==0) System.out.println("Сведения о дате отсутствуют.");
        else System.out.println("Date: " + new Date(date));

        System.out.println("Тип содержимого: " + connection.getContentType());

        date = connection.getExpiration();
        if (date==0) System.out.println("отсутствуют");
        else System.out.println("Срок действия истекает: " + new Date(date));

        long len = connection.getContentLengthLong();
        if (len==-1) System.out.println("length denied");
        else System.out.println("len: " + len);

        if (len != 0) {
            System.out.println("==Содержимое==");
            InputStream in = connection.getInputStream();
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
            in.close();
        }else System.out.println("Содержимое недоступно.");
    }
}
