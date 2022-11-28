package com.javarush.task.task18.task1821;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        ) {
            Map<Character, Integer> map = new HashMap<>();
            int charsInt;
            while ((charsInt = reader.read()) > 0) {
                char chars = (char) charsInt;
                if (map.containsKey(chars)) map.put(chars, map.get(chars) + 1);
                else map.put(chars, 1);
            }
            List<Character> asciiOrder = new ArrayList<>(map.keySet());
            Collections.sort(asciiOrder);
            for (Character data : asciiOrder) {
                System.out.printf("%s %d", data, map.get(data));
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
