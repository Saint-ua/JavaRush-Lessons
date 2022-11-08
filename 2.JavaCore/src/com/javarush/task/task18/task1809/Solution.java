package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        br.close();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        byte[] bytes = new byte[inputStream.available()];
        while (inputStream.available() > 0) {
            int count = inputStream.read(bytes);
            for(int i = bytes.length - 1, j = 0; i > j; i--, j++) {
                byte tmp = bytes[i];
                bytes[i] = bytes[j];
                bytes[j] = tmp;
            }
            outputStream.write(bytes, 0, count);
        }

        inputStream.close();
        outputStream.close();
    }
}
