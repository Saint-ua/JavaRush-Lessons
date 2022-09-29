package ua.javarush.task.pro.task17.task1708;

/* 
Мінімальне й максимальне
*/

public class MinMaxUtil {

    public static int min (int min1, int min2) {
        return min1 < min2 ? min1 : min2;
    }

    public static int min (int min1, int min2, int min3) {
        int minimum = min1;
        if (min2 < minimum) minimum = min2;
        else if (min3 < minimum) minimum = min3;
        return minimum;
    }

    public static int min (int min1, int min2, int min3, int min4) {
        int minimum = min1;
        if (min2 < minimum) minimum = min2;
        else if (min3 < minimum) minimum = min3;
        else if (min4 < minimum) minimum = min4;
        return minimum;
    }

    public static int min (int min1, int min2, int min3, int min4, int min5) {
        int minimum = min1;
        if (min2 < minimum) minimum = min2;
        else if (min3 < minimum) minimum = min3;
        else if (min4 < minimum) minimum = min4;
        else if (min5 < minimum) minimum = min5;
        return minimum;
    }

    public static int max (int max1, int max2) {
        return max1 > max2 ? max1 : max2;
    }

    public static int max (int max1, int max2, int max3) {
        int maximum = max1;
        if (max2 > maximum) maximum = max2;
        else if (max3 > maximum) maximum = max3;
        return maximum;
    }

    public static int max (int max1, int max2, int max3, int max4) {
        int maximum = max1;
        if (max2 > maximum) maximum = max2;
        else if (max3 > maximum) maximum = max3;
        else if (max4 > maximum) maximum = max4;
        return maximum;
    }

    public static int max (int max1, int max2, int max3, int max4, int max5) {
        return Math.max(max1, Math.max(Math.max(max2, max3), Math.max(max4, max5)));
    }
}
