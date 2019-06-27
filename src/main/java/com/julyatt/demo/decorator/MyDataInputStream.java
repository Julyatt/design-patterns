package com.julyatt.demo.decorator;

public class MyDataInputStream extends MyFilterInputStream {
    public MyDataInputStream(MyInputStream myInputStream) {
        super(myInputStream);
    }

    @Override
    public final int read() {
        return myInputStream.read();
    }

    @Override
    public final void close() {
        myInputStream.close();
    }
}
