package ua.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишіть тут ваш код
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        if (n>0)
        {
            int[] array = new int[n];
            if (n % 2 != 0)
            {
                for(i = 0; i<n; i++)
                {
                    array[i] = scan.nextInt();
                    System.out.println(array[i]);
                }
            }
            else
            {
                for(i = n-1; i>=0; i--)
                {
                    array[i] = scan.nextInt();
                    System.out.println(array[i]);
                }
            }
        }
    }
}
