package ua.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл чи директорія
*/

public class Solution {

    private static final String THIS_IS_FILE = " - це файл";
    private static final String THIS_IS_DIR = " - це директорія";

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            while (scan.hasNext()) {
                String str = scan.nextLine();
                Path path = Path.of(str);
                if (!Files.exists(path)) break;
                else if (Files.isRegularFile(path)) System.out.println(path + THIS_IS_FILE);
                else if (Files.isDirectory(path)) System.out.println(path + THIS_IS_DIR);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

