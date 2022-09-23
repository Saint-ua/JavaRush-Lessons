package ua.javarush.task.pro.task05.task0510;

/* 
Трикутний масив
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        //напишіть тут ваш код
        for (int i = 0, n = 1; i < 10; i++, n++) {
            result[i] = new int[n];
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j]=i+j;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
