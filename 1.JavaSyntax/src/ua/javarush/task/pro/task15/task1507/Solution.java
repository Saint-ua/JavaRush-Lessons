package ua.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаємо не всіх
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner scn = new Scanner(System.in)) {
            List<String> lines = Files.readAllLines(Path.of(scn.nextLine()));
            for (int i = 0; i < lines.size(); i += 2) {
                System.out.println(lines.get(i));
            }} catch (IOException e) {
                System.out.println("Упс! Щось пішло не так: " + e);
            }
    }
}

