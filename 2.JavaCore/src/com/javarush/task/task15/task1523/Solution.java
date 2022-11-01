package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

import java.math.BigInteger;

public class Solution {
    private Solution(String x) {
    }

    protected Solution(int a) {
    }

    public Solution(BigInteger b) {
    }

    Solution() {
    }

    public static void main(String[] args) {

    }
}

