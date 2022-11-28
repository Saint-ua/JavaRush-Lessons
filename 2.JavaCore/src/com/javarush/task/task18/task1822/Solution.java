package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // reading from file: D:\KOSTA\3.IT\1.LEARNING\JAVA\Test-Folder\task1822.txt
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            String fileName = reader.readLine();
            try (BufferedReader reader2 = new BufferedReader(new FileReader(fileName));) {
                String line = "";
                while (reader2.ready()) {
                    line = reader2.readLine();
                    String[] line2 = line.split(" ");
                    if (Integer.parseInt(line2[0]) == Integer.parseInt(args[0]))
                        System.out.println(line);
                }
            }
        }
    }
}
