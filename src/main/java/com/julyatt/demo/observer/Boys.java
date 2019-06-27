package com.julyatt.demo.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: guosh
 * @date: 2019/6/27
 * @description: 观察者
 **/

public class Boys implements Observer {
    private static final Logger LOGGER = LoggerFactory.getLogger(Boys.class);
    public void wakeUp() {
        LOGGER.info("boys are awake");
    }
}
