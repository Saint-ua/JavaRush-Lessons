package com.javarush.task.task14.task1404;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Коты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String scan;
        boolean ifTrue = true;
        while (ifTrue) {
            scan = bufferedReader.readLine();
            if (scan.equals("")) break;
            Cat cat = CatFactory.getCatByKey(scan);
            System.out.println(cat.toString());
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            switch (key) {
                case "vaska":
                    cat = new MaleCat("Василий");
                    break;
                case "murka":
                    cat = new FemaleCat("Мурочка");
                    break;
                case "kiska":
                    cat = new FemaleCat("Кисюлька");
                    break;
                default:
                    cat = new Cat(key);
                    break;
            }
            return cat;
        }
    }

    static class Cat {
        private final String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
