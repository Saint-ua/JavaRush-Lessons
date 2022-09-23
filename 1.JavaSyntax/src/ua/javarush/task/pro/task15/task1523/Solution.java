package ua.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Отримання інформації через API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
//        URL url = new URL("https://ivanbayern.github.io/amber/");
//        InputStream input = url.openStream();
//        byte[] buffer = input.readAllBytes();
//        String str = new String(buffer);
//        System.out.println(str);
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        // надсилаємо дані
        try (OutputStream output = connection.getOutputStream();
             PrintStream sender = new PrintStream(output))
        {
            sender.println("Привіт");
        }

        // читаємо дані
        try(InputStream input = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input)))
        {
            while (reader.ready())
                System.out.println(reader.readLine());
        }
    }
}

