package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        FileOutputStream outputStream1 = new FileOutputStream(file1);
        FileOutputStream outputStream2 = new FileOutputStream(file1, true);
        FileInputStream inputStream2 = new FileInputStream(file2);
        FileInputStream inputStream3 = new FileInputStream(file3);
        int data;
        while ((data = inputStream2.read()) != -1) {
            outputStream1.write(data);
        }
        inputStream2.close();
        while ((data = inputStream3.read()) != -1) {
            outputStream2.write(data);
        }
        inputStream3.close();
        outputStream1.close();
        outputStream2.close();
    }
}
