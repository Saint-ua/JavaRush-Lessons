package com.javarush.task.task18.task1816;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // Solution #1. START
//        File myFile = new File("D:\\KOSTA\\3. IT\\1. LEARNING\\JAVA\\Test-Folder\\readme.txt");
//        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(myFile))); // args[0]
//        Pattern patt = Pattern.compile("[a-zA-Z]");
//        int charCount = 0;
//        String data;
//        while ((data = br.readLine()) != null) {
//            Matcher m = patt.matcher(data);
//            while(m.find()) {
//                charCount++;
//            }
//        }
//        System.out.println(charCount);
//        br.close();
        // Solution #1. END

        // Solution #2. START
//        File myFile = new File("D:\\KOSTA\\3. IT\\1. LEARNING\\JAVA\\Test-Folder\\readme.txt");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(myFile))); // args[0]
//        String text;
//        int count = 0;
//        while ((text = reader.readLine()) != null) {
//            text = text.replaceAll("[^a-zA-Z]", "");
//            count += text.length();
//        }
//        System.out.println(count);
//        reader.close();
        // Solution #2. END

        // Solution #3. START
//        File myFile = new File("D:\\KOSTA\\3. IT\\1. LEARNING\\JAVA\\Test-Folder\\readme.txt");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(myFile))); // args[0]
//        String text;
//        int count = 0;
//        while ((text = reader.readLine()) != null) {
//            count += text.length() - text.replaceAll("[a-zA-Z]","").length();
//        }
//        System.out.println(count);
//        reader.close();
        // Solution #3. END

        // Solution #4. START
//        File myFile = new File("D:\\KOSTA\\3. IT\\1. LEARNING\\JAVA\\Test-Folder\\readme.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
        StringBuilder textFromFile = new StringBuilder();
        int count = 0;
        while (reader.ready()) {
            textFromFile.append(reader.readLine());
        }
        count = textFromFile.toString().replaceAll("[^a-zA-Z]", "").length();
        System.out.println(count);
        reader.close();
        // Solution #4. END --- CHECK PASSED

        // Solution #5. START
//        File myFile = new File("D:\\KOSTA\\3. IT\\1. LEARNING\\JAVA\\Test-Folder\\readme.txt");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
//        byte chars;
//        int count = 0;
//        while ((chars = (byte) reader.read()) > -1) {
//            if ( (chars >= 64 && chars <= 90) || (chars >= 97 && chars <= 122) ) count++;
//        }
//        System.out.println(count);
//        reader.close();
        // Solution #5. END
    }
}
