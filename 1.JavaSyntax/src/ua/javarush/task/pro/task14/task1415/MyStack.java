package ua.javarush.task.pro.task14.task1415;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* 
Стек в домашніх умовах
*/

public class MyStack {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        storage.add(0, s);
    }

    public String pop() {
        storage.get(0);
        return storage.remove(0);
    }

    public String peek() {
        return storage.get(0);
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public int search(String s) {
        if(storage.contains(s)) return storage.indexOf(s);
        else return -1;
    }
}
