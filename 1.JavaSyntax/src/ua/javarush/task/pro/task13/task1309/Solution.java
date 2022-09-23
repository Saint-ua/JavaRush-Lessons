package ua.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успішність студентів
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Іван Гуцул", 4.2);
        grades.put("Іван Дідих", 4.5);
        grades.put("Іван Гавруш", 4.6);
        grades.put("Іван Гуйло", 4.7);
        grades.put("Іван Шабаш", 4.99);
    }
}
