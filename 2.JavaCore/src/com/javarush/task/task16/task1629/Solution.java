package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Только по-очереди!
*/

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t2.start();

        t1.join();
        t1.printResult();

        t2.join();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        public static String str1;
        public static String str2;
        public static String str3;

        public void run() {
            try {
                String str1 = reader.readLine();
                String str2 = reader.readLine();
                String str3 = reader.readLine();
                Read3Strings.str1 = str1;
                Read3Strings.str2 = str2;
                Read3Strings.str3 = str3;

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public Read3Strings(){
        }

        public void printResult() {
            System.out.printf("%s %s %s\n", str1, str2, str3);
        }

    }

}
