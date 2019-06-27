package com.julyatt.demo.decorator;

public class MyLineNumberInputStream extends MyFilterInputStream {
    public MyLineNumberInputStream(MyInputStream myInputStream) {
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
