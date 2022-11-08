package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        String file3 = br.readLine();

        FileInputStream inputStream1 = new FileInputStream(file1);
        FileOutputStream outputStream2 = new FileOutputStream(file2);
        FileOutputStream outputStream3 = new FileOutputStream(file3);

        int fileSize;
        int fileFirstHalf;
        int fileSecondHalf;
        if ((fileSize = inputStream1.available()) % 2 == 0) {
            fileFirstHalf = fileSize / 2;
            fileSecondHalf = fileSize - fileFirstHalf;
            byte[] size = new byte[fileSize];
            inputStream1.read(size);
            outputStream2.write(size, 0, fileFirstHalf);
            outputStream3.write(size, fileFirstHalf, fileSecondHalf);
        } else {
            fileFirstHalf = (fileSize / 2) + 1;
            fileSecondHalf = fileSize - fileFirstHalf;
            byte[] size = new byte[fileSize];
            inputStream1.read(size);
            outputStream2.write(size, 0, fileFirstHalf);
            outputStream3.write(size, fileFirstHalf, fileSecondHalf);
        }
        br.close();
        inputStream1.close();
        outputStream2.close();
        outputStream3.close();
    }
}
