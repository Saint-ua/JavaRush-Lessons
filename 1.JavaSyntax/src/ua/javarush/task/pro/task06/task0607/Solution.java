package ua.javarush.task.pro.task06.task0607;

/* 
Ласкаво просимо! Але не всіх.
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        signIn("Kosta");
    }

    public static void signIn(String username){
        //напишіть тут ваш код
        if (username == "user")
            return;
        System.out.println("Ласкаво просимо, " + username);
        System.out.println("Дуже скучили за Вами, " + username);
    }
}
