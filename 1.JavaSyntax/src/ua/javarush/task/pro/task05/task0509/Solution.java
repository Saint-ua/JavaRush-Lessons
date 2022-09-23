package ua.javarush.task.pro.task05.task0509;

/* 
Таблиця множення
*/

import java.sql.SQLOutput;

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишіть тут ваш код
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 1; i < 11; i++) {
            int horizon = i;
            for (int j = 1; j < 11; j++) {
                int vertical = j;
                int res = i*j;
                int a = i - 1, b = j - 1;
                MULTIPLICATION_TABLE[a][b] = res;
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }
}
