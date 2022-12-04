package com.javarush.task.task19.task1915;

import java.io.*;
import java.nio.charset.StandardCharsets;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        String file;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            file = reader.readLine();
        }

        PrintStream defaultPrintStream = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(byteArrayOutputStream);
        System.setOut(newPrintStream);

        testString.printSomething();

        String result = byteArrayOutputStream.toString();

        System.setOut(defaultPrintStream);

        System.out.println(result);
        try (FileOutputStream writer = new FileOutputStream(file)){
            writer.write(result.getBytes(StandardCharsets.UTF_8));
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

