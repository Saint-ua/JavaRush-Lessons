package ua.javarush.task.pro.task11.task1109;

/* 
Об'єкти внутрішніх і вкладених класів
*/

public class Solution {
    public static void main(String[] args) {
        Outer oc = new Outer();
        Outer.Inner ic = oc.new Inner();
        Outer.Nested two = new Outer.Nested();
    }
}
