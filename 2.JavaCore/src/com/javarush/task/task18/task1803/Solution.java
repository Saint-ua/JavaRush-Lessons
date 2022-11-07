package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
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

        Map<Integer, Integer> counts = new HashMap<>();
        int highestFrequency = 0;

        for (int num : arr){
            int currFrequency = counts.getOrDefault(num, 0) + 1;
            counts.put(num, currFrequency);
            highestFrequency = Math.max(currFrequency, highestFrequency);
        }

        for (int key : counts.keySet()){
            if (counts.get(key) == highestFrequency){
                System.out.print(key + " ");
            }
        }
    }
}
