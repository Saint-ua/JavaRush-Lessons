package ua.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Мінімальний елемент масиву
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //напишіть тут ваш код
        int minimum = ints[0];
        for (int i = 0; i < ints.length; i++){
            minimum = Math.min(minimum, ints[i]);
        }
        return minimum;
    }

    public static int[] getArrayOfTenElements() {
        //напишіть тут ваш код
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        return array;
    }
}
