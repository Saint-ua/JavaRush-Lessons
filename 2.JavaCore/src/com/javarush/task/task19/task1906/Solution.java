package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        BufferedWriter writer1 = new BufferedWriter(new FileWriter(file2));
        List<Integer> list = new ArrayList<>();
        int file1Data = 0;
        while (reader1.ready()) {
            file1Data = reader1.read();
            list.add(file1Data);
        }
        reader1.close();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) writer1.write(list.get(i));
        }
        writer1.close();
    }
}
