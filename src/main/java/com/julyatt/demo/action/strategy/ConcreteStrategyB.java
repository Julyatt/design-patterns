package com.julyatt.demo.action.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: guosh
 * @date: 2019/6/27
 * @description: 策略具体类B
 **/

public class ConcreteStrategyB implements Strategy {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteStrategyB.class);

    public void execute() {
        LOGGER.info("我是B方法");
    }
}
