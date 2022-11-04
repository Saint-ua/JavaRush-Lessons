package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanMove {
        void move();
    }

    public interface CanEat {
        void eat();
    }

    public class Dog implements CanMove, CanEat {
        @Override
        public void move() {
            return;
        }

        @Override
        public void eat() {
            return;
        }
    }

    public class Duck implements CanMove, CanEat, CanFly {
        @Override
        public void fly() {
            return;
        }

        @Override
        public void move() {
            return;
        }

        @Override
        public void eat() {
            return;
        }
    }

    public class Car implements CanMove {
        @Override
        public void move() {
            return;
        }
    }

    public class Airplane implements CanMove, CanFly {
        @Override
        public void fly() {
            return;
        }

        @Override
        public void move() {
            return;
        }
    }
}
