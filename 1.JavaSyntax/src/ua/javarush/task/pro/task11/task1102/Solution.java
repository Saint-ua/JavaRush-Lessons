package ua.javarush.task.pro.task11.task1102;

/* 
Земля: технічна характеристика
*/

public class Solution {

    public static void main(String[] args) {
        Planet earth = new Planet();
        Planet name1 = new Planet();
        name1.name = "Земля";
        Planet age1 = new Planet();
        age1.age = 4_540_000_000L;
        Planet speed1 = new Planet();
        speed1.speed = 170_218;
        Planet area1 = new Planet();
        area1.area = 510_072_000;
        earth.printInformation();
    }
}
