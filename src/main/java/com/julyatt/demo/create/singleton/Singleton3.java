package com.julyatt.demo.create.singleton;

/**
 * 静态内部类 单例 枚举类 单例
 * @author guosh28325
 * @date 2021-02-11
 */
public class Singleton3 {

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        return Singleton3.SingletonInner.singleton3;
    }


    public static class SingletonInner {
        private static Singleton3 singleton3 = new Singleton3();
    }


}
