package com.javarush.task.task18.task1814;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    String fileName;

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        if (Pattern.matches("^[^\\s].+\\.(txt|TXT|tXT|TxT|TXt)$", fileName))
            this.fileName = fileName;
        else {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public TxtInputStream(File file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public int read() throws IOException {
        return super.read();
    }

    @Override
    public int read(byte[] b) throws IOException {
        return super.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return super.read(b, off, len);
    }

    public static void main(String[] args) throws FileNotFoundException {

    }
}

