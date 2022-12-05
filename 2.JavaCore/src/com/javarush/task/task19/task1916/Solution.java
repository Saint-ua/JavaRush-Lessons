package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        String file1, file2;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file1 = reader.readLine();
            file2 = reader.readLine();
        }
        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {
            List<String> lines1 = new ArrayList<>();
            List<String> lines2 = new ArrayList<>();
            while (reader1.ready()) {
                lines1.add(reader1.readLine());
            }
            while (reader2.ready()) {
                lines2.add(reader2.readLine());
            }
            int i = 0;
            while (lines1.size() != 0 && lines2.size() != 0) {
                if (lines1.get(i).equals(lines2.get(i))) {
                    lines.add(new LineItem(Type.SAME, lines1.get(i)));
                    lines1.remove(i);
                    lines2.remove(i);
                } else if (lines1.get(i + 1).equals(lines2.get(i))) {
                    lines.add(new LineItem(Type.REMOVED, lines1.get(i)));
                    lines1.remove(i);
                } else {
                    lines.add(new LineItem(Type.ADDED, lines2.get(i)));
                    lines2.remove(i);
                }
            }
            if (lines1.size() > 0) {
                lines.add(new LineItem(Type.REMOVED, lines1.get(i)));
                lines1.remove(i);
            } else if (lines2.size() > 0) {
                lines.add(new LineItem(Type.ADDED, lines2.get(i)));
                lines2.remove(i);
            }
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
