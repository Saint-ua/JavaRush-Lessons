package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Введіть 2 цілих додатніх числа:");
        String str1 = br.readLine();
        int num1 = Integer.parseInt(str1);
        String str2 = br.readLine();
        int num2 = Integer.parseInt(str2);
        int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
        if (num1 > num2) {
            max = num1;
            min = num2;
        } else if (num1 < num2) {
            max = num2;
            min = num1;
        } else {
            System.out.println("Помилка");
        }
        int result;
        for (int i = min; i > 0; i--){
            if ((min % i == 0) && (max % i == 0)) {
                result = i;
//                System.out.println("Найбільший спільний дільник двох чисел: " + result);
                System.out.println(result);
                break;
            }
        }
    }
}
