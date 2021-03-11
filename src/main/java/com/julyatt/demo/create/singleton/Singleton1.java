package com.julyatt.demo.create.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description
 * 饿汉单例模式
 * @author guosh
 * @date 2019-06-27 16:56
 */
public class Singleton1 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Singleton1.class);
    private static final Singleton1 SINGLETON_1 = new Singleton1();

    private Singleton1() {
        LOGGER.info("create singleton1");
    }

    public static Singleton1 getInstance() {
        return SINGLETON_1;
    }
}
