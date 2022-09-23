package ua.javarush.task.pro.task11.task1107;

/* 
Двигун — серце автомобіля
*/

public class Car {
    Engine engine = new Engine();

    public class Engine {
        private boolean isRunning;



        public Engine() {
        }

        public void start() {
            isRunning = true;
        }

        public void stop() {
            isRunning = false;
        }
    }

}
