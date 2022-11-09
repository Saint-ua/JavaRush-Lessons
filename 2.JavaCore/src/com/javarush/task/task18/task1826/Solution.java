package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
        int key = 999;
        Solution solution = new Solution();
        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);
        int data = 0;
        if (args[0].equals("-e")) {
            while ( (data = inputStream.read()) > -1) {
                outputStream.write(data + key);
            }
        }
        else if (args[0].equals("-d")) {
            while ( (data = inputStream.read()) > -1) {
                outputStream.write(data - key);
            }
        }
        inputStream.close();
        outputStream.close();
    }
}
