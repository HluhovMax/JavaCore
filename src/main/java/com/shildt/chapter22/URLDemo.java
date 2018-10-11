package com.shildt.chapter22;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Max Hluhov on 11.10.2018.
 */
public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("http://www.HerbShildt.com/Articles");
        System.out.println("Protocol: "+hp.getProtocol());
        System.out.println("Port: "+hp.getPort());
        System.out.println("Host: "+hp.getHost());
        System.out.println("File: "+hp.getFile());
        System.out.println("External form: "+hp.toExternalForm());
    }
}
