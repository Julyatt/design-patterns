package com.julyatt.demo.singleton;

/**
 * Description
 *
 * @author guosh
 * @create 2019-06-27 17:17
 */
public class App {
    public static void main(String[] args) {
        Singleton1.getInstance();
        Singleton2.getInstance();
        Singleton2.getInstance2();
    }
}
