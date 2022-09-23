package ua.javarush.task.pro.task09.task0918;

/* 
Попрацюймо зі StringBuilder
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Навчатися, навчатися і ще раз навчатися! ";

        System.out.println(addTo(string, new String[]{"Під ", "лежачий ", "камінь ", "вода ", "не ", "тече"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder bld = new StringBuilder(string);
        String string2 = "";
        for (int i = 0; i < strings.length; i++){
            string2 = string2 + strings[i];
        }
        return bld.append(string2);
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder bld = new StringBuilder(string);
        return bld.replace(start, end, str);
    }
}
