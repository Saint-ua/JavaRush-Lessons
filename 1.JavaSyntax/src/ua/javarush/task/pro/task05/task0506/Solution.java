package ua.javarush.task.pro.task05.task0506;

import java.sql.SQLOutput;
import java.util.Scanner;

/* 
Мінімальне з N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = scan.nextInt();
        int min = array[0];
        for(int i = 1; i < n; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);
    }
}
