package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            String consoleIn;
            while (!"exit".equals(consoleIn = reader.readLine())) {
                ReadThread readThread = new ReadThread(consoleIn);
                readThread.start();
            }
//            System.out.println(resultMap);
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) throws IOException {
            //implement constructor body
            this.fileName = fileName;
        }

        // implement file reading here - реализуйте чтение из файла тут
        TreeMap<Byte, Integer> bytes = new TreeMap<>();

        @Override
        public void run() {
            try (BufferedReader reader2 = new BufferedReader(new FileReader(fileName))) {
                byte data;
                while (reader2.ready()) {
                    data = (byte) reader2.read();
                    if (!bytes.containsKey(data)) bytes.put(data, 1);
                    else bytes.put(data, bytes.get(data) + 1);
                }
                Map.Entry<Byte, Integer> entryWithMaxValue = null;

                for (Map.Entry<Byte, Integer> currentEntry : bytes.entrySet()) {
                    if (entryWithMaxValue == null
                            || currentEntry.getValue().compareTo(
                            entryWithMaxValue.getValue()) > 0) {
                        entryWithMaxValue = currentEntry;
                    }
                }

                resultMap.put(fileName, entryWithMaxValue.getKey().intValue());

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
