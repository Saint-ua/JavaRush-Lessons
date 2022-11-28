package com.javarush.task.task18.task1824;

import java.io.*;
import java.nio.Buffer;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;
        boolean ifTrue = true;
        while (ifTrue) {
            try {
                fileName = consoleReader.readLine();
                File file = new File(fileName);
                FileInputStream fIS = new FileInputStream(file);
                if (!file.exists()) { fIS.close(); }
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                ifTrue = false;
            } 
        }
    }
}
