package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream newStream = new PrintStream(byteArrayOutputStream);
        System.setOut(newStream);

        testString.printSomething();

        String result = byteArrayOutputStream.toString();

        System.setOut(defaultPrintStream);

        if (result.contains("+")) {
            String[] array = result.trim().split("\\s*[\\+\\-\\*\\=]\\s*");
            int result2 = Integer.parseInt(array[0]) + Integer.parseInt(array[1]);
            System.out.printf("%s%d", result.trim().concat(" "), result2);
        }
        if (result.contains("-")) {
            String[] array = result.trim().split("\\s*[\\+\\-\\*\\=]\\s*");
            int result2 = Integer.parseInt(array[0]) - Integer.parseInt(array[1]);
            System.out.printf("%s%d", result.trim().concat(" "), result2);
        }
        if (result.contains("*")) {
            String[] array = result.trim().split("\\s*[\\+\\-\\*\\=]\\s*");
            int result2 = Integer.parseInt(array[0]) * Integer.parseInt(array[1]);
            System.out.printf("%s%d", result.trim().concat(" "), result2);
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

