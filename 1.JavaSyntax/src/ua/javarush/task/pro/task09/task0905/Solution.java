package ua.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Вісімковий конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює вісімковому числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Вісімкове число " + octalNumber + " дорівнює десятковому числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишіть тут ваш код
        if(decimalNumber<=0) return 0;
        else{
            int i = 0;
            int octalNumber = 0;
            while(decimalNumber != 0){
                octalNumber += ((decimalNumber % 8) * Math.pow(10, i));
                decimalNumber = decimalNumber / 8;
                i++;
            }
            return octalNumber;
        }
    }

    public static int toDecimal(int octalNumber) {
        //напишіть тут ваш код
        if(octalNumber<=0) return 0;
        else{
            int i = 0;
            int decimalNumber = 0;
            while(octalNumber != 0){
                decimalNumber += ((octalNumber % 10) * Math.pow(8, i));
                octalNumber = octalNumber / 10;
                i++;
            }
            return decimalNumber;
        }
    }
}
