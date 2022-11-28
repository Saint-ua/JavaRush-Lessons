package com.javarush.task.task18.task1827;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

/* 
Прайсы
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        if (args == null || args.length < 1) {
            System.out.println("Введіть CRUD набор параметрів в конфігурації запуску й спробуйте знову.");
        } else {
            if (!args[0].equals("-c")) {
                System.out.println("Перший параметр має бути \"-с\". Спробуйте знову.");
            } else if (args[0].equals("-c")) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Введіть шлях та ім'я до файлу для операцій CRUD:");
                String fileName = reader.readLine(); //D:\KOSTA\3.IT\1.LEARNING\JAVA\Test-Folder\task1827.txt

                FileReader fileReader = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fileReader);
                String line = "";
                String line2 = "";
                StringBuilder builder = new StringBuilder(line2);
                int maxID = Integer.MIN_VALUE;
                int nextChar = 0;
                while ((line = br.readLine()) != null) {
                    for (int i = 0; i < 8; i++) {
                        nextChar = Character.getNumericValue(line.charAt(i));
                        if (nextChar > 0) builder.append(nextChar);
                    }
                    int result = Integer.parseInt(String.valueOf(builder));
                    if (maxID < result) maxID = result;
                    builder.delete(0, 8);
                }

                FileWriter fileWriter = new FileWriter(fileName, true);
                String param1 = String.format("%-" + 8 + "s", String.valueOf(maxID + 1)).substring(0, 8);
                String param2 = String.format("%-" + 30 + "s", args[1]).substring(0, 30);
                String param3 = String.format("%-" + 8 + "s", args[2]).substring(0, 8);
                String param4 = String.format("%-" + 4 + "s", args[3]).substring(0, 4);
                fileWriter.write("\n" + param1 + param2 + param3 + param4);

                fileReader.close();
                fileWriter.close();
                br.close();
                reader.close();
            }
        }
    }
}

