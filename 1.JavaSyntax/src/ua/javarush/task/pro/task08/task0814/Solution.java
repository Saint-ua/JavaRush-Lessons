package ua.javarush.task.pro.task08.task0814;

/* 
Прапори
*/

public class Solution {

    public static int setFlag(int number, int flagPos) {
        //напишіть тут ваш код
        // a | (1 << b)
        int i = number | (1 << flagPos);
        return i;
    }

    public static int resetFlag(int number, int flagPos) {
        //напишіть тут ваш код
        // a & ~(1 << b)
        int s = number & ~(1 << flagPos);
        return s;
    }

    public static boolean checkFlag(int number, int flagPos) {
        //напишіть тут ваш код
        // (a & (1 << b)) == (1 << b)
        boolean f = (number & (1 << flagPos)) == (1 << flagPos);
        return f;
    }
}
