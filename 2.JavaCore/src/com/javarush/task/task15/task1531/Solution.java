package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        String result = null;
        BigInteger sum = BigInteger.ONE;
        if (n < 0) result = String.valueOf(0);
        else if (n == 0) result = String.valueOf(1);
        else if ((n > 0) && (n <= 150)) {
            for (int i = n; i > 0; i--) {
                sum = sum.multiply(BigInteger.valueOf(i)); }
                result = String.valueOf(sum);
        }
        return result;
    }
}
