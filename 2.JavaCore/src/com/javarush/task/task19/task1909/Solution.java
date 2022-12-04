package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine(); // D:\KOSTA\3.IT\1.LEARNING\JAVA\Test-Folder\task1909-1.txt
        String file2 = reader.readLine();
        reader.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        StringBuffer stringBuffer = new StringBuffer();
        while (reader1.ready()){
            stringBuffer.append(Character.toString((char)reader1.read()));
        }
        reader1.close();

        BufferedWriter writer1 = new BufferedWriter(new FileWriter(file2));
        String newData = stringBuffer.toString();
        System.out.println(newData);
        String newData2 = newData.replace(".", "!");
        System.out.println(newData2);
        writer1.write(newData2);
        writer1.close();
    }
}
