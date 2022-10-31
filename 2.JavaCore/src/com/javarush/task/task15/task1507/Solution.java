package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
        printMatrix( (long) m,n,"9");
    }

    public static void printMatrix(long m, int n, String value) {
        System.out.println("Hi");
        printMatrix(m, (long) n, "adios");
    }

    public static void printMatrix(long m, long n, String value) {
        System.out.println(value + "999");
        printMatrix("A", 3, "xa-xa-xa");
    }

    public static void printMatrix(String m, long n, String value) {
        System.out.println(m+n+value);
        printMatrix("adiokas", "amigokas", "arividerci");
    }

    public static void printMatrix(String m, String n, String value) {
        System.out.printf("%s %s %s \n", m, n, value);
        printMatrix((Object) m, n, value);
    }

    public static void printMatrix(Object m, String n, String value) {
        System.out.println("method N=7");
        printMatrix(m, (Object) n, value);
    }

    public static void printMatrix(Object m, Object n, String value) {
        System.out.println("#8");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(Object m, Object n, Object value) {
        System.out.println("999");
        printMatrix((char) 'A', (char) 'B', (char) 'C');
    }

    public static void printMatrix(char m, char n, char value) {
        System.out.println(m+n+value);
    }
}
