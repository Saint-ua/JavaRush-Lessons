package ua.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Видаляємо однакові рядки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner scn = new Scanner(System.in);
        strings = new String[6];
        for(int i = 0; i < strings.length; i++)
            strings[i] = scn.nextLine();
        for(int i = 0; i < strings.length; i++) {
            for(int j = 0; j < strings.length; j++) {
                if(i != j) {
                    if(strings[i].equals(strings[j])) {
                        strings[i] = "null";
                        strings[j] = "null";
                    }
                }
                else continue;
            }
        }
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].equals("null"))
                strings[i] = null;
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
