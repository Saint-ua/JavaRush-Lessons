package com.javarush.task.task18.task1819;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();  // path to readme3.txt
        String file2 = reader.readLine();  // path to readme2.txt
        reader.close();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (FileInputStream fileInputStream1 = new FileInputStream(file1);
             FileInputStream fileInputStream2 = new FileInputStream(file2)) {

            while (fileInputStream2.available() > 0) {
                byteArrayOutputStream.write(fileInputStream2.read());
            }
            while (fileInputStream1.available() > 0) {
                byteArrayOutputStream.write(fileInputStream1.read());
            }
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(file1)) {
            byteArrayOutputStream.writeTo(fileOutputStream);
        }
    }
}
 
//        // reading data from file readme3.txt
//        FileInputStream inputStream1 = new FileInputStream(file1);
//        byte data = 0;
//        ArrayList<Byte> data3 = new ArrayList<>();
//        while ((inputStream1.available()) > 0) {
//            data = (byte) inputStream1.read();
//            data3.add(data);
//        }
//
//        // clearing content of readme3.txt
//        BufferedWriter writer = Files.newBufferedWriter(Paths.get(file1));
//        writer.write("");
//        writer.flush();
//        writer.close();
//
////        file1.replaceAll("[.\\w\\s]*", "");
////        inputStream1.close();
//
//        FileOutputStream outputStream = new FileOutputStream(file1, true);
//        FileInputStream inputStream2 = new FileInputStream(file2);
//        byte data2 = 0;
//        while ((inputStream2.available()) > 0) {
//            data2 = (byte) inputStream2.read();
//            outputStream.write(data2);
//        }
//        inputStream2.close();
//        for (int i = 0; i < data3.size(); i++) {
//            outputStream.write(data3.get(i));
//        }
//        inputStream1.close();
//        outputStream.close();
//    }
//}
