package com.javarush.task.task18.task1812;

import java.io.IOException;

public abstract class Decorator implements AmigoOutputStream {

    protected AmigoOutputStream amigoOutputStream;

    public Decorator(AmigoOutputStream amigoOutputStream){
        this.amigoOutputStream = amigoOutputStream;
    }

    public abstract void flush() throws IOException;

    public abstract void write(int b) throws IOException;

    public abstract void write(byte[] b) throws IOException;

    public abstract void write(byte[] b, int off, int len) throws IOException;

    @Override
    public void close() throws IOException {

    }
}
