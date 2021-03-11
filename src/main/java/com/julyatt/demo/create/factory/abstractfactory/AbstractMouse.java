package com.julyatt.demo.create.factory.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description
 * 抽象鼠标
 * @author guosh
 * @date 2019-06-27 16:34
 */
public abstract class AbstractMouse {

    protected static final Logger LOGGER = LoggerFactory.getLogger(com.julyatt.demo.create.factory.simplefactory.AbstractMouse.class);

    /**
     * 鼠标事件
     */
    public abstract void click();
}
