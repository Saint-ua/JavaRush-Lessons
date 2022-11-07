package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader readConsole = new BufferedReader(new InputStreamReader(System.in));
        String fileName = readConsole.readLine();
        readConsole.close();

        ArrayList<Integer> arr = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        while (fileInputStream.available() > 0) {
            arr.add(fileInputStream.read());
        }
        fileInputStream.close();

        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer newNum: arr) {
            if (newList.contains(newNum)) continue;
            else newList.add(newNum);
        }

        newList.sort(Comparator.naturalOrder());
        for (Integer result : newList){
            System.out.print(result + " ");
        }
    }
}
