package ua.javarush.task.pro.task12.task1206;

/* 
Аналіз рядків
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Гадаю, це буде нова фіча." +
                "Тільки нікому не кажіть, що вона виникла випадково.";

        System.out.println("Кількість цифр у рядку : " + countDigits(string));
        System.out.println("Кількість літер у рядку : " + countLetters(string));
        System.out.println("Кількість пробілів у рядку : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        char[] chars = string.toCharArray();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(chars[i])) count++;
        }
        return count;
    }

    public static int countLetters(String string) {
        char[] chars = string.toCharArray();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(chars[i])) count++;
        }
        return count;
    }

    public static int countSpaces(String string) {
        char[] chars = string.toCharArray();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isSpaceChar(chars[i])) count++;
        }
        return count;
    }
}
