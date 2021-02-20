package com.julyatt.demo.create.singleton;

/**
 * Description
 *
 * @author guosh
 * @date 2019-06-27 17:17
 */
public class App {
    public static void main(String[] args) {
        Singleton1.getInstance();
        Singleton2.getInstance();
        Singleton2.getInstance2();

        for (int i = 0; i < 1000; i++) {
            new Thread(() -> System.out.println(Singleton1.getInstance().hashCode())).start();
        }
    }
}
