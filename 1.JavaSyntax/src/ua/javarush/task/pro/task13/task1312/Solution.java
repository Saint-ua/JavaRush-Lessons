package ua.javarush.task.pro.task13.task1312;

import java.util.HashMap;

/* 
ArrayList і HashMap
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        HashMap<Integer, String> programmingLanguages = new HashMap<>();
        programmingLanguages.put(0, "Java");
        programmingLanguages.put(1, "Kotlin");
        programmingLanguages.put(2, "Go");
        programmingLanguages.put(3, "Javascript");
        programmingLanguages.put(4, "Typescript");
        programmingLanguages.put(5, "Python");
        programmingLanguages.put(6, "PHP");
        programmingLanguages.put(7, "C++");
//        ArrayList<String> programmingLanguages = new ArrayList<>();
//        programmingLanguages.add("Java");
//        programmingLanguages.add("Kotlin");
//        programmingLanguages.add("Go");
//        programmingLanguages.add("Javascript");
//        programmingLanguages.add("Typescript");
//        programmingLanguages.add("Python");
//        programmingLanguages.add("PHP");
//        programmingLanguages.add("C++");
        return programmingLanguages;
    }

}
