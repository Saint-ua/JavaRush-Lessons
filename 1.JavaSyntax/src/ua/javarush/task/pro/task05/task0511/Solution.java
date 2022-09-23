package ua.javarush.task.pro.task05.task0511;

import java.util.Scanner;

import static java.lang.System.*;

/* 
Створюємо двовимірний масив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scn = new Scanner(in);
        while(scn.hasNextInt()) {
            int num1 = scn.nextInt();
            if (num1 > 0) {
                multiArray = new int[num1][];
                for (int i = 0; i < num1; i++) {
                    int num2 = scn.nextInt();
                    if (num2 > 0) {
                        multiArray[i] = new int[num2];
                    }
                }
            }
        }
    }
}
