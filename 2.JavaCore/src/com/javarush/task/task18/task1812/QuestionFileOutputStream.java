package com.javarush.task.task18.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    protected AmigoOutputStream amigoOutputStream;

    public static void main(String[] args) {
    }

    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream){
        this.amigoOutputStream = amigoOutputStream;
    }

    public void flush() throws IOException {
        amigoOutputStream.flush();
    }

    public void write(int b) throws IOException {
        amigoOutputStream.write(b);
    }

    public void write(byte[] b) throws IOException {
        amigoOutputStream.write(b);
    }

    public void write(byte[] b, int off, int len) throws IOException {
        amigoOutputStream.write(b, off, len);
    }

    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if ("Д".equals(br.readLine())) amigoOutputStream.close();
    }
}

