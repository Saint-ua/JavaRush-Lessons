package ua.javarush.task.pro.task08.task0801;

import java.util.*;

/*
Утилітний клас: частина 1
*/

public class Solution {

    public static void main(String[]args){
        System.out.print("Enter angle's degree: ");
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        System.out.println("Sine of " + a + "° = " + sin(a));
        System.out.println("Cosine of " + a + "° = " + cos(a));
        System.out.println("Tangent of " + a + "° = " + tan(a));
    }

    public static double sin(double a) {
        //напишіть тут ваш код
        return Math.sin(Math.toRadians(a));
    }

    public static double cos(double a) {
        //напишіть тут ваш код
        return Math.cos(Math.toRadians(a));
    }

    public static double tan(double a) {
        //напишіть тут ваш код
        return Math.tan(Math.toRadians(a));
    }
}