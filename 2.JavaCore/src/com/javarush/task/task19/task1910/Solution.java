package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        String file1, file2;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            file1 = reader.readLine();
            file2 = reader.readLine();
        } // D:\KOSTA\3.IT\1.LEARNING\JAVA\Test-Folder\task1910-1.txt

        StringBuffer stringBuffer = new StringBuffer();
        try (BufferedReader reader = new BufferedReader(new FileReader(file1))){
            while (reader.ready()){
                stringBuffer.append((char)reader.read());
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file2))){
            writer.write(stringBuffer.toString().replaceAll("[\\p{Punct}]", ""));
        }
    }
}
