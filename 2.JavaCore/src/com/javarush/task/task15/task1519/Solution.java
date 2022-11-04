package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            while (true) {
                String scan = br.readLine();
                if (scan.equals("exit")) break;
                else if (scan.matches("-?\\d+[.]\\d+")) print(Double.parseDouble(scan));
                else if (scan.matches("\\d+") && Integer.parseInt(scan) > 0 && Integer.parseInt(scan) < 128)
                    print(Short.parseShort(scan));
                else if (scan.matches("-?\\d+")) print(Integer.parseInt(scan));
                else print(scan);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
