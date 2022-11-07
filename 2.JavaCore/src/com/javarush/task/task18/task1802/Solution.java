package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleReader.readLine();
        consoleReader.close();

        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            int sum = Integer.MAX_VALUE;
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                if (data < sum) sum = data;
            }
            System.out.println(sum);
        }
    }
}
