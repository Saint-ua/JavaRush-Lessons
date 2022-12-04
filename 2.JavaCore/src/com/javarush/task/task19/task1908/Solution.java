package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine(); // D:\KOSTA\3.IT\1.LEARNING\JAVA\Test-Folder\task1908-1.txt
        String file2 = reader.readLine();
        reader.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        char data;
        StringBuffer line = new StringBuffer();
        while (reader1.ready()) {
            data = (char) reader1.read();
            line.append(data);
        }
        reader1.close();
        String s = line.toString();
        String[] nw = s.split("\\s");

        BufferedWriter writer1 = new BufferedWriter(new FileWriter(file2));
        int newData = 0;
        for (String listSingleData : nw) {
            try {
                newData = Integer.parseInt(listSingleData);
            } catch (Exception e) { continue; }
            writer1.write(newData + " ");
        }
        writer1.close();
    }
}
