package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleReader.readLine();
        consoleReader.close();
        FileInputStream inputStream = new FileInputStream(fileName);
        long sum = 0;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data > sum) sum = data;
        }
        inputStream.close();

        System.out.println(sum);
    }
}
