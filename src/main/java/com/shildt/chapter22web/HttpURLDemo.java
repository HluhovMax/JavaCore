package com.shildt.chapter22web;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Max Hluhov on 11.10.2018.
 */
public class HttpURLDemo {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.google.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        System.out.println("Вывести метод запроса: " + connection.getRequestMethod());
        System.out.println("Код ответа: " + connection.getResponseCode());
        System.out.println("Ответное сообщение: " + connection.getResponseMessage());

        Map<String, List<String>> map = connection.getHeaderFields();
        Set<String> set = map.keySet();
        System.out.println("\n Далее следует заголовок: ");
        for (String k : set) {
            System.out.println("Key: " + k + " Value: " + map.get(k));
        }
    }
}
