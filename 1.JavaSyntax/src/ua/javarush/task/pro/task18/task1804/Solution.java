package ua.javarush.task.pro.task18.task1804;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* 
Знайомство з лямбда-виразом
*/

public class Solution {

    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();

        Collections.addAll(numbers, 123, -6, 12, 0, 44, 5678, -350);

        sortNumbers(numbers);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public static void sortNumbers(ArrayList<Integer> numbers) {
        //version. original task's
//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer i1, Integer i2) {
//                return i1 - i2;
//            }
//        };
//        Collections.sort(numbers, comparator);
        //version. simplified-1
//        Comparator<Integer> comparator = (Integer i1, Integer i2) ->
//        {
//            return i1 - i2;
//        };
//        Collections.sort(numbers, comparator);
        //version. simplified-2
//        Collections.sort(numbers, (Integer i1, Integer i2) ->
//            {
//                return i1 - i2;
//            }
//        );
        //version. simplified-3
//        Comparator<Integer> comparator = (Integer i1, Integer i2) ->
//            i1 - i2;
//        Collections.sort(numbers, comparator);
        //version. simplified-4
        Collections.sort(numbers, (Integer i1, Integer i2) -> i1 - i2);
    }
}
