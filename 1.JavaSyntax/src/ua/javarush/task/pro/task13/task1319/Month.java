package ua.javarush.task.pro.task13.task1319;

/* 
Місяці в порах року
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        Month[] winter = new Month[3];
        winter[0] = Month.values()[11];
        winter[1] = Month.values()[0];
        winter[2] = Month.values()[1];
        return winter;
    }
    public static Month[] getSpringMonths() {
        Month[] spring = new Month[3];
        spring[0] = Month.values()[2];
        spring[1] = Month.values()[3];
        spring[2] = Month.values()[4];
        return spring;
    }
    public static Month[] getSummerMonths() {
        Month[] summer = new Month[3];
        summer[0] = Month.values()[5];
        summer[1] = Month.values()[6];
        summer[2] = Month.values()[7];
        return summer;
    }
    public static Month[] getAutumnMonths() {
        Month[] autumn = new Month[3];
        autumn[0] = Month.values()[8];
        autumn[1] = Month.values()[9];
        autumn[2] = Month.values()[10];
        return autumn;
    }
}
