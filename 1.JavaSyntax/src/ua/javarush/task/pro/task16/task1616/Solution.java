package ua.javarush.task.pro.task16.task1616;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

/* 
Тренування «Часові зони»
*/

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        TreeSet uno = new TreeSet();
        for (String s : ZoneId.getAvailableZoneIds())
            uno.add(s);
        return uno;
    }

    static ZonedDateTime getBeijingDateTime() {
        Instant timeStamp= Instant.now();
        ZonedDateTime zonedDateTime = timeStamp.atZone(ZoneId.of("Asia/Shanghai"));
        return zonedDateTime;
    }
}
