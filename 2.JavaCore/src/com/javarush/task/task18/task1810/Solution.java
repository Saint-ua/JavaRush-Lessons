package com.javarush.task.task18.task1810;

import java.io.*;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        int size = Integer.MAX_VALUE;
        BufferedReader br = null;
        FileInputStream fis = null;
        while (size >= 1000) {
            br = new BufferedReader(new InputStreamReader(System.in));
            fis = new FileInputStream(br.readLine());
            byte[] data = new byte[fis.available()];
            size = fis.read(data);
//            System.out.println(size);
            fis.close();
            if (size < 1000) {
                throw new DownloadException();
            }
        }
        br.close();
        fis.close();
    }

    public static class DownloadException extends Exception {

    }
}
