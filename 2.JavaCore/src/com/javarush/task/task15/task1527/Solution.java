package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        reader.close();
        String prefix = "?";
        String noPrefixStr = url.substring(url.indexOf(prefix) + prefix.length());

        String[] tokens = noPrefixStr.split("(&)|(=[.\\w]*&)|(=[.\\w]*$)");

        for (String t : tokens)
            System.out.print(t + " ");

        System.out.println();

        if (url.contains("obj")) {
            String prefix2 = "obj=";
            String noPrefixStr2 = url.substring(url.indexOf(prefix2) + prefix2.length());
            String[] tokens2 = noPrefixStr2.split("&.*$");
            for (String t2 : tokens2) {
                if (t2.matches("-?\\d+\\.\\d+")) alert(Double.parseDouble(t2));
                else if (t2.matches("-?\\d+")) alert(Integer.parseInt(t2));
                else alert(t2.toString());
            }
        }
    }


    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
