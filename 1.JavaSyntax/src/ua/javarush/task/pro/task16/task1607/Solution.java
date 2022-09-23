package ua.javarush.task.pro.task16.task1607;

import java.time.LocalDate;
import java.util.Calendar;

/* 
Опанування нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate today = LocalDate.now();
        return today;
    }

    static LocalDate ofExample() {
        LocalDate oldDate = LocalDate.of(2020, 9, 12);
        return oldDate;
    }

    static LocalDate ofYearDayExample() {
        LocalDate oldDate = LocalDate.ofYearDay(2020, 256);
        return oldDate;
    }

    static LocalDate ofEpochDayExample() {
        LocalDate oldDate = LocalDate.ofEpochDay(18517);
        return oldDate;
    }
}
