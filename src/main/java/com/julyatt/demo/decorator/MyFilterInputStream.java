package com.julyatt.demo.decorator;

public class MyFilterInputStream implements MyInputStream {
    protected MyInputStream myInputStream;

    public MyFilterInputStream(MyInputStream myInputStream) {
        this.myInputStream = myInputStream;
    }

    public int read() {
        return myInputStream.read();
    }

    public void close() {
        myInputStream.close();
    }
}
