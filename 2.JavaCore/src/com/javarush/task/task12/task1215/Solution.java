package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "Мурка";
        }

        @Override
        public Pet getChild(){
            Pet pet = new Cat();
            return pet;
        }
    }

    public static class Dog extends Pet {
        @Override
        public String getName() {
            return "Гавчик";
        }

        @Override
        public Pet getChild(){
            Pet pet = new Dog();
            return pet;
        }
    }

}
