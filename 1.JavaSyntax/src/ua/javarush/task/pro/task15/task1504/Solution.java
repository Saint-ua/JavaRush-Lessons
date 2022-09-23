package ua.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Переплутані байти
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Введіть адресу файлу джерела даних:\n");
            String file1 = scn.nextLine();
            System.out.println("Введіть адресу кінцевого файлу призначення:\n");
            String file2 = scn.nextLine();
            try (InputStream input = Files.newInputStream(Path.of(file1));
                 OutputStream output = Files.newOutputStream(Path.of(file2))) {
                byte[] bufferIn = input.readAllBytes();
                byte[] bufferOut = new byte[bufferIn.length];
                for (int i = 0; i < bufferIn.length; i += 2) {
                    if (i < bufferIn.length - 1) {
                        bufferOut[i] = bufferIn[i + 1];
                        bufferOut[i + 1] = bufferIn[i];
                    } else {
                        bufferOut[i] = bufferIn[i];
                    }
                }
                output.write(bufferOut);
            } catch (IOException e) {
                System.out.println("Упс! Щось пішло не так: " + e);
            }

        }
    }
}

