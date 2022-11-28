package com.javarush.task.task18.task1820;

import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;

/* 
Округление чисел
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        try (
                BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        ) {
            String file1 = consoleReader.readLine();
            /*
D:\KOSTA\3.IT\1.LEARNING\JAVA\Test-Folder\task1820-1.txt
D:\KOSTA\3.IT\1.LEARNING\JAVA\Test-Folder\task1820-2.txt
            */
            String file2 = consoleReader.readLine();

            try (FileInputStream fin = new FileInputStream(file1);
                 InputStreamReader isr = new InputStreamReader(fin);
                 BufferedReader reader = new BufferedReader(isr);

                 FileWriter fileWriter = new FileWriter(file2);
                 BufferedWriter fileBW = new BufferedWriter(fileWriter)) {

                String line = null;
                String[] numbers = null;
                Float[] floats = null;

                while ((line = reader.readLine()) != null) {

                    numbers = line.split(" ");
                    floats = Arrays.stream(numbers).map(Float::valueOf).toArray(Float[]::new);

                    for (Float values : floats) {
                        fileBW.write(String.valueOf(Math.round(values)).concat(" "));
                    }

//                    for (Float values : floats) {
//                        if (values < 0) {
//                            BigDecimal oldValue = new BigDecimal(values);
//                            BigDecimal newValue = oldValue.round(new MathContext(1, RoundingMode.HALF_DOWN));
//                            fileBW.write(String.valueOf(newValue).concat(" "));
//                        } else if (values > 0) {
//                            BigDecimal oldValue = new BigDecimal(values);
//                            BigDecimal newValue = oldValue.round(new MathContext(1, RoundingMode.HALF_UP));
//                            fileBW.write(String.valueOf(newValue).concat(" "));
//                        }
//                    }
                }
            }
        }
    }
}
