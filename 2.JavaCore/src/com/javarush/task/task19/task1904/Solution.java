package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] data = fileScanner.nextLine().split(" ");
            Date date = new Date(Integer.parseInt(data[5])-1900,
                    Integer.parseInt(data[4])-1, Integer.parseInt(data[3]));
            Person person = new Person(data[1], data[2], data[0], date);
            return person;
            //Person(String firstName, String middleName, String lastName, Date birthDate)

        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
