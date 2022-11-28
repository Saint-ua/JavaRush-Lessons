package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.TreeMap;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            TreeMap<Integer, String> tree = new TreeMap<>();
            String line;
            String[] array;
            String fileName = null;
            while (!"end".equals(line = reader.readLine())) {
                array = line.split(".part");
                fileName = array[0];
                tree.put(Integer.valueOf(array[1]), line);
            }
            for (String name : tree.values()) {
                try (FileInputStream file = new FileInputStream(name);
                     BufferedInputStream reader1 = new BufferedInputStream(file);
                     FileOutputStream outputFile = new FileOutputStream(fileName);
                     BufferedOutputStream writer = new BufferedOutputStream(outputFile);) {
                    byte[] bytes = new byte[65000];
                    int bytes2;
                    while ( (bytes2 = reader1.read(bytes)) > 0) {
                        writer.write(bytes, 0, bytes2);
                    }
                }
            }
        }
    }
}

