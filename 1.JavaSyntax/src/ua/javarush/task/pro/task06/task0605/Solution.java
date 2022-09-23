package ua.javarush.task.pro.task06.task0605;

/* 
Правильний порядок
*/

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //напишіть тут ваш код
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--){
            if (i >= j) break;
            int x = array[j];
            int y = array[i];
            array[i] = x;
            array[j] = y;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
