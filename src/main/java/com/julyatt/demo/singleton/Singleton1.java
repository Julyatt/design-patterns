package com.julyatt.demo.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description
 * 饿汉单例模式
 * @author guosh
 * @create 2019-06-27 16:56
 */
public class Singleton1 {

    private static final Class clazz = Singleton1.class;
    private static final Logger LOGGER = LoggerFactory.getLogger(clazz);
    private static final Singleton1 singleton1 = new Singleton1();

    private Singleton1() {
        LOGGER.info("create singleton1");
    }

    public static Singleton1 getInstance() {
        return singleton1;
    }
}
