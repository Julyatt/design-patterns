package com.julyatt.demo.create.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description
 * 懒汉单例模式
 * @author guosh
 * @date 2019-06-27 17:09
 */
public class Singleton2 {
    String name;
    private static final Logger LOGGER = LoggerFactory.getLogger(Singleton2.class);

    private static Singleton2 singleton2;

    private Singleton2() {
        LOGGER.info("CREATE singleton2");
    }

    /**
     * 线程安全
     * @return
     */
    public static synchronized Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

    /**
     * 使用双重锁 提高性能
     * @return
     */
    public static Singleton2 getInstance2() {
        if (singleton2 == null) {
            synchronized (Singleton2.class) {
                // 双重检查
                if (singleton2 == null) {
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
