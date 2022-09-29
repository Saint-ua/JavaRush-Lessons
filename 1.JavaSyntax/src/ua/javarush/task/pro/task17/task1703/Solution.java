package ua.javarush.task.pro.task17.task1703;

import java.util.ArrayList;

/* 
Космічна одіссея ч. 1
*/

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew(){
        Astronaut one = new Human();
        Astronaut two = new Cat();
        Astronaut three = new Dog();
        Astronaut four = new Human();
        astronauts.add(one);
        astronauts.add(two);
        astronauts.add(three);
        astronauts.add(four);
    }

    public static void printCrewInfo() {
        System.out.println("На борт прибули члени екіпажу: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
