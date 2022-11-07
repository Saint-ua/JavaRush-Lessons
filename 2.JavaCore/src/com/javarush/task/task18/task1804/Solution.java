package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/*
Самые частые байты
*/

//public class Solution {
//    public static void main(String[] args) throws Exception {
//        BufferedReader readConsole = new BufferedReader(new InputStreamReader(System.in));
//        String fileName = readConsole.readLine();
//        readConsole.close();
//
//        ArrayList<Integer> arr = new ArrayList<>();
//        FileInputStream fileInputStream = new FileInputStream(fileName);
//        while (fileInputStream.available() > 0) {
//            arr.add(fileInputStream.read());
//        }
//        fileInputStream.close();
//
//        Map<Integer, Integer> counts = new HashMap<>();
//        int lowestFrequency = 1;
//
//        for (int num : arr){
//            int currFrequency = counts.getOrDefault(num, 0) + 1;
//            counts.put(num, currFrequency);
//            lowestFrequency = Math.min(currFrequency, lowestFrequency);
//        }
//
//        ArrayList<Integer> integers = new ArrayList<>();
//        for (int key : counts.keySet()){
//            if (counts.get(key) == lowestFrequency){
//                integers.add(key);
//            }
//        }
//
//        integers.sort(Comparator.naturalOrder());
//        for (Integer result : integers){
//            System.out.print(result + " ");
//        }
//    }
//}


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        int[] byteCountArray = new int[256];
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                byteCountArray[fileInputStream.read()] += 1;
            }
        }
        int minCount = Integer.MAX_VALUE;
        for (int byteCount : byteCountArray) {
            if (byteCount > 0 && byteCount < minCount) minCount = byteCount;
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < byteCountArray.length; i++) {
            if (byteCountArray[i] == minCount) resultList.add(i);
        }
        for (Integer resultItem : resultList) System.out.print(resultItem + " ");
    }
}

