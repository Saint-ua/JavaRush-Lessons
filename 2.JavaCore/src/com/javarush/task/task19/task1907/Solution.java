package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        List<String> list = new ArrayList<>();
        while(reader1.ready()){
           list.add(String.valueOf((char) reader1.read()));
        }
        reader1.close();
        StringBuilder sb = new StringBuilder();
        for (String ch : list) {
            sb.append(ch);
        }
        String string = sb.toString();
        String[] nList= string.split("[\\p{Punct}\\d\\s]");
        int count = 0;
        for (String data : nList){
            if (data.equals("world")) count++;
        }
        System.out.println(count);
    }
}
