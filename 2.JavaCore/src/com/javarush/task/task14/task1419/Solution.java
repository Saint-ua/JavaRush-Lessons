package com.javarush.task.task14.task1419;

import java.io.*;
import java.util.*;


/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {                               //1.ArithmeticException
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {                               //2.NullPointerException
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch(Exception e) {
            exceptions.add(e);
        }

        try {                               //3.StringIndexOutOfBoundsException
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        }
        catch(Exception e) {
            exceptions.add(e);
        }
        //напишите тут ваш код

        try {                               //4.FileNotFoundException
            // Following file does not exist
            File file = new File("E://war/file.txt");
            FileReader fr = new FileReader(file);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {                               //5.NumberFormatException
            // "akki" is not a number
            int num = Integer.parseInt ("akki") ;
            System.out.println(num);
        } catch(Exception e) {
            exceptions.add(e);
        }

        try{                                //6.ArrayIndexOutOfBoundsException
            int[] a = new int[5];
            a[6] = 9; // accessing 7th element in an array of
            // size 5
        }
        catch(Exception e){
            exceptions.add(e);
        }

        try{                                //7.NoSuchElementException
            Set exampleleSet = new HashSet();
            Hashtable exampleTable = new Hashtable();
            exampleleSet.iterator().next();
            //accessing Set

            exampleTable.elements().nextElement();
            //accessing Hashtable

            // This throws a NoSuchElementException as there are
            // no elements in Set and HashTable and we are
            // trying to access elements
        }
        catch(Exception e){
            exceptions.add(e);
        }

        try{                                //8.ClassNotFoundException
            Class.forName("Class1");   // Class1 is not defined
        }
        catch(Exception e){
            exceptions.add(e);
        }

        try{                                //9.IllegalStateException
            List names = new ArrayList<>();
            names.add("Eric");
            names.add("Sydney");

            Iterator iterator = names.iterator();

            while (iterator.hasNext()) {
                iterator.remove();
            }
        }
        catch(Exception e){
            exceptions.add(e);
        }


                                      //10.IllegalArgumentException
        try {
            String string = "Vasko Da Gama";
            if (string.contains("-")) {
                // Split it.
            } else {
                throw new IllegalArgumentException("String " + string + " does not contain -");
            }
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}

