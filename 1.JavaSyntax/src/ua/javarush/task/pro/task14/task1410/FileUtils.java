package ua.javarush.task.pro.task14.task1410;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class FileUtils {

    public static String readFile(String filePath) throws FileNotFoundException {
        System.out.println("Читаємо вміст файлу " + filePath);
        return filePath;
    }

    public static void writeFile(String filePath) throws FileSystemException {
        System.out.println("Записуємо дані в файл " + filePath);
    }
}
