package com.javarush.task.task12.task1207;

/* 
Int и Integer
*/

public class Solution {
    public static void main(String[] args) {
        int a = 10;
        Integer b = Integer.valueOf(a);
        print(a);
        print(b);
    }

    public static void print (int a){
        System.out.println(a);
    }
    public static void print (Integer b){
        System.out.println(b);
    }
}
