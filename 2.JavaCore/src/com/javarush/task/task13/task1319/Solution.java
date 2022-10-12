package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/*
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        ArrayList<String> strings = new ArrayList<>();

        while(true){
            String input = bufferedReader.readLine();
            strings.add(input);
            if (input.equals("exit")) break;
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        for (String string: strings) {
            bufferedWriter.write(string + "\n");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}