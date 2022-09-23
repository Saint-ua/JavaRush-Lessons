package ua.javarush.task.pro.task08.task0802;

/* 
Утилітний клас: частина 2
*/

import java.util.Scanner;

public class Solution {

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(int number, int power) {
        return Math.pow(number, power);
    }

    public static void main(String[]args){
        System.out.print("Enter number-1: ");
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        System.out.println("Square root of " + a + " = " + sqrt(a));
        System.out.println("Cubic root of " + a + " = " + cbrt(a));
        System.out.println();
        System.out.print("Enter number and power: ");
        int number = scn.nextInt();
        int power = scn.nextInt();
        System.out.println("Result: " + (int) pow(number, power));
    }
}
