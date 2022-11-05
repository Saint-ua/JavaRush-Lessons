package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imageType) {
        ImageReader reader = null;
        try{
            if (imageType.equals(ImageTypes.JPG)) {
                reader = new JpgReader();
            } else if (imageType.equals(ImageTypes.PNG)) {
                reader = new PngReader();
            } else if (imageType.equals(ImageTypes.BMP)) {
                reader = new BmpReader();
            }
        } catch (Exception e) {
            e.getCause();
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return reader;
    }
}
