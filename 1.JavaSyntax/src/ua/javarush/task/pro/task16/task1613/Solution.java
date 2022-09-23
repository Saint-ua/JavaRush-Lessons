package ua.javarush.task.pro.task16.task1613;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

import static java.time.DayOfWeek.*;

/* 
Фільтруємо вихідні
*/

public class Solution {

    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;
    private static final int WEEKEND_START_FRIDAY_CUT_OFF_HOUR = 22;
    private static final int WEEKEND_END_SUNDAY_CUT_OFF_HOUR = 23;

    public static void main(String[] args) {
        List<LocalDateTime> dateTimeList = new ArrayList<>();
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 18, 39));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 21, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 22, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 23, 5, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 8, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 22, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 23, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 25, 11, 5));

        for (LocalDateTime dateTime : dateTimeList) {
            System.out.println(dateTime + ", is weekend - " + isWeekend(dateTime));
        }

    }

    public static boolean isWeekend(LocalDateTime dateTime) {
        LocalDate friday = LocalDate.from(dateTime.with(of(FRIDAY)));
        LocalDateTime fridayEvening = friday.atTime(WEEKEND_START_FRIDAY_CUT_OFF_HOUR,0);
        LocalDate sunday = LocalDate.from(dateTime.with(of(SUNDAY)));
        LocalDateTime sundayEvening = sunday.atTime(WEEKEND_END_SUNDAY_CUT_OFF_HOUR, 0);
        if (dateTime.isEqual(fridayEvening) || (dateTime.isAfter(fridayEvening) & dateTime.isBefore(sundayEvening))) {
            return true;
        }
        return false;
    }
}
