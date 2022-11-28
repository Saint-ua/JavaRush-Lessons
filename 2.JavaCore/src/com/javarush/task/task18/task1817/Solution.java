package com.javarush.task.task18.task1817;

import java.io.*;
import java.text.DecimalFormat;

/* 
Пробелы
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
        byte chars;
        int countSpace = 0, countAll = 0;
        while ((chars = (byte) bufferedReader.read()) != -1) {
            if (chars == 32) {
                countSpace++;
                countAll++;
            } else countAll++;
        }
        float result = (float) countSpace/countAll*100;
        System.out.println(String.format("%.2f", result));
        bufferedReader.close();
    }
}
