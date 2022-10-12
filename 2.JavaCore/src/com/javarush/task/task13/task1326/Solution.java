package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        String sourceFileName = reader.readLine();

        FileInputStream fis = new FileInputStream(sourceFileName);
        Scanner scn = new Scanner(fis);

        List<Integer> data = new ArrayList<>();
        while (scn.hasNext()) {
            int value = scn.nextInt();
            if (value % 2 == 0) data.add(value);
        }

        Collections.sort(data);
        for (Integer value : data) {
            System.out.println(value);
        }

        scn.close();
    }
}