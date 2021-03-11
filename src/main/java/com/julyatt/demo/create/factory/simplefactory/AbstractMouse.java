package com.julyatt.demo.create.factory.simplefactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 抽象鼠标
 * @author guosh
 * @date 2019-06-27 16:29
 */
public abstract class AbstractMouse {

    protected static final Logger LOGGER = LoggerFactory.getLogger(AbstractMouse.class);

    /**
     * 鼠标方法
     */
    public abstract void click();
}
