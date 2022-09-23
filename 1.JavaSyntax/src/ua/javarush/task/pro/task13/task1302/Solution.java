package ua.javarush.task.pro.task13.task1302;

import java.util.Arrays;
import java.util.HashSet;

import static java.util.Arrays.asList;

/* 
Перевірка наявності
*/

public class Solution {
    public static HashSet<String> words = new HashSet<>(asList("Якби мене попросили вибрати мову взамін на Java, я б не вибирав".split(" ")));

    public static void checkWords(String word) {
//        for (int i = 0, n = words.size(); i < n; i++) {
            if (words.contains(word))
                System.out.println("Слово " + word + " є в множині");
            else System.out.println("Слова " + word + " немає в множині");
        }
//    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
